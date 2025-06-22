// 3. Healthcare System: Patient Not Found Exception

// Problem Statement:
// In a healthcare system, handle cases where a patient is not found in the system during a search or update operation. Create a custom exception `PatientNotFoundException` to represent this condition.

class PatientNotFoundExceptione extends Exception{
    public PatientNotFoundExceptione(String messege){
        super(messege);
    }
}

class Healthcare{
    private String name;
    private int id;

    public Healthcare(String name , int id){
        this.name = name;
        this.id = id;
    }

    public void search() throws PatientNotFoundExceptione{
        if(id == 23){
            System.out.println("The Patient is found and name of this patient is :- "+name);
        }
        else{
            throw new PatientNotFoundExceptione("Patient is not found on your bed.");
        }
    }
}

public class Task3 {
    public static void main(String[] args) {
        Healthcare obj = new Healthcare("Himesh",27);
        try {
            obj.search();
        } catch (Exception e) {
            e.printStackTrace();
        }        
    }
}