public class UniqueChars {
        // declare variables
        static String str1, str2;
        static char tempChar;
        static int i,j;

    public static void uniqueChars(String str1) {
        for (i = 0; i < str1.length() ; i++) {
            tempChar = str1.charAt(i);
            if (i==0) {
                str2 += tempChar;
            } else {
                checkingDouble(tempChar);
            }
        }
    }

    public static void checkingDouble(char tempChar) {
        for (j = 0 ; j < str2.length(); j++) {
            if (str2.charAt(j) == tempChar) {
                break;
            } else {
                str2 += tempChar;
            }
        }
    }
    public static void main(String[] args) {  
        str1 = "committe";
        str2 = "";
        uniqueChars(str1);
        System.out.println(str2);
    }

}
