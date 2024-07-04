// 9. Problem: Create a media player application that plays different media types (audio and video). Use method overriding to customize the playback behavior for each media type.
//    - Example: Implement a `MediaPlayer` class with overridden methods for playing audio and video files.


class Media {
    protected String filename; 

    public Media(String filename) {
        this.filename = filename;
    }

    public void play() {
        System.out.println("Playing media: " + filename);
    }
}

class Audio extends Media {
    public Audio(String filename) {
        super(filename);
    }

    @Override
    public void play() {
        System.out.println("Playing audio file: " + filename);
    }
}

class Video extends Media {
    public Video(String filename) {
        super(filename);
    }

    @Override
    public void play() {
        System.out.println("Playing video file: " + filename);
    }
}

class MediaPlayer {
    public void playMedia(Media media) {
        media.play();
    }
}

public class Task9 {
    public static void main(String[] args) {
        MediaPlayer player = new MediaPlayer();
        Audio audio = new Audio("song.mp3");
        Video video = new Video("movie.mp4");

        player.playMedia(audio); 
        player.playMedia(video); 
    }
}
