class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("running...");
    }
}

public class Fun {
    public static void main(String[] args) {
        MyThread t = new MyThread();

        // t.start();
        
        
        t.run();
        t.run();
        t.run();
        t.run();
        t.run();
        
    }
}

/*
Can we start same thread twice.
*/
