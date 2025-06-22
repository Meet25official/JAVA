//Scenario 1: Online Course Platform
//In an online course platform, create classes like "Course," "VideoLesson," and "Quiz" representing different course components. Use the instanceof operator to determine the type of course component and perform specific actions or display relevant information.

class Course{
    public void display(){
        System.out.println("The cource have many type of cource.");
    }
}

class VideoLesson extends Course{
    public void displayVidieo(){
        System.out.println("This is vidio lesson type.");
    }
}

class Quiz extends Course{
    public void displayQuize(){
        System.out.println("This is Quiz type.");
    }
}

public class Task1 {
    public static void main(String[] args) {
        Course cource1 = new VideoLesson();            //upcasting
        Course course2 = new Quiz();                   

        System.out.println(cource1 instanceof VideoLesson);
        cource1.display();
        System.out.println(course2 instanceof Quiz);
        course2.display();
        
        if (cource1 instanceof VideoLesson){    //downcasting
            VideoLesson obj1 = (VideoLesson) cource1;
            obj1.displayVidieo();
        }
        if (course2 instanceof Quiz){
            Quiz obj2 = (Quiz) course2;
            obj2.displayQuize();
        }
    }
}