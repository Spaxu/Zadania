package L5Z1;

public class Tekst {
    public static void main(String[] args) {
        String testString = "oko";

        if(!testString.isEmpty()){
            System.out.println("String is not empty.");
        }


        if(!testString.isEmpty()){
            String palindrome = new StringBuilder(testString).reverse().toString();
            if(palindrome.equals(testString)){
                System.out.println("Palindrome!");
            }
        }

        if(!testString.isEmpty()){

            System.out.println(testString.length());
        }

    }
}
