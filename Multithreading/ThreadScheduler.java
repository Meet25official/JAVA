class MyThread extends Thread {
    MyThread() {
        super();
    }

    MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + ": " + i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadScheduler {
    public static void main(String[] args) {
        // Thread t1 = new Thread();
        // System.out.println(t1.getName());
        // Thread t2 = new Thread();
        // System.out.println(t2.getName());

        MyThread t1 = new MyThread("T1");
        MyThread t2 = new MyThread("T2");

        t1.setPriority(Thread.NORM_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();


    }
}

/*
Thread Scheduler:

component -> decides which thread should execute itself

a thread only gets chosen by it if it's in runnable state.

1. priority and 2. time of arrival

3 algorithms/methods:

1. first come first serve Scheduling
2. Time Slicing Scheduling
3. Preemptive-Priority Scheduling


sleep()

*/