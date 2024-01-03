public class UniqueChars {
    // declare variables
    static String str1, str2;

    public static void main(String[] args) {
        str1 = args[0];
        str2 = "";
        uniqueChars();
        System.out.println(str2);
    }

    public static void uniqueChars() {
        for (int i = 0; i < str1.length(); i++) {
            int j = 0;
            boolean flag = true;
            if (i == 0) {
                str2 += str1.charAt(i);
            }
            if (i > 0) {
                if (str1.charAt(i) == ' ') {
                    str2 += str1.charAt(i);
                } else {
                    // check if the character is already in the string
                    while (j < i && j < str2.length()) {
                        // if the character is already in the string, set flag to false
                        if (str1.charAt(i) == str2.charAt(j) ) {
                            flag = false;
                        }
                        j++;
                    }
                    // if the character is not in the string, add it to the string
                    if (flag) {
                        str2 += str1.charAt(i);
                    }
                }
            }
        }
    }
}
