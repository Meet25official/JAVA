// Scenario 6: Music Playlist Creation
// Develop a music playlist system where a playlist consists of multiple songs. The playlist class contains a list of song objects, representing an aggregation relationship.

class Song {
    String title;
    String artist;
    double duration; 

    public Song(String title, String artist, double duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "title= " + title + ", artist= " + artist + ", duration= " + duration;
    }
}

class Playlist {
    private Song[] songs;
    private int count;

    public Playlist(int maxSongs) {
        songs = new Song[maxSongs];
        count = 0;
    }

    public void addSong(Song song) {
        if (count < songs.length) {
            songs[count++] = song;
        } else {
            System.out.println("Playlist is full, cannot add more songs.");
        }
    }

    public void printSongs() {
        System.out.println("Songs in the playlist:");
        for (int i = 0; i < count; i++) {
            System.out.println(songs[i]);
        }
    }

    public double calculateTotalDuration() {
        double totalDuration = 0;
        for (int i = 0; i < count; i++) {
            totalDuration += songs[i].duration;
        }
        return totalDuration;
    }
}
public class Task6 {
    public static void main(String[] args) {
        Playlist playlist = new Playlist(10);

        Song song1 = new Song("Shape of You", "Ed Sheeran", 3.54);
        Song song2 = new Song("Blinding Lights", "The Weeknd", 3.22);
        Song song3 = new Song("Levitating", "Dua Lipa", 3.24);

        playlist.addSong(song1);
        playlist.addSong(song2);
        playlist.addSong(song3);

        playlist.printSongs();

        double totalDuration = playlist.calculateTotalDuration();
        System.out.println("Total duration of the playlist: " + totalDuration + " minutes");
    }
}
