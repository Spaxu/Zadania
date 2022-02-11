package L6Z6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ToUpperAndSave {

    public static void main(String[] args) {

        try {
            BufferedReader reader =
                    Files.newBufferedReader(Paths.get("C:\\Users\\Spax\\Desktop\\data.txt"));
            FileWriter fw = new FileWriter("C:\\Users\\Spax\\Desktop\\output.txt");
            String line;
            while ((line = reader.readLine()) != null) {

                fw.write(line.toUpperCase() + "\n");

            }
            fw.close();
        } catch (
                IOException exception) {
            exception.printStackTrace();
        }
    }
}
