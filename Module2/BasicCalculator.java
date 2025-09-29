import java.util.Scanner;
public class BasicCalculator {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("---Your Basic Calculator---");
         System.out.println("Enter the First number for calculation: ");
         double firstnumber =scanner.nextDouble();
         System.out.println("Enter the Second number for calculation: ");
         double secondnumber =scanner.nextDouble();
         System.out.println("Enter the operation you want to perform");
           char operation=scanner.next().charAt(0);
          scanner.close();
          double result;
          switch(operation){
            case '+':
            result=firstnumber+secondnumber;
            System.out.print("The result of addition of numbers is:" + result);
            break;
            case '-':
            result=firstnumber-secondnumber;
            System.out.print("The result of subtracation is:" + result);
            break;
            case '*':
            result=firstnumber*secondnumber;
            System.out.print("The result of multiplicationis:" + result);
            break;
            case '/':
            result=firstnumber/secondnumber;
            System.out.print("The result of division is:" + result);
            break;
            default:
            System.out.print("Invalid operator.");
            break;

          }
    }
    
}
