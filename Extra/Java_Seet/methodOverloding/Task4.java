// Scenario 2: Social Media Analytics
// In a social media analytics system, implement method overloading for analyzing user engagement. Create different methods with different parameter types, such as analyzing engagement based on likes, analyzing engagement based on comments, and analyzing engagement based on shares.

class SocialMediaAnalytics {

    public void analyzeEngagement(int likes) {
        System.out.println("Analyzing engagement based on likes");
        System.out.println("Total Likes: " + likes);
    }

    public void analyzeEngagement(int comments, double averageCommentLength) {
        System.out.println("Analyzing engagement based on comments");
        System.out.println("Total Comments: " + comments);
        System.out.println("Average Comment Length: " + averageCommentLength);
    }

    public void analyzeEngagement(int shares, int viralShares) {
        System.out.println("Analyzing engagement based on shares");
        System.out.println("Total Shares: " + shares);
        System.out.println("Viral Shares: " + viralShares);
    }
}

public class Task4 {
    public static void main(String[] args) {
        SocialMediaAnalytics analytics = new SocialMediaAnalytics();

        analytics.analyzeEngagement(150);
        analytics.analyzeEngagement(45, 25.3);
        analytics.analyzeEngagement(30, 10);
    }
}
