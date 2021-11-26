package data_structure.challenges;

public class StringCompression {
    // Demo :
    // 1.Input : "aabccccaaa"
    // Output : "a2b1c4a3"
    // 2.Input : "abcd"
    // Output : "abcd"
    // Note : Assume strings are in lower case.

    public static void main(String[] args) {

        String str = "aaaabbBcddee";
        String result = stringCompression(str, str.length());
        System.out.println("Compressed String : " + result);
    }

    private static String stringCompression(String str, int length) {
        // first we need to write the edge cases
        if (length < 0)
            return null;
        StringBuilder compressedString = new StringBuilder();
        int consecutiveCount = 0;
        for (int i = 0; i < length; i++) {
            consecutiveCount++;
            if (i + 1 >= length || str.charAt(i) != str.charAt(i + 1)) {
                compressedString.append(str.charAt(i));
                compressedString.append(consecutiveCount);
                consecutiveCount = 0;
            }
        }

        return compressedString.length() < str.length() ? compressedString.toString() : str;

    }
}
