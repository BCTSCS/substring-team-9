import java.util.ArrayList;

public class Poem {

    private String title;              // The title of the poem
    private ArrayList<String> lines;   // The lines of the poem

    public Poem(String t, ArrayList<String> l) {
        title = t;
        lines = l;
    }

    public String toString() {
        String out = title + "\n\n";
        for (String line : lines) {
            out += line + "\n";
        }
        return out;
    }
    
    public static void main(String[] args) {
        Poem p = new Poem("Harlem", FileOperator.getStringData("poem"));
        System.out.println(p);
    }
}
