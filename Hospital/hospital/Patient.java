package hospital;

public class Patient {
    private String PName;
    private double PANum;

    public Patient(String PName, double PANum){
        this.PName = PName;
        this.PANum = PANum;
    }

    public String getPName(){
        return "Patient"
    }
}
