package L6Z1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Data {
    public static void main(String[] args) {
        String userHomeFolder = System.getProperty("user.home") + "/Desktop";
        File file = new File(userHomeFolder);

        try {
            Files.writeString(Paths.get(userHomeFolder), "Kurs\nJava\nLekcja 6\nPliki\nWyjątki\nPliki\nKoniec pliku");
        } catch (IOException exception) {
            exception.printStackTrace();
        }

    }
}
