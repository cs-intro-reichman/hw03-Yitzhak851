/**
 * This program get a string (command-line argument), and print it in lower-case
 * letters.
 */
public class LowerCase {
    // declare a class variable
    static String str1, str2;

    /**
     * Returns a string which is identical to the original string,
     * except that all the upper-case letters are converted to lower-case letters.
     * Non-letter characters are left as is.
     */
    public static String lowerCase(String str1) {
        for (int i = 0; i < str1.length(); i++) {
            char character = str1.charAt(i);
            int ascii = (int) character;
            // check: if the character is Upper-case
            if (ascii >= 65 && ascii <= 90) {
                // convert the character to lower-case
                char s = str1.charAt(i + 57);
                str2 += s;
            } else if (str1.charAt(i) >= 48 && str1.charAt(i) <= 57) {
                str2 += str1.charAt(i);
            }
        }
        return str1;
    }

    public static void main(String[] args) {

        str1 = args[0]; // "ADAM";

    }
}
