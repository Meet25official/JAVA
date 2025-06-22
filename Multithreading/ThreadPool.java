// import java.lang.reflect.Executable;
// import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkThread implements Runnable{
    private String messege;

    public WorkThread(String s){
        this.messege = s;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "(Start) messege "+ messege);
        proceesMessege();        
        System.out.println(Thread.currentThread().getName() + "(End)");
    }

    public void proceesMessege(){
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class ThreadPool {
    public static void main(String[] args) {
        ExecutorService executer = Executors.newFixedThreadPool(5);

        for(int i = 0; i < 100; i++) {
            Runnable worker = new WorkThread("" +i);
            executer.execute(worker); 
        }
        executer.shutdown();

        while (!executer.isTerminated()) {}
        System.out.println("Finished all Threads!!!");
    }
}