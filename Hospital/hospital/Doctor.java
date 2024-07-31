package hospital;

public class Doctor {
    private String DName;
    private double DId;

    public Doctor(String DName, double DId){
        this.DName = DName;
        this.DId = DId;
    }

    public String getDName(){
        return "Doctor Name is: " + DName;
    }

    public String getDId(){
        return "Doctor ID is: " + DId;
    }
}