package L6Z4;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LookForward {
    public static void main(String[] args) {

        try {
            BufferedReader reader =
                    Files.newBufferedReader(Paths.get("C:\\Users\\Spax\\Desktop\\data.txt"));
            int count = 0;
            String line;
            while ((line = reader.readLine()) != null) {
                if(line.contains("Linia2")){
                    System.out.println("Yup");
                }
                else System.out.println("Nope");
                ++count;
            }
        } catch (
                IOException exception) {
            exception.printStackTrace();
        }
    }
}
