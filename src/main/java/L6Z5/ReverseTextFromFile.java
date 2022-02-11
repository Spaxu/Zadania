package L6Z5;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReverseTextFromFile {
    public static void main(String[] args) {

        try {
            BufferedReader reader =
                    Files.newBufferedReader(Paths.get("C:\\data.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(new StringBuilder(line).reverse());

            }
        } catch (
                IOException exception) {
            exception.printStackTrace();
        }
    }
}
