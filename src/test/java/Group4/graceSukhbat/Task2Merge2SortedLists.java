package Group4.graceSukhbat;

import java.util.Collections;
import java.util.LinkedList;

public class Task2Merge2SortedLists {
    // Task # 2 Merge Two Sorted Lists

    public static LinkedList<Integer> mergeTwoSortedList(LinkedList<Integer> list1, LinkedList<Integer> list2){
        LinkedList<Integer> merged = new LinkedList<>();
        merged.addAll(list1);
        merged.addAll(list2);
        Collections.sort(merged);
        return merged;
    }
}
