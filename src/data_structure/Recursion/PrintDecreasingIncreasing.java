package data_structure.Recursion;

public class PrintDecreasingIncreasing {

    // input : An integer 5
    // Output : 5 4 3 2 1 1 2 3 4 5
    public static void main(String[] args) {

        int num = 5;
        pdi(num);
    }

    private static void pdi(int num) {
        if (num <= 0)
            return;
        System.out.println(num);
        pdi(num-1);
        System.out.println(num);
    }
}
