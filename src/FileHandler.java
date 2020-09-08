import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileHandler {
    public static int numberOfLines(String fileLocation) {

        int lines = 0;
        try {

            File file = new File(fileLocation);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {

                String a = scanner.nextLine();
                lines++;
            }

        } catch (FileNotFoundException e) {
            System.out.println("file not found");
            return -1;
        }
        return lines;
    }
}
