package data_structure.StringProblems;

public class RemoveDuplicatesFromString {


    public static void main(String[] args) {

        String input = "laptop";
        String result = removeDuplicates(input);
        System.out.println(result);
    }

    private static String removeDuplicates(String input) {
        StringBuilder result = new StringBuilder();
        int len = input.length();
        for (int i = 0; i < len; i++) {
            char c = input.charAt(i);

            if (result.toString().indexOf(c) < 0)
                result.append(c);
        }
        return result.toString();
    }
}
