//Scenario 9: Online Music Streaming
// Create an interface called "MusicPlayer" with methods like "playSong" and "stopSong." Implement classes like "SpotifyPlayer" and "AppleMusicPlayer" that provide specific implementations for these interface methods.

interface MusicPlayer{
    void playSong();
    void stopSong();
}

class SpotifyPlayer implements MusicPlayer{
    private String name;
    private String artist;

    public SpotifyPlayer(String name , String artist){
        this.name = name;
        this.artist = artist;
    }

    @Override
    public void playSong(){
        System.out.println("The song is start in spotify App.");
        System.out.println("The name of this Song is :- "+name);
        System.out.println("The artist of this song is :- "+artist);
    }

    @Override
    public void stopSong(){
        System.out.println("The song is stop.");
    }
}

class AppleMusicPlayer implements MusicPlayer{
    private String name;
    private String artist;

    public AppleMusicPlayer(String name , String artist){
        this.name = name;
        this.artist = artist;
    }

    @Override
    public void playSong(){
        System.out.println("The song is start in Apple App.");
        System.out.println("The name of this song is :- "+name);
        System.out.println("The artist of this song is :- "+artist);
    }

    @Override
    public void stopSong(){
        System.out.println("The song is stop.");
    }
}

public class Task9 {
    public static void main(String[] args) {
        SpotifyPlayer obj1 = new SpotifyPlayer("Tere Naam" , "Udit Narayan");
        AppleMusicPlayer obj2 = new AppleMusicPlayer("Tere Liye", "Atif Aslam");

        obj1.playSong();
        obj1.stopSong();

        obj2.playSong();
        obj2.stopSong();
    }
}
