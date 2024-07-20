// Scenario 2: University Department Management
// Create a university department management system where a department consists of multiple faculty members. The department class contains a list of faculty objects, representing an aggregation relationship.

class Faculty {
    private String name;
    private String sub;

    public Faculty(String name, String sub){
        this.name = name;
        this.sub = sub;
    }

    public String getName() {
        return name; 
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }
} 
class Department {
    Faculty[] faculties;
    int facultycount;

    public Department(int cap) {
        facultycount = 0;
        faculties = new Faculty[cap]; 
    }

    public void addFaculty(Faculty faculty1){
        faculties[facultycount] = faculty1;
        facultycount++;
    }

    public void display(){
        for (int i = 0; i < facultycount; i++) {
            System.out.println("Name: " + faculties[i].getName() + ", Subject: " + faculties[i].getSub());
        }
    }
}
public class Task2 {
    public static void main(String[] args) {
        Department D = new Department(5);
        D.addFaculty(new Faculty("abc", "xyz"));

        System.out.println("-----Department Info-----");
        D.display();
    }
}