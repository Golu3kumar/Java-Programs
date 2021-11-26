package data_structure.Recursion;

// Recursion : Recursion is a function that call itself.
// It divide the work in similar small chunk of codes and repeat on self.
public class DecToBin {

    // Program to find Binary from Decimal
    // Dec - 7
    // Bin - 111

    public static void main(String[] args) {

        int decNum = 45;
        String binNum = findBin(decNum,"");
        System.out.println("Binary Number : "+binNum);
    }

    private static String findBin(int decNum, String result) {
        if (decNum == 0)
            return result;

        result = decNum%2 + result;
        return findBin(decNum/2,result);
    }

}
