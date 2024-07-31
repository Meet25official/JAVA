// Scenario 8: File Processing Application
// Develop an interface called "FileProcessor" with methods like "readFile" and "writeFile." Implement classes like "TextFileProcessor" and "CSVFileProcessor" that provide specific implementations for these interface methods.

interface FileProcessor {
    void readFile(String filePath);
    void writeFile(String filePath, String content);
}

class TextFileProcessor implements FileProcessor {
    @Override
    public void readFile(String filePath) {
        System.out.println("Reading text file: " + filePath);
    }

    @Override
    public void writeFile(String filePath, String content) {
        System.out.println("Writing to text file: " + filePath);
        System.out.println("Content: " + content);
    }
}

class CSVFileProcessor implements FileProcessor {
    @Override
    public void readFile(String filePath) {
        System.out.println("Reading CSV file: " + filePath);
    }

    @Override
    public void writeFile(String filePath, String content) {
        System.out.println("Writing to CSV file: " + filePath);
        System.out.println("Content: " + content);
    }
}
public class Task8 {
    public static void main(String[] args) {
        FileProcessor textFileProcessor = new TextFileProcessor();
        textFileProcessor.writeFile("example.txt", "Hello, this is a text file.");
        textFileProcessor.readFile("example.txt");

        FileProcessor csvFileProcessor = new CSVFileProcessor();
        csvFileProcessor.writeFile("example.csv", "Name, Age, Country\nJohn, 30, USA\nJane, 25, UK");
        csvFileProcessor.readFile("example.csv");
    }
}
