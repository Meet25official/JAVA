// 9. Static Final Variables in Hierarchical Inheritance:
//    - Problem Statement: Implement a hierarchical inheritance setup with classes 'Building', 'Office', and 'Residence'. The 'Building' class should have a static final variable 'BUILDING_TYPE', and a method 'showType()'. The 'Office' and 'Residence' classes should override 'showType()' to display specific information. Ensure correct use of static final variables and method overriding.

class Building {
    public static final String BUILDING_TYPE = "IT Building";

    public void showType() {
        System.out.println("Building Type: " + BUILDING_TYPE);
    }
}

class Office extends Building {
    public void showType() {
        System.out.println("Building Type: Office");
    }
}

class Residence extends Building {
    public void showType() {
        System.out.println("Building Type: Residence");
    }
}

public class Task9 {
    public static void main(String[] args) {
        Building building = new Building();
        Office office = new Office();
        Residence residence = new Residence();

        building.showType();  
        office.showType();    
        residence.showType(); 
    }
}
