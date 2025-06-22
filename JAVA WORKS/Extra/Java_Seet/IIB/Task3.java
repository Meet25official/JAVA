// Scenario 1: Online Game Initialization
// In an online game development scenario, have a class called "Game" with an instance initializer block that sets up the game environment, loads resources, and performs initialization tasks when a new game object is created.

class Game {
    private String environment;
    private String resources;
    {
        setupEnvironment();
        loadResources();
        initializeGame();
    }
    
    public Game() {
        System.out.println("Game object created.");
    }
    
    private void setupEnvironment() {
        environment = "Default Environment";
        System.out.println("Environment setup: " + environment);
    }
    
    private void loadResources() {
        resources = "Default Resources";
        System.out.println("Resources loaded: " + resources);
    }
    
    private void initializeGame() {
        System.out.println("Game initialized with environment: " + environment + " and resources: " + resources);
    }
    
    public void startGame() {
        System.out.println("Starting the game...");
    }
}
public class Task3 {
    public static void main(String[] args) {
        Game newGame = new Game();
        newGame.startGame();
    }
}
