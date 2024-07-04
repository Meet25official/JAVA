// 2. Volume Calculation:
//    Create a class `Volume` with overloaded methods `calculate()` to compute the volume of a cube (using side length), a cylinder (using radius and height), and a rectangular prism (using length, width, and height).

class Volume {
    public double calculate(double sideLength) {
        return sideLength * sideLength * sideLength;
    }
    
    public double calculate(double radius, double height) {
        return Math.PI * radius * radius * height;
    }

    public double calculate(double length, double width, double height) {
        return length * width * height;
    }
}

public class Task2 {
    public static void main(String[] args) {
        Volume volumeCalculator = new Volume();
        
        double cubeVolume = volumeCalculator.calculate(5.0);
        System.out.println("Volume of cube with side length 5: " + cubeVolume);
        
        double cylinderVolume = volumeCalculator.calculate(3.0, 7.0);
        System.out.println("Volume of cylinder with radius 3 and height 7: " + cylinderVolume);
        
        double prismVolume = volumeCalculator.calculate(4.0, 5.0, 6.0);
        System.out.println("Volume of rectangular prism with dimensions 4x5x6: " + prismVolume);
    }
}
