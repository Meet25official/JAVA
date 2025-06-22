//Scenario 2: Messaging App
//In a messaging application, implement method overloading for sending messages. Create different methods with different parameter combinations, such as sending a text message, sending an image message, and sending a video message.

public class TaskSheet2{
    public static void application(String messege){
        System.out.println("The messeges are = "+messege);
    }
    public static void application(int size){
        System.out.println("The size of the image is :- "+size+"kb");
    }
    public static void application(int size , double duretion){
        System.out.println("The size of the video is :- "+size+"kb and duration of the video is :- "+duretion+" seconds");
    }
    public static void main(String[] args) {
        application("Hii Good Morning!!");
        application(23);
        application(23 , 56);
    }
}