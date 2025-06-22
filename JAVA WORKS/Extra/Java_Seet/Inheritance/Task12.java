// Scenario 12: Social Media Platform
// Create a social media platform with classes like "User," "Post," and "Comment." Implement methods for users to create posts, comment on posts, and interact with each other.

class SocialMediaEntity {
    private String content;
    
    public SocialMediaEntity(String content) {
        this.content = content;
    }
    
    public String getContent() {
        return content;
    }
    
    public String toString() {
        return content;
    }
}

class User extends SocialMediaEntity {
    private String username;
    
    public User(String username) {
        super(username);
        this.username = username;
    }
    
    public void createPost(String content) {
        Post post = new Post(this, content);
        System.out.println(username + " created a new post: " + post);
    }
    
    public void commentOnPost(Post post, String commentContent) {
        Comment comment = new Comment(this, commentContent);
        post.addComment(comment);
        System.out.println(username + " commented on post: " + commentContent);
    }
    
    public String getUsername() {
        return username;
    }
}

class Post extends SocialMediaEntity {
    private User author;
    private Comment[] comments;
    private int commentCount;
    private static final int MAX_COMMENTS = 50;
    
    public Post(User author, String content) {
        super(content);
        this.author = author;
        this.comments = new Comment[MAX_COMMENTS];
        this.commentCount = 0;
    }
    
    public void addComment(Comment comment) {
        if (commentCount < MAX_COMMENTS) {
            comments[commentCount] = comment;
            commentCount++;
        } else {
            System.out.println("Comment limit reached for post: " + getContent());
        }
    }
    
    public Comment[] getComments() {
        return comments;
    }
    
    public int getCommentCount() {
        return commentCount;
    }
    
    public String toString() {
        return "Post by " + author.getUsername() + ": " + getContent();
    }
}

class Comment extends SocialMediaEntity {
    private User commenter;
    
    public Comment(User commenter, String content) {
        super(content);
        this.commenter = commenter;
    }
    
    public String toString() {
        return "Comment by " + commenter.getUsername() + ": " + getContent();
    }
}
public class Task12 {
    public static void main(String[] args) {
        User alice = new User("Alice");
        User bob = new User("Bob");
        
        alice.createPost("Hello world!");
        
        Post bobPost = new Post(bob, "Good morning, everyone!");
        
        alice.commentOnPost(bobPost, "Good morning, Bob!");
        
        System.out.println(bobPost);
        for (int i = 0; i < bobPost.getCommentCount(); i++) {
            Comment comment = bobPost.getComments()[i];
            System.out.println("  " + comment);
        }
    }
}
