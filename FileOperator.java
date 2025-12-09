import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public final class FileOperator {

    private static File myFile;          // The File containing the data
    private static Scanner fileReader;

    public static void createFile(String name) {
        try {
            myFile = new File(name);
            fileReader = new Scanner(myFile);
        } catch (IOException e) {
            System.out.println("File not found!");
        } finally {
            System.out.println("Continue.");
        }
    }

    public static ArrayList<String> getStringData(String name) {
        createFile(name);
        ArrayList<String> out = new ArrayList<String>();
        while (fileReader.hasNextLine()) {
            out.add(fileReader.nextLine());
        }
        return out;
    }

}
