import java.util.Scanner;
public class LoginSimulator {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter username and password: ");
       String  username= sc.nextLine();
       String  password= sc.nextLine();
       if(username.equals("admin") && password.equals("admin4")){
        System.out.print("Login Successfull ");
       }
       else{
        System.out.print("Invalid credentials ");
       }
       sc.close();
        }
    
}
