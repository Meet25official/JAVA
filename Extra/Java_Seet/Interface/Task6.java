// Scenario 6: Social Media Integration
// Create an interface called "SocialMediaIntegration" with methods like "sharePost" and "likePost." Implement classes like "FacebookIntegration" and "TwitterIntegration" that provide specific implementations for these interface methods.

interface SocialMediaIntegration {
    void sharePost(String content);
    void likePost(String postId);
}

class FacebookIntegration implements SocialMediaIntegration {
    @Override
    public void sharePost(String content) {
        System.out.println("Sharing post on Facebook: " + content);
    }

    @Override
    public void likePost(String postId) {
        System.out.println("Liking post on Facebook with ID: " + postId);
    }
}

class TwitterIntegration implements SocialMediaIntegration {
    @Override
    public void sharePost(String content) {
        System.out.println("Tweeting on Twitter: " + content);
    }

    @Override
    public void likePost(String postId) {
        System.out.println("Liking tweet on Twitter with ID: " + postId);
    }
}

public class Task6 {
    public static void main(String[] args) {
        SocialMediaIntegration facebook = new FacebookIntegration();
        facebook.sharePost("Hello, Facebook!");
        facebook.likePost("FB123");

        SocialMediaIntegration twitter = new TwitterIntegration();
        twitter.sharePost("Hello, Twitter!");
        twitter.likePost("TW123");
    }
}
