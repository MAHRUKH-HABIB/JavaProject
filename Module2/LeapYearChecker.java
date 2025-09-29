import java.util.Scanner;
public class LeapYearChecker {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
         System.out.print("Enter a year ");
         int lyearc=scanner.nextInt();
        if((lyearc%400==0) || (lyearc%4==0) && (lyearc%100!=0)){
             System.out.print(lyearc +  " " + "Entered Year is a leap year");
        }
        else{
             System.out.print(lyearc + " " +  "Entered Year is not a leap year");
        }
       scanner.close();
    }
    
}
