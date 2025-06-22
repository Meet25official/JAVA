// Scenario 9: Movie Streaming Service
// Develop a movie streaming service where a user can have multiple favorite movies. The user class contains a list of movie objects, representing an aggregation relationship.

class Movie {
    String title;
    String genre;
    double duration;

    public Movie(String title, String genre, double duration) {
        this.title = title;
        this.genre = genre;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "title= " + title + ", genre= " + genre + ", duration= " + duration;
    }
}

class User {
    String username;
    String email;
    private Movie[] favoriteMovies;
    private int count;

    public User(String username, String email, int maxFavorites) {
        this.username = username;
        this.email = email;
        this.favoriteMovies = new Movie[maxFavorites];
        this.count = 0;
    }

    public void addFavoriteMovie(Movie movie) {
        if (count < favoriteMovies.length) {
            favoriteMovies[count++] = movie;
        } else {
            System.out.println(username + " has reached the maximum number of favorite movies.");
        }
    }

    public void printFavoriteMovies() {
        System.out.println(username + "favorite movies:");
        for (int i = 0; i < count; i++) {
            System.out.println(favoriteMovies[i]);
        }
    }

    public int getNumberOfFavoriteMovies() {
        return count;
    }
}
public class Task9 {
    public static void main(String[] args) {
        User user1 = new User("Dhruv", "dhruv@example.com", 10);

        Movie movie1 = new Movie("Inception", "Sci-Fi", 148);
        Movie movie2 = new Movie("The Shawshank Redemption", "Drama", 142);

        user1.addFavoriteMovie(movie1);
        user1.addFavoriteMovie(movie2);

        user1.printFavoriteMovies();

        System.out.println(user1.username + " has " + user1.getNumberOfFavoriteMovies() + " favorite movies.");
    }
}
