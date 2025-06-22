// Scenario 19: Music Streaming Service
// Develop a music streaming service with classes like "Song," "Playlist," and "User." Implement methods for users to search for songs, create playlists, and listen to music.

class User {
    private String name;
    private int id;
    
    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public int getId() {
        return id;
    }
    
    public String toString() {
        return "Name: " + name + ", ID: " + id;
    }
}

class Listener extends User {
    public Listener(String name, int id) {
        super(name, id);
    }
    
    public void listenToSong(Song song) {
        System.out.println(getName() + " is listening to " + song.getTitle() + " by " + song.getArtist());
    }
}

class Song {
    private String title;
    private String artist;
    private double duration; 
    
    public Song(String title, String artist, double duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }
    
    public String getTitle() {
        return title;
    }
    
    public String getArtist() {
        return artist;
    }
    
    public double getDuration() {
        return duration;
    }
    
    public String toString() {
        return "Title: " + title + ", Artist: " + artist + ", Duration: " + duration + " mins";
    }
}

class Playlist extends Song {
    private String playlistName;
    private Song[] songs;
    private int songCount;
    
    public Playlist(String playlistName, int capacity) {
        super(playlistName, playlistName, 0);
        this.playlistName = playlistName;
        this.songs = new Song[capacity];
        this.songCount = 0;
    }
    
    public void addSong(Song song) {
        if (songCount < songs.length) {
            songs[songCount++] = song;
            System.out.println(song.getTitle() + " added to playlist " + playlistName);
        } else {
            System.out.println("Playlist is full. Cannot add more songs.");
        }
    }
    
    public void showPlaylist() {
        System.out.println("Playlist: " + playlistName);
        for (int i = 0; i < songCount; i++) {
            System.out.println(songs[i]);
        }
    }
}
public class Task19 {
    public static void main(String[] args) {
        Listener alice = new Listener("Alice Johnson", 101);
        Listener bob = new Listener("Bob Smith", 102);
        
        Song song1 = new Song("Song One", "Artist A", 3.5);
        Song song2 = new Song("Song Two", "Artist B", 4.0);
        
        Playlist playlist1 = new Playlist("My Favorites", 5);
        
        playlist1.addSong(song1);
        playlist1.addSong(song2);
        
        playlist1.showPlaylist();
        
        alice.listenToSong(song1);
        bob.listenToSong(song2);
    }
}
