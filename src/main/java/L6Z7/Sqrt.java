package L6Z7;

public class Sqrt {

    public static void main(String[] args) {

            int number = -1;
            if(number >= 0){
                System.out.println(Math.sqrt(number));
            }
            else throw new IllegalArgumentException();

    }
}
