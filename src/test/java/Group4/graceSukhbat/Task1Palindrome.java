package Group4.graceSukhbat;

public class Task1Palindrome {
    // Task # 1 Palindrome Checker - Grace
    public static boolean isPalindrome(String str){
        String reverseStr = "";
        for (int i = str.length()-1; i >= 0; i--) {
            reverseStr += str.charAt(i);
        }
        return str.equalsIgnoreCase(reverseStr);
    }
}
