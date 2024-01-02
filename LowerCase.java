public class LowerCase {
    // declare variables
    static String str1, str2, tempStr;
    static char isTemp;
    static int i;

    public static void main(String[] args) {
        str1 = args[0];
        str2 = "";
        lowerCase(str1);
        System.out.println(str2);
    }

    public static void lowerCase(String str1) {
        for (i = 0; i < str1.length(); i++) {
            // temporary char
            isTemp = str1.charAt(i);
            // temporary string
            tempStr = "";
            tempStr += isTemp;
            // call function that convert char from upperCase to lowerCase
            // if true, she add lower case to str2 + break with add 1 to i
            // if false, add to str2 ==> than break with add 1 to i
            convertTolower(tempStr);
            // after finishing loop, str2 = different value
        }
    }

    public static void convertTolower(String tempStr) {
        switch (tempStr) {
            case "A":
                str2 += "a";
                break;
            case "B":
                str2 += "b";
                break;
            case "C":
                str2 += "c";
                break;
            case "D":
                str2 += "d";
                break;
            case "E":
                str2 += "e";
                break;
            case "F":
                str2 += "f";
                break;
            case "G":
                str2 += "g";
                break;
            case "H":
                str2 += "h";
                break;
            case "I":
                str2 += "i";
                break;
            case "J":
                str2 += "j";
                break;
            case "K":
                str2 += "k";
                break;
            case "L":
                str2 += "l";
                break;
            case "M":
                str2 += "m";
                break;
            case "N":
                str2 += "n";
                break;
            case "O":
                str2 += "o";
                break;
            case "P":
                str2 += "p";
                break;
            case "Q":
                str2 += "q";
                break;
            case "R":
                str2 += "r";
                break;
            case "S":
                str2 += "s";
                break;
            case "T":
                str2 += "t";
                break;
            case "U":
                str2 += "u";
                break;
            case "V":
                str2 += "v";
                break;
            case "W":
                str2 += "w";
                break;
            case "X":
                str2 += "x";
                break;
            case "Y":
                str2 += "y";
                break;
            case "Z":
                str2 += "z";
                break;
            default: 
                str2 += tempStr;
                break;
        }
        
    }
}
