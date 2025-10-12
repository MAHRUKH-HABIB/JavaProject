import java.util.Scanner;
public class AreaCalculator {
   public int  calculateArea(int side)
   {
return side*side;
    }
    public int calculateArea(int length,int width)
    {
        return length*width;
    }
    public void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter side to calculate area of square:  ");
        int side=sc.nextInt();
        double squareArea=calculateArea(side);
        System.out.println("The area of square is:  "+ squareArea);
        System.out.println("Enter length:  ");
        int length=sc.nextInt();
        System.out.println("Enter width:  ");
        int width=sc.nextInt();
        double rectangleArea=calculateArea(length,width);
        System.out.println("The area of rectangle is:  "+ rectangleArea);
                sc.close();

    }
}
