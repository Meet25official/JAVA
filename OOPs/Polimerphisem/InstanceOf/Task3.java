//Scenario 3: University Course Registration
//In a university course registration system, have classes like "Course," "Lecture," and "Lab" representing different types of courses. Use the instanceof operator to determine the type of course and perform specific registration operations based on the course type.

class Course{   
    private String type;
    
    public Course(String type){
        this.type = type;
    }
    
    public String getType(){
        return type;
    }
    public void display(){
        System.out.println("The type of learning cource is :- "+type);
    }
}

class Lecture extends Course{
    Lecture(String type){
        super(type);
    }

    public void displayLec(){
        System.out.println("The cource learning for 3 hour in "+super.getType());
    }
}

class Lab extends Course{
    Lab(String type){
        super(type);
    }

    public void displayLeb(){
        System.out.println("The cource learning for 7 hour in "+super.getType());
    }
}

public class Task3 {
    public static void main(String[] args) {
        Course cource1 = new Lecture("Lecture");
        Course cource2 = new Lab("Lab");
        
        System.out.println(cource1 instanceof Lecture);
        cource1.display();
        System.out.println(cource2 instanceof Lab);
        cource2.display();

        if(cource1 instanceof Lecture){
            Lecture obj1 = (Lecture) cource1;
            obj1.displayLec();
        }
        if(cource2 instanceof Lab){
            Lab obj2 = (Lab) cource2;
            obj2.displayLeb();
        }
    }
}