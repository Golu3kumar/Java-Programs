package data_structure.challenges;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToNumber {

    public static void main(String[] args) {

        // Let's prepare dictionary
        Map<Character,Integer> dict = new HashMap<>(){
            {
                put('I',1);
                put('V',5);
                put('X',10);
                put('L',50);
                put('C',100);
                put('D',500);
                put('M',1000);
            }
        };
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] arr = new String[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.next();
        }

        for(String each : arr){
            each = each.toUpperCase();
            int len = each.length()-1;
            char last = each.charAt(len);
            int number = dict.get(last);
            len--;
            while (len >= 0){
                char next = each.charAt(len);
                char prev = each.charAt(len+1);
                if(dict.get(next) < dict.get(prev)){
                    number-=dict.get(next);
                }else if(dict.get(next) >= dict.get(prev)){
                    number+=dict.get(next);
                }
                len--;
            }
            System.out.println(number);
        }
    }
}
