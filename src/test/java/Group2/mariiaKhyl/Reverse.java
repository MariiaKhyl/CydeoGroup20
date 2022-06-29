package Group2.mariiaKhyl;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Reverse {

    public static void main(String[] args) {
        LinkedList<String> week = new LinkedList<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Saturday", "Sunday"));
        System.out.println(reversedLinkedList(week));
    }

    public static LinkedList<String> reversedLinkedList(LinkedList<String> week) {
        Collections.reverse(week);
        return week;
    }


}
