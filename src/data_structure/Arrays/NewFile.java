package data_structure.Arrays;

public class NewFile {
    public static void main(String[] args) {

        int[] arr = new int[]{5,8,2,9,10,1,14,7,6,12,0,3};

        int m = 333,n = 11;
        while (m >= n){
            m = m-n;
        }
        System.out.println(m);

        System.out.println(mat(6));


    }

    private static int mat(int x) {
        if(x == 0)
            return 0;
        else
            return 1 + mat(x-1);
    }
}
