/*
Task: Hotel Reservation System
Scenario: You are tasked with building a simple hotel reservation system. The hotel allows guests to book rooms, view available rooms, and cancel reservations. The system should maintain a list of rooms and reservations.

Requirements:

Room Management:

Each room has the following details: room number, type (e.g., Single, Double, Suite), and availability status (true for available, false for booked).
Store the list of rooms using an ArrayList.
Implement functionality to view all available rooms.               ok


Reservation:

A guest can book a room. If a room is booked, its availability status should change to false.
If a guest tries to book a room that is already booked, the system should show an appropriate message.
Once a room is booked, store the guest's details (name and room number) in an ArrayList of reservations.


Cancel Reservation:

A guest can cancel their booking by providing their name. Once a booking is canceled, the room should become available again.
The reservation should be removed from the reservation list.


View Reservations:

The system should allow viewing the list of all current reservations, displaying the guest name and room number.
Operations to Implement:

Add Room: Initialize a list of rooms when the system starts.

View Available Rooms: Display all available rooms.

Book Room: Allow a guest to book an available room.

Cancel Reservation: Allow a guest to cancel their reservation using their roomNumber.

View Reservations: Display all current reservations.

*/

import java.util.ArrayList;

class Room{
    private int roomNumber;
    private String type;
    boolean availability = true;

    public Room(int roomNumber , String type){
        this.roomNumber = roomNumber;
        this.type = type;
    }

    public void setRoomName(int roomNumber){
        this.roomNumber = roomNumber;
    }
    public void setType(String type){
        this.type = type;
    }
    public int getRoomNumber(){
        return roomNumber;
    }
    public String getType(){
        return type;
    }
    public boolean isAvailability() {
        return availability;
    }
    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
    public void display(){
        System.out.println("The room number is :- "+roomNumber);
        System.out.println("The type of this room is :- "+type);
        if(availability){
            System.out.println("The room is available.");
        }
        else{
            System.out.println("The room is not available.");
        }
    }
}

class Reservation{
    private String name;
    private int roomNumber;

    public Reservation(String name , int roomNumber){
        this.name = name;
        this.roomNumber = roomNumber;
    }

    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getRoomNumber() {
        return roomNumber;
    }
    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
}

class Managment{
    private ArrayList<Room> rooms = new ArrayList<>();
    private ArrayList<Reservation> reservations = new ArrayList<>();

    public void addRooms(Room room){
        rooms.add(room);
    }

    public void availableRoom(Room room){
        if (room.isAvailability()) {
            room.display();
        }
    }

    public void BookRoom(Reservation data){
        for (Room room : rooms) {
            if (room.getRoomNumber() == data.getRoomNumber()){
                reservations.add(data);
                room.setAvailability(false);
            }
        }
    }

    public void cancelResrvation(int roomNumber){
        
        for (Room room : rooms) {
            if(room.getRoomNumber() == roomNumber){
                room.setAvailability(true);
            }
        }
    }
}

public class MohakSir{
    public static void main(String[] args) {
        Managment obj = new Managment();
        Room obj1 = new Room(0, null)
    }
}