// Scenario 6: Music Player Application
// Develop an abstract class called "MediaPlayer" with abstract methods like "play" and "stop." Implement derived classes like "AudioPlayer" and "VideoPlayer" that provide specific implementations for these abstract methods.

abstract class MediaPlayer {
    private String mediaName;

    public MediaPlayer(String mediaName) {
        this.mediaName = mediaName;
    }

    abstract void play();
    abstract void stop();

    public String getMediaName() {
        return mediaName;
    }
}

class AudioPlayer extends MediaPlayer {
    public AudioPlayer(String mediaName) {
        super(mediaName);
    }

    @Override
    void play() {
        System.out.println("Playing audio: " + getMediaName());
    }

    @Override
    void stop() {
        System.out.println("Stopping audio: " + getMediaName());
    }
}

class VideoPlayer extends MediaPlayer {
    public VideoPlayer(String mediaName) {
        super(mediaName);
    }

    @Override
    void play() {
        System.out.println("Playing video: " + getMediaName());
    }

    @Override
    void stop() {
        System.out.println("Stopping video: " + getMediaName());
    }
}
public class Task6 {
    public static void main(String[] args) {
        MediaPlayer audioPlayer = new AudioPlayer("Song.mp3");
        audioPlayer.play();
        audioPlayer.stop();

        MediaPlayer videoPlayer = new VideoPlayer("Movie.mp4");
        videoPlayer.play();
        videoPlayer.stop();
    }
}
