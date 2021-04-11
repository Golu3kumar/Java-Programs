public class ReverseString {
    public static void main(String[] args) {
        String rev = "Golu";
        String result = "";
        for (int i = 0; i < (rev.length()); i++) {
            int other = rev.length()-i-1;
            char temp = rev.charAt(other);
            result+=temp;
        }

        System.out.println(result);
    }
}
