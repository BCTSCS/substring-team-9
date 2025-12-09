import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public final class FileOperator {

    private static File myFile;          
    private static Scanner fileReader;

    public static ArrayList<String> getStringData(String filename) throws IOException {

        ArrayList<String> data = new ArrayList<>();

        myFile = new File(filename);
        fileReader = new Scanner(myFile);

        while (fileReader.hasNextLine()) {
            String line = fileReader.nextLine();
            data.add(line);
        }

        fileReader.close();
        return data;
    }

    public static void main(String[] args) throws IOException {

        Poem myPoem = new Poem("My Poem", "poem.txt");
        myPoem.printPoem();
    }
}


