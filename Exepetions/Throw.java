class Himesh {
    public static void study(int milliseconds) {
        if(milliseconds >= 1000) {
            throw new ArithmeticException("Leave it!");
        }
        else {
            System.out.println("Study Now...");  
        }
    }
}

class ClassWork {
    public static void loadClass(String path) throws ClassNotFoundException {
        if(path.isEmpty()) throw new ClassNotFoundException("Path Should not be empty!");
        else Class.forName(path);
    } 
}

public class Throw {
    public static void main(String[] args) {
        try {
            // Himesh.study(999);
            // ClassWork.loadClass("235");
        } catch (Exception e) {
            // System.out.println(e.getMessage());
            // e.printStackTrace();
        }
    }
}