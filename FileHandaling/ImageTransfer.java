import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ImageTransfer {
    public static void main(String[] args) {
        FileInputStream in = null;
        FileOutputStream out = null;
        int ctr = 0;

        try{
            in = new FileInputStream("input.jpg");
            out = new FileOutputStream("output.jpg");
            int c;

            while ((c = in.read()) != -1){
                out.write(c);
                ctr++;
            }
        } catch(Exception e){
            e.printStackTrace();  
        }
        finally{
            try{
                if(in != null) in.close();
                if(out != null) out.close();
            } catch(Exception e){
                System.out.println("Error Closing File...");   
            }
        }
        System.out.println("Done");
        System.out.println("The total bytes of this copid image is :- "+ctr);
    }
}
