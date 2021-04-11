import java.security.SecureRandom;
import java.util.Random;

public class RandomAlphaNumericGenerator {
    public static String generateFamilyCode() {
        final int CODE_LENGTH = 6;
        final String ALPHABET = "0123456789abcdefghijklmnopqrstuvwxyz";
        final Random RANDOM = new SecureRandom();
        StringBuilder returnValue = new StringBuilder(CODE_LENGTH);
        for (int i = 0; i < CODE_LENGTH; i++) {
            returnValue.append(ALPHABET.charAt(RANDOM.nextInt(ALPHABET.length())));
        }
        return new String(returnValue);
    }

    public static void main(String[] args) {
        System.out.println(generateFamilyCode().toUpperCase());
    }
}
