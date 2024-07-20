// Scenario 8: Travel Itinerary Planner
// Create a travel itinerary planning system where a trip consists of multiple destinations. The trip class contains a list of destination objects, representing an aggregation relationship.

class Destination {
    String name;
    String country;

    public Destination(String name, String country) {
        this.name = name;
        this.country = country;
    }

    @Override
    public String toString() {
        return "name= " + name + ", country= " + country;
    }
}

class Trip {
    private Destination[] destinations;
    private int count;

    public Trip(int maxDestinations) {
        destinations = new Destination[maxDestinations];
        count = 0;
    }

    public void addDestination(Destination destination) {
        if (count < destinations.length) {
            destinations[count++] = destination;
        } else {
            System.out.println("Trip itinerary is full, cannot add more destinations.");
        }
    }

    public void printItinerary() {
        System.out.println("Trip itinerary:");
        for (int i = 0; i < count; i++) {
            System.out.println(destinations[i]);
        }
    }

    public int getNumberOfDestinations() {
        return count;
    }
}
public class Task8 {
    public static void main(String[] args) {
        Trip trip = new Trip(5);

        Destination dest1 = new Destination("Ind", "Tokyo");
        Destination dest2 = new Destination("Ind", "U.S.");

        trip.addDestination(dest1);
        trip.addDestination(dest2);

        trip.printItinerary();

        System.out.println("Total number of destinations: " + trip.getNumberOfDestinations());
    }
}
