//4. Travel Booking System: Flight Not Available Exception

// Problem Statement:
// In a travel booking system, handle cases where a flight is not available for booking. Create a custom exception `FlightNotAvailableException` to manage this scenario.

class FlightNotAvailableException extends Exception{
        public FlightNotAvailableException(String messege){
            super(messege);
        }
}

class Booking{
    private int nopass;
    private String name;

    public Booking(int nopass , String name){
        this.nopass = nopass;
        this.name = name;
    }

    public void available() throws FlightNotAvailableException{
        if(nopass <= 10){
            System.out.println("The flight is available and flight name is :- "+name);  
        }
        else{
            throw new FlightNotAvailableException("The flight is not available.");
        }
    }
}

public class Task4 {
    public static void main(String[] args) {
        Booking obj = new Booking(11, "AirIndia");

        try {
            obj.available();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}