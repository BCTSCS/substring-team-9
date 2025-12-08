import java.util.ArrayList;
public class ListPractice {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        a.add("syntax");
        a.add("parser");
        a.add("token");
        a.add("lexical");
        System.out.println("Enhanced For Loop:");
        for (String w : a) {
            System.out.println(w);
        }
        System.out.println("\nTraditional For Loop: ");
        for (int i = 0; i < a.size(); i++) {
            System.out.println(i + ": " + a.get(i).toUpperCase());
        }
        System.out.println("\nWords with more than 5 letters:");
        for (String w : a) {
            if (w.length() > 5) {
                System.out.println(w);
            }
        }
    }
}
