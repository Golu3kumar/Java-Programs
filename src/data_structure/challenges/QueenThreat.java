package data_structure.challenges;

public class QueenThreat {

    // In this problem statement, There are Coordinates of King and Queen.
    // We have to determine whether King threats the Queen or not.
    // Inputs : Coordinates are as Kx = 2, Ky = 3 and Qx = 2, Qy = 7
    // Output : true (Yes Queen is threaten by the King).
    // Note : Understand the logic very well!
    public static void main(String[] args) {

        try {
            boolean result = isThreat(2, 3, 2, 7);
            if (result)
                System.out.println("Sorry Queen, Ready for die!");
            else
                System.out.println("Try again King!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static boolean isThreat(int Kx, int Ky, int Qx, int Qy) throws Exception {
        // first we need to define edge cases
        if (Kx > 8 || Ky > 8 || Qx > 8 || Qy > 8) {
            System.out.println("Coordinates are not great!");
            throw new Exception("Error in Coordinates");
        }

        return Kx == Qx || Ky == Qy || Math.abs(Kx - Ky) == Math.abs(Qx - Qy);
    }
}
