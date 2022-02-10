package L6Z33;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadAndCount {
    public static void main(String[] args) {
        try {
            BufferedReader reader =
                    Files.newBufferedReader(Paths.get("C:\\Users\\Spax\\Desktop\\data.txt"));
            int charCount = 0;
            String data;
            while((data = reader.readLine()) != null) {
                charCount += data.length();
            }
            System.out.println(charCount);
        } catch (
                IOException exception) {
            exception.printStackTrace();
        }
    }


}

