// 9. Array of Objects Initialization:
//    Develop a 'Movie' class with fields 'title', 'director', and 'releaseYear'. Write a main class where you create an array of 'Movie' objects, initializing each element of the array using a constructor, and then display their details.

class Movie {
    private String title;
    private String director;
    private int releaseYear;
    
    public Movie(){
        title = null;
        director = null;
        releaseYear = 0;
    }

    public Movie(String title, String director, int releaseYear) {
        this.title = title;
        this.director = director;
        this.releaseYear = releaseYear;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public int getReleaseYear() {
        return releaseYear;
    }
}
public class Task9 {
    public static void main(String[] args) {

        Movie[] movies = new Movie[1]; 

        movies[0] = new Movie("The Dark Knight", "Christopher Nolan", 2008);

        System.out.println("Movie Details:");
        for (Movie movie : movies) {
            System.out.println("Title: " + movie.getTitle());
            System.out.println("Director: " + movie.getDirector());
            System.out.println("Release Year: " + movie.getReleaseYear());
        }
    }
}
