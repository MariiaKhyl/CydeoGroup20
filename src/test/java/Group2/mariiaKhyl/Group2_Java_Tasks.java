package Group2.mariiaKhyl;

public class Group2_Java_Tasks {

// Mariia Khyl - lines 10-54




    /*
First task:
Check whether a string is a PALINDROME or not.
Since you share the same class, make sure use different method name to prevent error,
and no need to have main method in your class.
Just create the method. And your method will return a boolean.

        Scanner scanner = new Scanner (System.in);

        String word = scanner.nextLine();
        String newWord = "";

        for (int i = word.length()-1; i >=0 ; i--) {

            newWord += word.charAt(i);
            System.out.println(newWord);
        }
            if(word.equalsIgnoreCase(newWord)){
                System.out.println("Palindrome");
            }else{
                System.out.println("Non Palindrome");
            }
 */
    public static String palindromeGitTest (String wordToCheck ){

        String palindromeCheck = "";

        for (int j = wordToCheck.length()-1; j >= 0 ; j--){

            palindromeCheck += wordToCheck.charAt(j);

        }

        if (wordToCheck.equalsIgnoreCase(palindromeCheck)){
            return "PALINDROME";
        }else{
            return "NON PALINDROME";
        }

    }

    public static void main(String[] args) {
        System.out.println(palindromeGitTest("level"));
    }



}
