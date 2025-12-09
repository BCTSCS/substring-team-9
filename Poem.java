import java.util.ArrayList;

public class Poem {
    private String title;
    private ArrayList<String> lines;
    public Poem(String title, String filename) {
        this.title = title;
        this.lines = FileOperator.getStringData(filename);
    }
    public String getTitle() {
        return title;
    }
    public ArrayList<String> getLines() {
        return lines;
    }
}
