package Group3;

public class Group3_Java_Tasks {


    // LINES 7-150   --> Semih
    // LINES 151-300 --> Cristina
    // LINES 301-450 --> Igor


    public static boolean isPalindrome(String str) {

        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {

            reverse += str.charAt(i);
        }
        return str.equalsIgnoreCase(reverse);

    }

    public static boolean PalindromeCheck(String str) {

        String reverse = "";

        for (int j = str.length() - 1; j >= 0; j--) {

            reverse += str.charAt(j);
        }
        return str.equalsIgnoreCase(reverse);

    }
}













































