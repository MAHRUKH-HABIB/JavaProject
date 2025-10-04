public class CountDownTimerForLoop {
    public static void main(String[] args){
       int counter=10;
        while(counter>0){
             for(int number=10;number>0;number--){
                System.out.println(number);
                counter--;
            }
            System.out.println("Blast Off!");
             break;
        }
           
        
    }
    
}
