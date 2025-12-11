import java.util.ArrayList;
public class SocialMedia {

    private ArrayList<String> posts;

    public SocialMedia(String filename) {
        posts = FileOperator.getStringData(filename);
    }

    public int postsWithLength(int minLength) {
        int out = 0;
        for (String post : posts) {
            if (post.length()>=minLength) {
                out += 1;
            }
        }
        return out;
    }

    public ArrayList<String> postsWithHashtag(String hashtag) {
        if (hashtag.charAt(0)!='#') {
            hashtag = '#'+hashtag;
        }
        ArrayList<String> out = new ArrayList<String>();
        for (String post : posts) {
            if (post.contains(hashtag)) {
                out.add(post);
            }
        }
        return out;
    }
    
}
