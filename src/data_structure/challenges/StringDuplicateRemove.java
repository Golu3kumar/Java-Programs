package data_structure.challenges;

import java.util.Scanner;

public class StringDuplicateRemove {


    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<string.length();i++){
            if (sb.toString().indexOf(string.charAt(i)) < 0 || string.charAt(i) == ' ')
                sb.append(string.charAt(i));
        }

        System.out.println(sb);
    }
}
