package Group4;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Group4_Java_Tasks {

    // LINES 7-150   --> JAMIL

    //Jamil--> using StringBuffer

        public static void getPalindrome(String words){

            StringBuffer words2 = new StringBuffer(words);//Created new StringBuffer
            words2.reverse();//reverse()Method from StringBuffer
            String words3 = words2.toString();//Converted StringBuffer to string

            if (words.equals(words3)){
                System.out.println("\n\t\""+words+"\" is palindrome");
            }
            else {
                System.out.println("\n\t\""+words+"\" is not palindrome");
            }
        }

        public static void main(String[] args) {

            String words = "ABA";
            getPalindrome(words);

        }

// Task#2 will be added here


    }
















































































































































































