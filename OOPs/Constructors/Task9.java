// 9. Array of Objects Initialization:
//    Develop a 'Movie' class with fields 'title', 'director', and 'releaseYear'. Write a main class where you create an array of 'Movie' objects, initializing each element of the array using a constructor, and then display their details.

class Movie{
    private String title,director;
    private int releaseYear;

    public Movie(String t , String d , int r){
        title = t;
        director = d;
        releaseYear = r;
    }

    void getDetails(){
        System.out.println("The title of the movie is :- "+title);
        System.out.println("The director of the movie is :- "+director);
        System.out.println("The release Year of the movie is :- "+releaseYear);
    }
}

public class Task9 {
    public static void main(String[] args) {
        Movie obj[] = new Movie[3];
        obj[0] = new Movie("Housfull 2", "Sajid Nadiwada", 2014);
        obj[1] = new Movie("Welcome", "Dhruv", 2000);
        obj[2] = new Movie("Hera Pheri", "Himesh Patel", 1990);

        obj[0].getDetails();
        obj[1].getDetails();
        obj[2].getDetails();
    }
}
