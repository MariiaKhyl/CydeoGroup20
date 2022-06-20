package Group1.Alonina_Olga;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static List<String> fizzBuzz(int num) {
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result.add("FizzBuzz");
            }
            else if (i % 3 == 0) {
                result.add("Fizz");
            }
            else if ( i % 5 == 0) {
                result.add( "Buzz");
            }else {
                result.add("" + i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println( fizzBuzz( 3 )  );
        System.out.println( fizzBuzz( 5 )  );
        System.out.println( fizzBuzz( 15 )  );
    }
}
