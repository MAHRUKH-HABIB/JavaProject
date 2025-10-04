import java.util.Scanner;
public class SumAverage {
    public static void main(String[] args){
     Scanner sc= new Scanner(System.in);
     System.out.println("How many numbers you want to enter?");
     int number=sc.nextInt();
     int sum=0;
     for(int i=1;i<=number;i++){
        System.out.print("Enter number " + i + " " + "= " );
        int enterednumber=sc.nextInt();
        sum = sum+enterednumber;
     }  
     double average= (double) sum/number;
     System.out.println("The average of entered numbers is:  " + average );
     sc.close();   
    }
   }