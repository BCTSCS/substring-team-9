import java.io.IOException;
import java.util.ArrayList;

public class Poem {

    private String title;
    private ArrayList<String> lines;

    public Poem(String title, String filename) throws IOException {
        this.title = title;
        this.lines = FileOperator.getStringData(filename);
    }

    public void printPoem() {
        System.out.println(title);
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
