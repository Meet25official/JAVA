// 6. Static Factory Method:
//    Create a 'Time' class with fields 'hour' and 'minute'. Implement a private constructor and a static factory method 'of' that takes 'hour' and 'minute' as parameters and returns a new 'Time' object. The factory method should validate that the 'hour' is between 0 and 23 and the 'minute' is between 0 and 59.

class Time{
    private int hour,minute;

    private Time(int hour, int minute){
        this.hour = hour;
        this.minute = minute;
    }

    public static Time of(int hour, int minute){
        if(hour < 0 || hour > 23 || minute < 0 || minute > 59){
            System.out.println("Invalid time. Setting default time to 00:00.");
            return new Time(00, 00);
        }
        else{
            return new Time(hour, minute);
        }
    }
    public void getTimeDetails(){
        System.out.println(String.format("Time: %02d:%02d", hour, minute));
    }
}
public class Task6{
    public static void main(String[] args) {
        Time t1 = Time.of(16, 34);
        t1.getTimeDetails();
    }
}