import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class SocialMedia {
    private ArrayList<String> posts;
    public SocialMedia(String filename) {
        this.posts = FileOperator.getStringData(filename);
    }
    public int postsWithLength(int minLength) {
        int total = 0;
        return total;
    }
    public ArrayList<String> postsWithHashtag(String hashtag) {
        ArrayList<String> result = new ArrayList<>();
        return result;
    }
}
