//Scenario 7: Geolocation Services
//Design an interface called "GeolocationService" with methods like "getCurrentLocation" and "calculateDistance." Implement classes like "GoogleMapsService" and "HereMapsService" that provide specific implementations for these interface methods.

interface GeolocationService{
    void getCurrentLocation();
    void calculateDistance();
}

class GoogleMapsService implements GeolocationService{
    private String loc;
    private double distance;

    public GoogleMapsService(String loc , double distance){
        this.loc = loc;
        this.distance = distance;
    }

    @Override
    public void getCurrentLocation(){
        System.out.println("Your location is :- "+loc);
        System.out.println("Your location is ditact by Google Map.");
    }

    @Override
    public void calculateDistance(){
        System.out.println("You are "+distance+" km far for me.");
    }
}

class HereMapsService implements GeolocationService{
    private String loc;
    private double distance;

    public HereMapsService(String loc , double distance){
        this.loc = loc;
        this.distance = distance;
    }

    @Override
    public void getCurrentLocation(){
        System.out.println("Your location is :- "+loc);
        System.out.println("Your location is ditact by Here Map.");
    }

    @Override
    public void calculateDistance(){
        System.out.println("You are "+distance+" km far for me.");
    }
}

public class Task7 {
    public static void main(String[] args) {
        GoogleMapsService obj1 = new GoogleMapsService("Delhi", 530);
        HereMapsService obj2 = new HereMapsService("Mumbai", 490);

        obj1.getCurrentLocation();
        obj1.calculateDistance();

        obj2.getCurrentLocation();
        obj2.calculateDistance();
    }
}
