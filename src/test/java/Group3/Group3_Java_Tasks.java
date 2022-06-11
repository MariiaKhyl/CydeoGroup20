package Group3;

import java.util.ArrayList;

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




    /*
    You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function,
but instead be stored inside the array nums1. To accommodate this,
nums1 has a length of m + n, where the first m elements denote the elements that should be merged,
 and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
     */

    public static int[] mergeArr(int[] arr,int[]arr2, int num1, int num2){

        int [] result = new int[num1+num2];

        for (int i = 0; i < num1 ; i++) {
            result[i] = arr[i];
        }
        for (int i = num1, j =0; i <num1+num2 ; i++) {
            result[i] = arr2[j];
            j++;
        }
        return result;
    }

































































































































    public static boolean PalindromeCheck(String str) {

        String reverse = "";

        for (int j = str.length() - 1; j >= 0; j--) {

            reverse += str.charAt(j);
        }
        return str.equalsIgnoreCase(reverse);

    }
}













































