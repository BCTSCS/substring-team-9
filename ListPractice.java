import java.util.*;

public class ListPractice {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("syntax");
        myList.add("parser");
        myList.add("token");
        myList.add("lexical");

        for (String i : myList) {
            System.out.println(i);
        }
    
        for (int j = 0; j < myList.size(); j ++) {
            System.out.println("Word: '" + myList.get(j).toUpperCase() + "', Index: " + j);
        }

        for (String i : myList) {
            if (i.length() > 5) {
                System.out.println(i);
            }
        }
    }
}