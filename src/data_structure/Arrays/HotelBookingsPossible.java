package data_structure.Arrays;

public class HotelBookingsPossible {

    //A hotel manager has to process N advance bookings of rooms for the next season.
    // His hotel has C rooms. Bookings contain an arrival date and a departure date.
    // He wants to find out whether there are enough rooms in the hotel to satisfy the demand.
    // Write a program that solves this problem in time O(N log N) .

//    Example Input
//    Input 1:
//    A = [1, 3, 5]
//    B = [2, 6, 8]
//    C = 1

//    Example Output
//    Output 1:  0
//    Example Explanation
//    Explanation 1:
//    At day = 5, there are 2 guests in the hotel. But I have only one room.

    public static void main(String[] args) {

        int[] arrival = {1,3,6};
        int[] depart = {2,9,8};
        int C = 2;

        boolean isAllRoomAllotted = checkRoomAllocation(arrival,depart,C);
        System.out.println(isAllRoomAllotted);
    }

    private static boolean checkRoomAllocation(int[] arrival, int[] depart, int c) {
        if (arrival.length != depart.length)
            return false;

        int i = 0,j = 0;
        while (i< arrival.length && j< depart.length){
            if (arrival[i] < depart[j]){
                i++;
                c--;
            }else if(arrival[i] == depart[j]){
                j++;
                i++;
            }else{
                c++;
                j++;
            }
            if(c < 0)
                return false;
        }
        return true;
    }

}
