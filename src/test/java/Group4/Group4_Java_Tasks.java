package Group4;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Group4_Java_Tasks {

    // LINES 7-150   --> JAMIL
    // LINES 151-300 --> GRACE
    // LINES 301-450 --> YASEMIN


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





















































































































        // Task # 1 Palindrome Checker - Grace
    public static boolean isPalindrome(String str){
            String reverseStr = "";
        for (int i = str.length()-1; i >= 0; i--) {
            reverseStr += str.charAt(i);
        }
        return str.equalsIgnoreCase(reverseStr);
    }

        // Task # 2 Merge Two Sorted Lists

    public static LinkedList<Integer> mergeTwoSortedList(LinkedList<Integer> list1, LinkedList<Integer> list2){
            LinkedList<Integer> merged = new LinkedList<>();
                merged.addAll(list1);
                merged.addAll(list2);
                Collections.sort(merged);
            return merged;
    }













    }
















































































































































































