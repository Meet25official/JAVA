// Scenario 9: Online Music Streaming
// Create an interface called "MusicPlayer" with methods like "playSong" and "stopSong." Implement classes like "SpotifyPlayer" and "AppleMusicPlayer" that provide specific implementations for these interface methods.

interface MusicPlayer {
    void playSong(String songName);
    void stopSong();
}

class SpotifyPlayer implements MusicPlayer {
    private String currentSong;

    @Override
    public void playSong(String songName) {
        currentSong = songName;
        System.out.println("Playing song on Spotify: " + songName);
    }

    @Override
    public void stopSong() {
        System.out.println("Stopping song on Spotify: " + currentSong);
        currentSong = null;
    }
}

class AppleMusicPlayer implements MusicPlayer {
    private String currentSong;

    @Override
    public void playSong(String songName) {
        currentSong = songName;
        System.out.println("Playing song on Apple Music: " + songName);
    }

    @Override
    public void stopSong() {
        System.out.println("Stopping song on Apple Music: " + currentSong);
        currentSong = null;
    }
}
public class Task9 {
    public static void main(String[] args) {
        MusicPlayer spotifyPlayer = new SpotifyPlayer();
        spotifyPlayer.playSong("Shape of You");
        spotifyPlayer.stopSong();

        MusicPlayer appleMusicPlayer = new AppleMusicPlayer();
        appleMusicPlayer.playSong("Blinding Lights");
        appleMusicPlayer.stopSong();
    }
}
