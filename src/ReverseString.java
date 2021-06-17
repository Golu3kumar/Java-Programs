public class ReverseString {
    public static void main(String[] args) {
        String rev = "Golu";
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < (rev.length()); i++) {
            int other = rev.length()-i-1;
            char temp = rev.charAt(other);
            result.append(temp);
        }

        System.out.println(result);
    }
}
