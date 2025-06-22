//Scenario 3: Weather Tracking
// In a weather monitoring system, create an array to store temperature data for a specific location over a period of time. Perform operations such as finding the average temperature, identifying the hottest and coldest days, and generating a temperature graph.

class Temperature{
    private String place;
    private int temp;

    public Temperature(String place , int temp){
        this.place = place;
        this.temp = temp;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public void display(){
        System.out.println("The place is :- "+place);
        System.out.println("The temp of this place is :- "+temp);
        System.out.println("-------------------------------------------------------------");
    }
}

class Monitering{
    Temperature temperatures[];
    int count;

    public Monitering(int capacity){
        temperatures = new Temperature[capacity];
        count = 0;
    }

    public void addTemp(String place , int temp){
        if (count < temperatures.length){
            temperatures[count++] = new Temperature(place, temp);
            System.out.println("The Temp added succesfuly.");
        }
        else{
            System.out.println("The capacity is Full.");
        }
    }

    public void avgTemp(){
        double sum = 0;
        for (int i = 0; i < count; i++) {
            sum += temperatures[i].getTemp();

        }
        System.out.println("The average temprature is :- "+(sum/temperatures.length));
    }

    public void displayAll(){
        for (int i = 0; i < count; i++) {
            temperatures[i].display();
        }
    }

    public void highestlowestTemp(){
        int high = 0;
        String lplace = "";
        int low = temperatures[0].getTemp();
        String hplace = "";
        for(int i = 0; i < count; i++) {
           if(high < temperatures[i].getTemp()){
                high = temperatures[i].getTemp();
                hplace = temperatures[i].getPlace();
           } 
           if(low > temperatures[i].getTemp()){
            low = temperatures[i].getTemp();
            lplace = temperatures[i].getPlace();
       }
        }
        System.out.println("The Highest Monitering of temperature place is :- "+hplace);
        System.out.println("And highest temprature :- "+high);
        System.out.println("The Lowest Monitering of temperature place is :- "+lplace);
        System.out.println("And Lowest temprature :- "+low);
    }
}

public class Task3 {
    public static void main(String[] args) {
        Monitering obj = new Monitering(10);

        obj.addTemp("Gandhinagar", 34);
        obj.addTemp("Ahmdabad", 39);
        obj.addTemp("Kalol", 33);
        obj.addTemp("Mehsana", 37);
        obj.addTemp("Dehgaam", 40);

        obj.displayAll();
        obj.highestlowestTemp();
        
    }
}