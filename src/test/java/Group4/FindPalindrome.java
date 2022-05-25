package Group4;


    //Jamil--> using StringBuffer


    public class FindPalindrome {

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
    }

