import  java.util.Scanner;
public class TrafficLight {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter a colour for traffic light(RED,YELLOW OR GREEN)");
        String colour=scanner.nextLine();
        if(colour.equals("RED")){
            System.out.print("STOP");
        }
        else if(colour.equals("YELLOW")){
            System.out.print("SLOW DOWN");
        }
        else if(colour.equals("GREEN")){
            System.out.print("GO");
        }
        else{
            System.out.print("Invalid colour");
        }
        scanner.close();
      

    }
    
}
