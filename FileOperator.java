import java.util.*;
import java.io.*;

class FileOperator {
    private static File myFile;
    private static Scanner fileReader;

    public static ArrayList<String> getStringList(String filename) {
        myFile = new File(filename);
        ArrayList<String> linesList = new ArrayList<>();
        try {
            fileReader = new Scanner(myFile);
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File not found. Please enter a valid file.");
        }
        while (fileReader.hasNextLine()) {
            linesList.add(fileReader.nextLine());
        }
        return linesList;
    }

    // public static void main(String[] args) {
    //     ArrayList<String> lines = FileOperator.getStringList("poem.txt");
    //     Poem poem = new Poem(lines);
    //     System.out.println(poem.toString());
    // }
}

class Poem {
    private String title;
    private ArrayList<String> lines;

    public Poem(ArrayList<String> lines) {
        this.lines = lines;
        this.title = lines.get(0);
    }

    public String toString() {
        String output = "";
        output += title += "\n\n";
        for (int i = 1; i < lines.size(); i ++) {
            if (!lines.get(i).isEmpty()) {
                output += lines.get(i);
                output += "\n";
            }
        }
        return output;
    }
}

class SocialMedia {
    private ArrayList<String> posts;

    public SocialMedia(String filename) {
        posts = FileOperator.getStringList(filename);
    }

    public int postsWithLength(int minLength) {
        int totalCount = 0;
        for (String line : posts) {
            totalCount += line.length();
        }
        return totalCount;
    }

    public ArrayList<String> postsWithHashtag(String hashtag) {
        ArrayList<String> hashtagPostList = new ArrayList<>();
        for (String line : posts) {
            if (line.contains("#" + hashtag)) {
                hashtagPostList.add(line);
            }
        }
        return hashtagPostList;
    }

    public static void main(String[] args) {
        SocialMedia socialmedia = new SocialMedia("sample1.txt");
        System.out.println(socialmedia.postsWithLength(1));
        // System.out.println(socialmedia.postsWithHashtag("DataScience"));
        socialmedia.postsWithHashtag("DataScience").stream().forEach(System.out::println);
    }
}