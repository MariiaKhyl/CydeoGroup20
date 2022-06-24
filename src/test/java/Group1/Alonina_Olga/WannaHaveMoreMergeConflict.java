package Group1.Alonina_Olga;

import java.sql.Driver;

public class WannaHaveMoreMergeConflict {
    public static String altPairs(String str) {
        String altPairs = "";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            altPairs += str.charAt( i );
            count += 1;
            if (count == 2) {
                i += 2;
                count = 0;
            }
        }
        return altPairs;
    }

    public static void main(String[] args) {
        System.out.println( altPairs( "kitten" ) );
        System.out.println( altPairs( "Chocolate" ) );
        System.out.println( altPairs( "CodingHorror" ) );
    }

}