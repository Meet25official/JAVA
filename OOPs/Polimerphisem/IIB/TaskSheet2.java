//Scenario 2: Game Initialization
//In a game development scenario, have a class called "Game" with an instance initializer block that sets up the game environment, loads resources, and performs initialization tasks when a new game object is created.

class Game{
    private int size;
    private String name;
    private String graphics;

    {
        size = 500;
        name = "Free Fire";
        graphics = "Very Aggresive Graphics";
    }

    public void displayDetails(){
        System.out.println("The name of this game name is :- "+name);
        System.out.println("The size of this game is :- "+size);
        System.out.println("The graphics feedback of this game is :- "+graphics);
    }
}

public class TaskSheet2 {
    public static void main(String[] args) {
        Game obj = new Game();
        obj.displayDetails();
    }
}
