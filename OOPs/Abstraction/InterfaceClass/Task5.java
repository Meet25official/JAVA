//Scenario 5: Travel Booking System
//Develop an interface called "TravelBooking" with methods like "bookTicket" and "cancelBooking." Implement classes like "FlightBooking" and "HotelBooking" that provide specific implementations for these interface methods.

interface TravelBooking{
    void bookTicket();
    void cancelBooking();
}

class FlightBooking implements TravelBooking{
    private String from;
    private String to;
    private int qun;

    public FlightBooking(String from , String to , int qun){
        this.from = from;
        this.to = to;
        this.qun = qun;
    }

    @Override
    public void bookTicket(){
        System.out.println("The ticket is booking from :- "+from+" To :- "+to);
        System.out.println("The ticket is booking for "+qun+" person.");
        System.out.println("The ticket is book for a Flight.");
    }

    @Override
    public void cancelBooking(){
        System.out.println("The ticket is cancel by user.");
    }
}

class HotelBooking implements TravelBooking{
    private String name;
    private String place;
    private int days;

    public HotelBooking(String name , String place , int days){
        this.name = name;
        this.place = place;
        this.days = days;
    }

    @Override
    public void bookTicket(){
        System.out.println("The ticket is book for a Hotel.");
        System.out.println("The ticket is booking to the Hotel :- "+name+" is placed in "+place);
        System.out.println("The ticket is stay in hotel for :- "+days+" days.");
    }

    @Override
    public void cancelBooking(){
        System.out.println("The ticket is cancel by user.");
    }
}
public class Task5 {
    public static void main(String[] args) {
        FlightBooking obj1 = new FlightBooking("Ahmdabad", "Hydrabad", 2);
        HotelBooking obj2 = new HotelBooking("The Leela", "Gandhinagar", 4);
        
        obj1.bookTicket();
        obj1.cancelBooking();
        
        obj2.bookTicket();
        obj2.cancelBooking();
    }
}