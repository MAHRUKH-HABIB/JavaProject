
import java.util.Scanner;
public class CalculatorApp{
  public static int calculateProduct(int num1,int num2)
  {
return num1*num2;

  }
  public static double calculateQuotient(double num1,double num2)
  {
    return num1/num2;
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("--------***---------   Menue   --------***---------  ");
    System.out.println("          1- Enter first number for product:   ");
    int num1=sc.nextInt();
    System.out.println("          2- Enter second number for product:   ");
    int num2=sc.nextInt();
    int product=calculateProduct(num1,num2);
    System.out.println("Product of entered numbers is:   " + product);


    System.out.println("          1- Enter first number for division:   ");
    double number1 =sc.nextInt();
    System.out.println("          2- Enter second number for division:   ");
    double number2 =sc.nextInt();
    
    if(number2 !=0){
      double quotient=calculateQuotient(number1,number2);
      System.out.println("Quotient of entered numbers is:   " + quotient);
    }
    else{
      System.out.println("Can't divide by zero");
      
sc.close();
    }
    
  }
}