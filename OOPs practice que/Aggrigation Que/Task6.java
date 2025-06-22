//Scenario 6: Music Playlist Creation
//Develop a music playlist system where a playlist consists of multiple songs. The playlist class contains a list of song objects, representing an aggregation relationship.

import java.util.Scanner;

class Music{
    private String  title;
    private String artist;
    private int year;

    public Music(String title , String artist , int year){
        this.title = title;
        this.artist = artist;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }   
    public void display(){
        System.out.println("The music title :- "+title);
        System.out.println("The music artist :- "+artist);
        System.out.println("The music year is :- "+year);
        System.out.println("-------------------------------------------------------------------------");
    } 
}

class Playlist{
    Music music[];
    int count;

    public Playlist(int capacity){
        music = new Music[capacity];
        count = 0;
    }

    public void addMusic(String title , String artist , int year){
        if(count < music.length){
            music[count++] = new Music(title , artist , year);
            System.out.println("Music is added successfuly.");
        }
        else{
            System.out.println("The capacity is full.");
        }
    }

    public void removeMusic(String title){
        for (int i = 0; i < count; i++) {
            if(music[i].getTitle().equals(title)){
                for(int j = i; j < count-1; j++) {
                    music[j] = music[j+1];
                }  
                count--;
                System.out.println("The music removed succesfuly.");
                return;
            }
            else{
                System.out.println("The music cannot find.");
            }
        }
    }

    public void updateMusic(String title){
        for(int i = 0; i < count; i++) {
            if(music[i].getTitle().equals(title)){
                int choice;
                do{
                    Scanner sc = new Scanner(System.in);
                    System.out.println("1-------------------------------------->Title");
                    System.out.println("2-------------------------------------->Artist");
                    System.out.println("3-------------------------------------->Year");
                    System.out.println("0-------------------------------------->Exit");
                    System.out.println("Enter your choice :- ");
                    choice = sc.nextInt();

                    switch(choice){
                        case 1: System.out.println("Enter the new title :- ");
                                sc.nextLine();
                                String t1 = sc.nextLine();
                                music[i].setTitle(t1);
                                break;
                 
                        case 2: System.out.println("Enter the new artist :- ");
                                sc.nextLine();        
                                String a1 = sc.nextLine();
                                music[i].setArtist(a1);
                                break;
                        
                        case 3: System.out.println("Enter the new title :- ");
                                sc.nextLine();
                                int y1 = sc.nextInt();
                                music[i].setYear(y1);
                                sc.close();
                                break;
                        case 0: break;
                        
                        default: System.out.println("Enter the vailid choice!!!");
                            break;
                    }
                }while(choice != 0);
                System.out.println("Music update succesfuly.");
                return;
            } 
        }
    }
    public void displayAll(){
        for (int i = 0; i < count; i++) {
            music[i].display();
        }
    }
}

public class Task6 {
    public static void main(String[] args) {
        Playlist obj = new Playlist(10);
        obj.addMusic("Agar Tum Sath Ho", "Arjit Singh", 2012);
        obj.addMusic("Tere Sang Yaara", "Atif Aslam", 2017);
        obj.addMusic("Teri Ore", "Shreya Gosal", 2015);
        obj.addMusic("Nile Nile Ambar pe", "Kishor Kumar", 1980);
        obj.addMusic("Tere Bin", "Rahat Fateh Ali", 2013);
        obj.displayAll();

        obj.removeMusic("Teri Ore");
        obj.displayAll();

        obj.updateMusic("Agar Tum Sath Ho");
        obj.displayAll();
    }
}