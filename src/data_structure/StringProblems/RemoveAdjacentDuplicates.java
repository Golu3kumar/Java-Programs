package data_structure.StringProblems;

public class RemoveAdjacentDuplicates {

    public static void main(String[] args) {

        String input = "geeksforgeek";
        String input2 = "acaaabbbacdddd";
        String result = remove(input);
        System.out.println(result);
    }

    private static String remove(String input) {
        StringBuilder result = new StringBuilder();
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            count++;
            if (i + 1 >= input.length() || input.charAt(i) != input.charAt(i + 1)) {
                if (count == 1) {
                    result.append(input.charAt(i));
                }
                count = 0;
            }
        }
        return result.toString();
    }
}
