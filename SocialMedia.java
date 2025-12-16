import java.util.ArrayList;

public class SocialMedia {
    private ArrayList<String> posts;
    public SocialMedia(String filename) {
        this.posts = FileOperator.getStringData(filename);
    }
    public int postWithLength(int minLength) {
        int total = 0;
        return total;
    }
    public ArrayList<String> postWithHashtag(String hashtag) {
        ArrayList<String> result = new ArrayList<>();
        // contains
        for (String post:posts) {
            if (post.contains(hashtag)) {
                result.add(post);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("=== TESTING SAMPLE1.TXT ===");
        SocialMedia camila = new SocialMedia("sample1.txt");
        System.out.println(camila.postWithLength(50));
        System.out.println(camila.postWithLength(70));
        System.out.println(camila.postWithHashtag("Java"));
        System.out.println("=== TESTING SAMPLE2.TXT ===");
        SocialMedia poluri = new SocialMedia("sample2.txt");
        System.out.println(poluri.postWithLength(50));
        System.out.println(poluri.postWithLength(70));
        System.out.println(poluri.postWithHashtag("Endgame Hype"));
    }
}

