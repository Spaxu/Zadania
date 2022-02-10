package L6Z3;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
public class ReadSecondLine {
    public static void main(String[] args) {

        try {
            BufferedReader reader =
                    Files.newBufferedReader(Paths.get("C:\\Users\\Spax\\Desktop\\data.txt"));
            int count = 0;
            String line;
            while ((line = reader.readLine()) != null) {
                if (count % 2 == 0) {
                    System.out.println(line);
                }
                ++count;
            }
        } catch (
                IOException exception) {
            exception.printStackTrace();
        }
    }
}
