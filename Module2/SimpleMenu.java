import java.util.Scanner;
public class SimpleMenu {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in); 
     System.out.println("  "  + "Bank Menu" + " ");
     System.out.println("Welcome to your Bank Account");
     System.out.println("  " + "1.View Balance");
     System.out.println("  " + "2.Deposit");
     System.out.println("  " + "3.Withdraw");
     System.out.println("  " + "4.Exit");
     System.out.println("  " + "Enter Your Choice:" + " ");
     int choice=scanner.nextInt();
     switch(choice){
        case 1:
        System.out.print("Viewing balance:");
        break;
        case 2:
        System.out.print("Proceeding to Deposit");
        break;
        case 3:
        System.out.print("Initially withdrawal :");
        break;
        case 4:
        System.out.print("Exiting Thankyou!");
        break;
        default:
        System.out.print("Invalid choice.Please try again");
        break;
     }
     scanner.close();
    }
}
