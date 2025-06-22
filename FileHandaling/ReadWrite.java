import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

class FileHandling{
    FileWriter fout = null;
    FileReader fin = null;
    Scanner sc = new Scanner(System.in);

    public void WriteData(String fileName , String folderPath){
        if(folderPath == null){
            folderPath = "";
        }
        try{
            fout = new FileWriter(folderPath + fileName + ".txt");
            System.out.println("Enter the data you want to write in this file :- "+fileName);
            String data = sc.nextLine();
            
            fout.write(data);
            fout.close();
            System.out.println("\n\nFile Written Succesfully.!!!");
        }catch (Exception e) {
           e.printStackTrace(); 
        }
    }

    public void ReadData(String fileName , String folderPath){
        if(folderPath == null){
            folderPath = "";
        }
        
        try {
            fin = new FileReader(folderPath + fileName + ".txt");
            int i = 0;
            while ((i = fin.read()) != -1) {
                System.out.print((char)i);
            }
            fin.close();
            System.out.println("\n\nEnd of File...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class ReadWrite{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        FileHandling fh = new FileHandling();
        String fname = "";
        int choice;

        do {
            System.out.println("1------------------->Write File");
            System.out.println("2------------------->Read File");
            System.out.println("0------------------->Exit File");
            System.out.println("Enter your choice :- ");
            choice = sc.nextInt();

            switch (choice){
                case 1:
                        System.out.println("Enter the file name :- ");
                        fname = sc.next();
                        fh.WriteData(fname,null);
                        break;
                case 2:
                        System.out.print("Enter the name of the file: ");
                        fname = sc.next();
                        fh.ReadData(fname, null);
                        break;
                case 0:
                        System.out.println("Exiting the Programm.");
                        break;

                default:
                        System.out.println("Invalid Choice!!!");
                        break;
            }
        } while (choice != 0);
        sc.close();
    }
}