package data_structure.PatternPrinting;

//           *
//
//           * *
//
//           * * *
//
//           * * * *
//
//           * * * * *
public class RightTrianglePattern {

    public static void main(String[] args) {

        int n = 5;
        String s = "*";
        for(int i = 0;i<n;i++){
            System.out.println(s);
            s += " *";
        }
    }
}
