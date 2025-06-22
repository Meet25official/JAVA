// class Table{
//     synchronized void printTable(int n){       //Syncronized Method
//         for (int i = 1; i < 10; i++) {
//             System.out.println(n+" * "+i+" = "+n*i);
//             try {
//                 Thread.sleep(2000);
//             } catch (Exception e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// import javafx.scene.control.Tab;

class Table{
    void printTable(int n){       
        synchronized(this){                 //Syncronized Block
            for (int i = 1; i <=10; i++) {
                System.out.println(n+" * "+i+" = "+n*i);
                try {
                    Thread.sleep(2000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class MyThread1 extends Thread{
    int n;
    Table t;
    public MyThread1(Table t ,int n){
        this.t = t;
        this.n = n;
    }

    @Override
    public void run(){
        t.printTable(n);
    }
}

class MyThread2 extends Thread{
    Table t;

    public MyThread2(Table t){
        this.t = t;
    }

    @Override
    public void run() {
        t.printTable(2);
    }

}

public class ThreadSync{
    public static void main(String[] args) {
        Table t = new Table();
        MyThread1 t1 = new MyThread1(t, 3);
        MyThread2 t2 = new MyThread2(t);
        // t1.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
    }
}