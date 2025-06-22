//Scenario 6: Social Media Integration
//Create an interface called "SocialMediaIntegration" with methods like "sharePost" and "likePost." Implement classes like "FacebookIntegration" and "TwitterIntegration" that provide specific implementations for these interface methods.


interface SocialMediaIntegration{
    void sharePost();
    void likePost();
}

class FacebookIntegration implements SocialMediaIntegration{
    private String name;
    private int count;

    public FacebookIntegration(String name , int count){
        this.name = name;
        this.count = count;
    }

    @Override
    public void sharePost(){
        System.out.println("The account name is :- "+name);
        System.out.println("The post is Share from this account.");
        System.out.println("The socieal mediaApp name is :- Facebook");
    }

    @Override
    public void likePost(){
        System.out.println("The total likes of this post is :- "+count);
    }
}

class TwitterIntegration implements SocialMediaIntegration{
    private String name;
    private int count;

    public TwitterIntegration(String name , int count){
        this.name = name;
        this.count = count;
    }

    @Override
    public void sharePost(){
        System.out.println("The account name is :- "+name);
        System.out.println("The post is Share from this account.");
        System.out.println("The socieal mediaApp name is :- Twitter");
    }

    @Override
    public void likePost(){
        System.out.println("The total likes of this post is :- "+count);
    }
}


public class Task6 {
    public static void main(String[] args) {
        FacebookIntegration obj1 = new FacebookIntegration("HimeshPatel", 1090);
        TwitterIntegration obj2 = new TwitterIntegration("MeetSarvaiya", 4098);
        
        obj1.sharePost();
        obj1.likePost();
        
        obj2.sharePost();
        obj2.likePost();
    }
}