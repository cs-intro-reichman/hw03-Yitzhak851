public class LowerCase {
    static String str1, str2;

    public static String lowerCase(String str1) {
        for (int i = 0; i < str1.length(); i++) {
            char character = str1.charAt(i);
            int ascii = (int) character;
            if (ascii >= 65 && ascii <= 90) {
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
