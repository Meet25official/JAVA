// Scenario 7: Geolocation Services
// Design an interface called "GeolocationService" with methods like "getCurrentLocation" and "calculateDistance." Implement classes like "GoogleMapsService" and "HereMapsService" that provide specific implementations for these interface methods.

interface GeolocationService {
    String getCurrentLocation();
    double calculateDistance(String location1, String location2);
}

class GoogleMapsService implements GeolocationService {
    @Override
    public String getCurrentLocation() {
        String currentLocation = "Google Maps Location";
        System.out.println("Getting current location from Google Maps: " + currentLocation);
        return currentLocation;
    }

    @Override
    public double calculateDistance(String location1, String location2) {
        double distance = 10.0; 
        System.out.println("Calculating distance between " + location1 + " and " + location2 + " using Google Maps: " + distance + " km");
        return distance;
    }
}

class HereMapsService implements GeolocationService {
    @Override
    public String getCurrentLocation() {
        String currentLocation = "Here Maps Location";
        System.out.println("Getting current location from Here Maps: " + currentLocation);
        return currentLocation;
    }

    @Override
    public double calculateDistance(String location1, String location2) {
        double distance = 12.0;
        System.out.println("Calculating distance between " + location1 + " and " + location2 + " using Here Maps: " + distance + " km");
        return distance;
    }
}
public class Task7 {
    public static void main(String[] args) {
        GeolocationService googleMaps = new GoogleMapsService();
        System.out.println("Google Maps - Current Location: " + googleMaps.getCurrentLocation());
        System.out.println("Google Maps - Distance: " + googleMaps.calculateDistance("Location A", "Location B") + " km");

        GeolocationService hereMaps = new HereMapsService();
        System.out.println("Here Maps - Current Location: " + hereMaps.getCurrentLocation());
        System.out.println("Here Maps - Distance: " + hereMaps.calculateDistance("Location A", "Location B") + " km");
    }
}
