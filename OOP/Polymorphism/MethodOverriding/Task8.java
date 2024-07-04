// 8. Problem: Design a scheduling application that schedules events of various types (meetings, appointments, tasks). Use method overloading to add events to the schedule.
//    - Example: Implement a `Scheduler` class with overloaded `addEvent` methods for different event types, each with relevant parameters.

class Event {
    private String title;
    private String startTime;
    private String endTime;

    public Event(String title, String startTime, String endTime) {
        this.title = title;
        this.startTime = startTime;
        this.endTime = endTime;
    }
    
    public String getTitle() {
        return title;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }
}

class Scheduler {
    private Event[] events;
    private int size;
    private static final int INITIAL_CAPACITY = 10;

    public Scheduler() {
        this.events = new Event[INITIAL_CAPACITY];
        this.size = 0;
    }

    public void addMeeting(String title, String startTime, String endTime, String location) {
        Event meeting = new Event("Meeting: " + title + " at " + location, startTime, endTime);
        addEvent(meeting);
    }

    public void addAppointment(String title, String startTime, String endTime, String participant, String location) {
        Event appointment = new Event("Appointment with " + participant + ": " + title + " at " + location, startTime, endTime);
        addEvent(appointment);
    }

    public void addTask(String title, String startTime, String endTime) {
        Event task = new Event("Task: " + title, startTime, endTime);
        addEvent(task);
    }

    private void addEvent(Event event) {
        if (size == events.length) {
            increaseCapacity();
        }
        events[size] = event;
        size++;
        System.out.println("Event added: " + event.getTitle());
    }

    private void increaseCapacity() {
        Event[] newArray = new Event[events.length * 2];
        for (int i = 0; i < events.length; i++) {
            newArray[i] = events[i];
        }
        events = newArray;
    }
    public void displayEvents() {
        System.out.println("Scheduled Events:");
        for (int i = 0; i < size; i++) {
            Event event = events[i];
            System.out.println(event.getTitle() + " from " + event.getStartTime() + " to " + event.getEndTime());
        }
    }
}
public class Task8 {
    public static void main(String[] args) {
        Scheduler scheduler = new Scheduler();
        scheduler.addMeeting("Team Meeting", "10:00 AM", "11:00 AM", "Conference Room A");
        scheduler.addAppointment("Dentist Appointment", "2:30 PM", "3:30 PM", "John Doe", "Dental Clinic");
        scheduler.addTask("Write Report", "3:00 PM", "5:00 PM");

        scheduler.displayEvents();
    }
}
