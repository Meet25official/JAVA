package RonakSir;

class UserName{
    private String firstname;
    private String lastname;
    private String email;
    private int age;

    public UserName(String f, String l, String e, int a){
        firstname = f;
        lastname = l;
        email = e;
        age = a;
    }

    public String getFirstName(){
        return firstname;    
    }
    public String getLastName(){
        return lastname;
    }
    public String getEmail(){
        return email;
    }
    public int getAge(){
        return age;
    }

    public void setFirstName(String firstname){
        this.firstname = firstname;    
    }
    public void setLastName(String lastname){
        this.lastname = lastname;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setAge(int age){
        this.age = age;
    }
}
