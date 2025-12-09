import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public final class FileOperator {

    private static File myFile;          // The File containing the data
    private static Scanner fileReader;

    public static ArrayList<String> getStringData(String filename) throws IOException {
        myFile = new File(filename);
        fileReader = new Scanner(myFile);
        ArrayList<String> out = new ArrayList<String>();
        while (fileReader.hasNextLine()) {
            out.add(fileReader.nextLine());
        }
        return out;
    }

}
