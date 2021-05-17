package passwordgenerator;

import java.util.Random;

public class PasswordGenerator {

    static Random random = new Random();
    static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    static final String DIGITS = "0123456789";
    static final String SPECIALS = "!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~";

    public static void main(String[] args) {
    }

    public static String generatePassword(int length, boolean includeUppercase, boolean includeLowercase, boolean includeDigits, boolean includeSpecials) {
        String charactersToUse = "";

        if (includeUppercase) {
            charactersToUse += UPPERCASE;
        }
        if (includeLowercase) {
            charactersToUse += LOWERCASE;
        }
        if (includeDigits) {
            charactersToUse += DIGITS;
        }
        if (includeSpecials) {
            charactersToUse += SPECIALS;
        }

        String passwordToReturn = "";
        for (int i = 0; i < length; i++) {
            int randomPos = random.nextInt(charactersToUse.length());
            passwordToReturn += charactersToUse.charAt(randomPos);

        }
        System.out.println(passwordToReturn);
        return passwordToReturn;
    }

}
