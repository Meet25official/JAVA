//Scenario 9: Movie Streaming Service
//Develop a movie streaming service where a user can have multiple favorite movies. The user class contains a list of movie objects, representing an aggregation relationship.

import java.util.Scanner;

class Movie{
    private String  name;
    private String actor;
    private int year;

    public Movie(String name , String actor , int year){
        this.name = name;
        this.actor = actor;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }   
    public void display(){
        System.out.println("The Movie name :- "+name);
        System.out.println("The Movie actor :- "+actor);
        System.out.println("The Movie year is :- "+year);
        System.out.println("-------------------------------------------------------------------------");
    } 
}

class MovieList{
    Movie movies[];
    int count;

    public MovieList(int capacity){
        movies = new Movie[capacity];
        count = 0;
    }

    public void addMovie(String name , String actor , int year){
        if(count < movies.length){
            movies[count++] = new Movie(name , actor , year);
            System.out.println("Movie is added successfuly.");
        }
        else{
            System.out.println("The capacity is full.");
        }
    }

    public void removeMovie(String name){
        for (int i = 0; i < count; i++) {
            if(movies[i].getName().equals(name)){
                for(int j = i; j < count-1; j++) {
                    movies[j] = movies[j+1];
                }  
                count--;
                System.out.println("The Movie removed succesfuly.");
                return;
            }
            else{
                System.out.println("The Movie cannot find.");
            }
        }
    }

    public void updateMovie(String name){
        for(int i = 0; i < count; i++) {
            if(movies[i].getName().equals(name)){
                int choice;
                do{
                    Scanner sc = new Scanner(System.in);
                    System.out.println("1-------------------------------------->name");
                    System.out.println("2-------------------------------------->actor");
                    System.out.println("3-------------------------------------->Year");
                    System.out.println("0-------------------------------------->Exit");
                    System.out.println("Enter your choice :- ");
                    choice = sc.nextInt();

                    switch(choice){
                        case 1: System.out.println("Enter the new name :- ");
                                sc.nextLine();
                                String t1 = sc.nextLine();
                                movies[i].setName(t1);
                                break;
                 
                        case 2: System.out.println("Enter the new actor :- ");
                                sc.nextLine();        
                                String a1 = sc.nextLine();
                                movies[i].setActor(a1);
                                break;
                        
                        case 3: System.out.println("Enter the new name :- ");
                                int y1 = sc.nextInt();
                                movies[i].setYear(y1);
                                sc.close();
                                break;
                        case 0: break;
                        
                        default: System.out.println("Enter the vailid choice!!!");
                            break;
                    }
                }while(choice != 0);
                System.out.println("Movie update succesfuly.");
                return;
            } 
        }
    }
    public void displayAll(){
        for (int i = 0; i < count; i++) {
            movies[i].display();
        }
    }
}

public class Task9 {
    public static void main(String[] args) {
        MovieList obj = new MovieList(10);
        obj.addMovie("Golmaal 3", "Ajay Devgan", 2014);
        obj.addMovie("Tees Maar Khan", "Akshay Kumar", 2012);
        obj.addMovie("Partner", "Salaman Khan", 2010);
        obj.addMovie("Gaddar 2", "Sunny Deol", 2022);
        obj.addMovie("Ankhiyo se goli mare", "Govinda", 1999);
        obj.displayAll();

        obj.removeMovie("Partner");
        obj.displayAll();

        obj.updateMovie("Golmaal 3");
        obj.displayAll();
    }
}