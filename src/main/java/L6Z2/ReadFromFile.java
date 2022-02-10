package L6Z2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadFromFile {

    public static void main(String[] args) {
        try {
            String content = Files.readString(Paths.get("C:\\Users\\Spax\\Desktop\\data.txt"));
            System.out.println(content);
        } catch (
                IOException exception) {
            exception.printStackTrace();
        }
    }


}
