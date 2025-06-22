// 6. Create a simple password validation system that prompts the user to enter a password and checks if it meets certain criteria (e.g., minimum length, containing numbers and special characters).
import java.util.Scanner;
public class Task6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the PassWord: ");
		String p = sc.nextLine();
		int caps = 0, digits = 0, specials = 0;
        boolean flag = false;
        for(int i = 0 ; i < p.length(); i++) {
            if(p.charAt(i) == ' ') {
                flag = true;
                break;
            } else if((p.charAt(i) >= 'A' && p.charAt(i) <= 'Z') || (p.charAt(i) >= 'a' && p.charAt(i) <= 'z')) {
                caps++;
            } else if(p.charAt(i) >= '0' && p.charAt(i) <= '9') {
                digits++;
            } else {
                specials++;
            }
        }

        if(flag) System.out.println("Passwords can not have spaces"); 
        else if(caps > 0 && digits > 0 && specials > 0 && p.length() >= 8) System.out.println("Password is valid!");
        else System.out.println("Invalid Password!");

    }
}