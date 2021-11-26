package data_structure.TCS_NQT;

import java.util.*;
public class SoberWalk {
//    Amarasimha wanted to know the final position of a person, who starts from the origin 0 0 and travels
//    per following scheme.
//• He first turns and travels 10 units of distance
//• His second turn is upward for 20 units
//• Third turn is to the left for 30 units
//• Fourth turn is the downward for 40 units
//• Fifth turn is to the right(again) for 50 units
//… And thus he travels, every time increasing the travel distance by 10 units

    public static void main(String[] args) {

        int x = 0, y = 0;
        int d = 10;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char c = 'R';
        while (n-- != 0){
            switch (c){

                case 'R':
                    x+=d;
                    d+=10;
                    c = 'U';
                    break;
                case 'U':
                    y+=d;
                    d+=10;
                    c='L';
                    break;
                case 'L':
                    x-=d;
                    d+=10;
                    c='D';
                    break;
                case 'D':
                    y-=d;
                    d+=10;
                    c='A';
                    break;
                case 'A':
                    x+=d;
                    d+=10;
                    c='R';
                    break;
            }
        }
        System.out.println(x+ " " +y);

    }
}
