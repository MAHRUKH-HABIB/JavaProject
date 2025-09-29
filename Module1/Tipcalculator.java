import java.util.Scanner;   
public class Tipcalculator {   
        public static void main(String[] args) {   
        Scanner scanner = new Scanner(System.in);  

        System.out.print("Enter the bill amount: ");   
        double billAmount = scanner.nextDouble();     

        System.out.print("Enter tip percentage (e.g., 15 for 15%): "); 
        double tipPercentage = scanner.nextDouble();   

        double tipAmount = billAmount * (tipPercentage / 100);  
    
        double totalAmount = billAmount + tipAmount;   
        
        System.out.println("Tip amount: " + tipAmount);   
        
        System.out.println("Total amount (bill + tip): " + totalAmount);   
        
        scanner.close(); 
    }
}