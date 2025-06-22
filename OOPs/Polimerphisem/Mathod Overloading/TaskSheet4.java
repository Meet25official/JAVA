//Scenario 2: Social Media Analytics
//In a social media analytics system, implement method overloading for analyzing user engagement. Create different methods with different parameter types, such as analyzing engagement based on likes, analyzing engagement based on comments, and analyzing engagement based on shares.

class Social{
    public void engagement(double likes){
        System.out.println("The social media engagement is Instagram.");
        System.out.println("The total likes of this post is :- "+likes);
    }

    public void engagement(String comments){
        System.out.println("There are many comments of this post.");
        System.out.println("The comment is :- "+comments);
    }

    public void engagement(float shares){
        System.out.println("The total share of this post is :- "+shares);
    }
}

public class TaskSheet4 {
    public static void main(String[] args) {
        Social obj = new Social();
        obj.engagement(567789.0);
        obj.engagement("Nice");
        obj.engagement(890f);
    }
}