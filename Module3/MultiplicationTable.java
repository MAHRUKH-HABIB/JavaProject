import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args){
        int multiple=1;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number=sc.nextInt();
         System.out.println("Standard multiplication of " +  number + " is: ");
        for(int times= 1;times <=10;times++){
            multiple=number*times;
            System.out.println( number + "*" + times + "=" + multiple);
        }
       sc.close();
        }
    
}
