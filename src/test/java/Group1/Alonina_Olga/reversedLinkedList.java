package Group1.Alonina_Olga;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class reversedLinkedList {
    //Alonina Olga
    public static LinkedList<Integer> reversedLinkedList(LinkedList<Integer> list){
        Collections.reverse( list );
        return list;

    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList( 1,2,3,4,5));
        System.out.println( "reversedLinkedList( list ) = " + reversedLinkedList( list ) );
    }
}

