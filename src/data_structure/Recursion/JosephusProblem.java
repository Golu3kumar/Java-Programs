package data_structure.Recursion;

public class JosephusProblem {

    //there is a person Josephus that kills every kth position person in a group of n people
    // till there is only one person left in the group. He left one person keep alive.
    // so find who is that one.
    public static void main(String[] args) {

        int n = 5;
        int k = 2;

        int alivePerson = whoIsOne(n,k);
        // look if the index is 0 based then this is the answer.
        System.out.println(alivePerson);

        // but if index is 1 based then answer is alivePerson + 1
        System.out.println(alivePerson+1);
    }

    private static int whoIsOne(int n, int k) {
        if (n == 1)
            return 0;
        int x = whoIsOne(n-1,k);
        int y = (x + k)%n;
        return y;
    }
}
