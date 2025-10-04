import java.util.Scanner;

public class ProjectNumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number=7;
        int attempts;
for(attempts=1;attempts<=10;attempts++){
    System.out.println("Enter your guess: ");
    int guess = sc.nextInt();
    if(guess==number){
        System.out.println("Guess Successfull!");
       break;
    }
    else if(guess<number){
           System.out.println("Too Low!Try Again!");
           
    }
    else if(guess>number){
           System.out.println("Too High!Try Again!");
          
    }
    if(attempts==10){
System.out.println("Sorry,Your are out of attempts!"); 
} 
}

   sc.close();  
    }
   
}