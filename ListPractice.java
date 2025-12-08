import java.util.*;
public class ListPractice {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add( "syntax");
        list.add( "parser");
        list.add( "token");
        list.add( "lexical");

        for (String i : list) {
            System.out.println(i);
        }

        for (int i=0;i<list.size();i++) {
            System.out.println(list.get(i).toUpperCase() + " "+i);
        }

        for (String i : list) {
            if (i.length()>5) {
                System.out.println(i);
            }
        }
    }
}
