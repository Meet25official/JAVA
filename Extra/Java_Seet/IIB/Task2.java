// Scenario 2: Game Initialization
// In a game development scenario, have a class called "Game" with an instance initializer block that sets up the game environment, loads resources, and performs initialization tasks when a new game object is created.

class Game {
    private String environment; 
    private double loadsresources, performs;
    {
        environment = "xyz";
        loadsresources = 10;
        performs = 5;
    }
    public String initialization(String environment, double loadsresources, double performs){
        return "Game Initialization{ environment: " + environment +  "loadsresources: " + loadsresources + "performs: " + performs + "}";
    }
}
public class Task2 {
    public static void main(String[] args) {
         Game g = new Game();
         System.out.println(g.initialization("abc",20,10));
    }
}
