// 6. Problem: Develop a drawing application with different shapes (e.g., lines, circles, rectangles). Use method overloading to draw each shape based on its attributes.
//    - Example: Implement a `Draw` class with overloaded methods for drawing lines, circles, and rectangles, accepting different parameters for each shape.

class Draw {
    public void draw(int x1, int y1, int x2, int y2) {
        System.out.println("Drawing line from (" + x1 + ", " + y1 + ") to (" + x2 + ", " + y2 + ")");
    }

    public void draw(int centerX, int centerY, int radius) {
        System.out.println("Drawing circle with center (" + centerX + ", " + centerY + ") and radius " + radius);
    }

    public void draw(double x, double y, double width, double height) {
        System.out.println("Drawing rectangle at (" + x + ", " + y + ") with width " + width + " and height " + height);
    }
}

public class Task6 {
    public static void main(String[] args) {
        Draw drawer = new Draw();
        
        drawer.draw(10, 20, 30, 40); 
        drawer.draw(50, 50, 25); 
        drawer.draw(100, 100, 50, 75); 
    }
}
