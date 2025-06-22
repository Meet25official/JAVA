//9. Static Final Variables in Hierarchical Inheritance:
//- Problem Statement: Implement a hierarchical inheritance setup with classes 'Building', 'Office', and 'Residence'. The 'Building' class should have a static final variable 'BUILDING_TYPE', and a method 'showType()'. The 'Office' and 'Residence' classes should override 'showType()' to display specific information. Ensure correct use of static final variables and method overriding.

class Building{
    private String BUILDING_TYPE;

    public Building(String BUILDING_TYPE){
        this.BUILDING_TYPE = BUILDING_TYPE;
    }

    public void showType(){
        System.out.println("The type of this building is :- "+BUILDING_TYPE);
    }
}
 
class Office extends Building{
    private String name;
    private int size;
    private double price;

    public Office(String type , String name , int size , double price){
        super(type);
        this.name = name;
        this.size = size;
        this.price = price;
    }

    public void showOffice(){
        super.showType();
        System.out.println("The name this office is :- "+name);
        System.out.println("The size of this office is :- "+size+" (in vaar)");
        System.out.println("The price of this office is :- "+price);
    }
}

class Residence extends Building{
    private String name;
    private int size;
    private double price;

    public Residence(String type , String name , int size , double price){
        super(type);
        this.name = name;
        this.size = size;
        this.price = price;
    }

    public void showHouse(){
        super.showType();
        System.out.println("The name this House is :- "+name);
        System.out.println("The size of this House is :- "+size+" (in vaar)");
        System.out.println("The price of this House is :- "+price);
    }
} 

public class Task9 {
  public static void main(String[] args) {
        Office obj = new Office("Office", "Royal Tecnosoft", 110, 8000000);
        Residence obj2 = new Residence("Resideny", "Shakti Royal", 320, 3200000);
        obj.showOffice();
        obj2.showHouse();
  }  
}