/*
Problem Statement:
You are building a basic simulation of a ride-sharing app. The system consists of multiple riders and drivers. Each rider will request a ride, and the system will assign a driver to the rider if one is available. Drivers take a certain amount of time to complete a ride, after which they are free to take another request.

Requirements:
Thread Creation and Runnable Interface:

Each rider and driver should be represented by a separate thread.
Use the Runnable interface to create both rider and driver threads.
Synchronization and Resource Sharing:

Use a shared resource pool (like a queue) to hold available drivers.
Synchronize access to the shared pool to avoid conflicts (e.g., using synchronized blocks or locks).
Inter-Thread Communication (wait/notify):

If no driver is available when a rider requests a ride, the rider thread should wait until a driver becomes available.
When a driver becomes available (after completing a ride), notify one of the waiting riders.
Thread Pool:

Create a fixed thread pool to handle a predefined number of drivers.
Handling Multiple Requests (Concurrency):

Multiple riders should be able to request rides at the same time.
Drivers should be assigned concurrently to handle the incoming rider requests.
 */

import java.util.ArrayList;

class Rider{
    ArrayList<String> name = new ArrayList<>();
    ArrayList<Integer> id = new ArrayList<>();  

} 

class MyThread implements Runnable{
    private String messege;

    public MyThread(String messege){
        this.messege = messege;
    }

    @Override
    public void run() {
        try {
            System.out.println("The ");
            Thread.sleep(30000);
        } catch (Exception e) {
            e.printStackTrace();    
        }
    }
}

public class MainTask {
    public static void main(String[] args) {
        MyThread t = new MyThread("Himesh");
        
    }
}