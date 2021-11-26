package data_structure.StringProblems;

public class StringFrequency {

    public static void main(String[] args) {

        String input = "aaaabbBcddee";

        String result = frequency(input);
        System.out.println(result);
    }

    private static String frequency(String input) {
        if (input.length() <= 0)
            return null;
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            count++;
            if (i + 1 >= input.length() || input.charAt(i) != input.charAt(i+1)){
                sb.append(input.charAt(i));
                sb.append(count);
                count = 0;
            }

        }
        return sb.toString();
    }
}
