package Group1.Alonina_Olga;

import java.util.Arrays;
import java.util.Collections;

public class Group1_Java_Tasks {
    //Alonina Olga i will get line 4 till 50
    public static boolean checkPalindrome(String str) {
        String[] unmod = str.split( "" );
        String[] temp = str.split( "" );
        Collections.reverse( Arrays.asList( temp ) );
        if (Arrays.equals( unmod, temp )) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println( checkPalindrome( "watermelon" ) );
        System.out.println( checkPalindrome( "racecar" ) );
    }

    //Ayse Demirhan
}
