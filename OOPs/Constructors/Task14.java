//6. Car Class: Design a `Car` class with a constructor to set the car's make, model, and year of manufacture.
class Car{
    private String brand , model;
    private int year;

    public Car(String b, String m , int y){
        brand = b;
        model = m;
        year = y;
    }

    public void displayDetails(){
        System.out.println("Brand : " + brand);
        System.out.println("Model name : " + model);
        System.out.println("Publish Year : " + year);
    }
}
public class Task14 {
    public static void main(String[] args) {
        Car obj = new Car("Suzuki", "Wagonr LXI", 2021);
        obj.displayDetails();
    }    
}
