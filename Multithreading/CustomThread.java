import java.util.Random;

class MyThread extends Thread{
    public MyThread(String name){
        super(name);
    }

    @Override
    public void run(){
        Random random = new Random();
        try {
            int sleepTime = random.nextInt(500) + 100;
            super.sleep(sleepTime);
            System.out.println(Thread.currentThread().getName() + " slept for " + sleepTime + " ms.");
        } catch (Exception e) {
            System.out.println(Thread.currentThread().getName() + " was interrupted!");
        }
    }
    
}

public class CustomThread {
    public static void main(String[] args) {
        MyThread[] multiMyThreads = new MyThread[10];
        for (int i = 0; i < 10; i++) {
            multiMyThreads[i] = new MyThread("EveGen " + i);
            multiMyThreads[i].start();
            System.out.println(multiMyThreads[i].getName() + " is started!");
        }

        for(int i = 0; i < multiMyThreads.length; i++) {
            multiMyThreads[i].run();
        }
        System.out.println("All threads have finished execution");
    }
}