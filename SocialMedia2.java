import java.util.ArrayList;

class SocialMedia2 {
    private ArrayList<String> posts;

    public SocialMedia2 (String filename) {
        posts = FileOperator.getStringList(filename);
    }

    public int postsWithLength (int minLength) {
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
        SocialMedia post1 = new SocialMedia("sample1.txt");
        System.out.println(post1.postsWithLength(1));
        System.out.println(post1.postsWithHashtag("DataScience"));

        SocialMedia post2 = new SocialMedia("sample2.txt");
        System.out.println(post2.postsWithLength(1));
        System.out.println(post2.postsWithHashtag("AvengersEndgame"));
    }
}