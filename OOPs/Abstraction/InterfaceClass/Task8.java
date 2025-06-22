//Scenario 8: File Processing Application
// Develop an interface called "FileProcessor" with methods like "readFile" and "writeFile." Implement classes like "TextFileProcessor" and "CSVFileProcessor" that provide specific implementations for these interface methods.

interface FileProcessor{
    void readFile();
    void writeFile();
}

class TextFileProcessor implements FileProcessor{
    private String type;
    private int size;

    public TextFileProcessor(String type , int size){
        this.type = type;
        this.size = size;
    }

    @Override
    public void readFile(){
        System.out.println("The file is read by the system.");
        System.out.println("The type of this file is :- "+type);
    }

    @Override
    public void writeFile(){
        System.out.println("The file is write by users now.");
        System.out.println("The size of this file is :- "+size+" kb");
    }
}

class CSVFileProcessor implements FileProcessor{
    private String type;
    private int size;

    public CSVFileProcessor(String type , int size){
        this.type = type;
        this.size = size;
    }

    @Override
    public void readFile(){
        System.out.println("The file is read by the system.");
        System.out.println("The type of this file is :- "+type);
    }

    @Override
    public void writeFile(){
        System.out.println("The file is write by users now.");
        System.out.println("The size of this file is :- "+size+" kb");
    }
}

public class Task8 {
    public static void main(String[] args) {
        TextFileProcessor obj1 = new TextFileProcessor("TextFile", 34);
        CSVFileProcessor obj2 = new CSVFileProcessor("CSVFile", 67);

        obj1.readFile();
        obj1.writeFile();

        obj2.readFile();
        obj2.writeFile();
    }
}