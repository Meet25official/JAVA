//Scenario 4: Contact Management
// In a contact management application, create an array to store contact information such as names, phone numbers, and email addresses. Implement features such as adding new contacts, searching for a specific contact, and deleting contacts from the array.

class Information{
    private String name;
    private String no;
    private String email;

    public Information(String name, String no , String email){
        this.name = name;
        this.no = no;
        this.email = email;
    }

    public void display(){
        System.out.println("The name is :- "+name);
        System.out.println("The contact number is :- "+no);
        System.out.println("The email is :- "+email);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

class Contact{
    Information list[];
    int count;
    
}

public class Task4 {
    public static void main(String[] args) {
        
    }
}
