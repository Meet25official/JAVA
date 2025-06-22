//Scenario 6: Music Player Application
//Develop an abstract class called "MediaPlayer" with abstract methods like "play" and "stop." Implement derived classes like "AudioPlayer" and "VideoPlayer" that provide specific implementations for these abstract methods.

abstract class MediaPlayer{
    private String title;
    private String sname;

    public MediaPlayer(String title , String sname){
        this.title = title;
        this.sname = sname;
    }

    abstract void play();
    abstract void stop();

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getSname(){
        return sname;
    }

    public void setSname(String sname){
        this.sname = sname;
    }
}

class AudioPlayer extends MediaPlayer{
    private String ext;
    public AudioPlayer(String title , String sname , String ext){
        super(title, sname);
        this.ext = ext;
    }    

    @Override
    public void play(){
        System.out.println("The song title is :- "+super.getTitle());
        System.out.println("The singer of this song is :- "+super.getTitle());
        System.out.println("The song is start");
    }

    @Override
    public void stop(){
        System.out.println("The extantion of this song is "+ext);
        System.out.println("The song is stop then 4 minutes and 34 seconds.");
    }
}

class VideoPlayer extends MediaPlayer{
    private String ext;
    public VideoPlayer(String title , String sname , String ext){
        super(title, sname);
        this.ext = ext;
    }    

    @Override
    public void play(){
        System.out.println("The song title is :- "+super.getTitle());
        System.out.println("The singer of this song is :- "+super.getTitle());
        System.out.println("The song is start");
    }

    @Override
    public void stop(){
        System.out.println("The extantion of this song is "+ext);
        System.out.println("The song is stop then 5 minutes and 9 seconds.");
    }
}
public class Task6 {
    public static void main(String[] args) {
        AudioPlayer obj = new AudioPlayer("Agar tum sath ho", "Arjit Singh", ".mp3");
        VideoPlayer obj2 = new VideoPlayer("Tere Sang Yaara", "Atif Aslam", ".mp4");

        obj.play();
        obj.stop();
        obj2.play();
        obj2.stop();
    }
}
