/*Finding Area of Rectangle?

Sample Inputs:
length=5
breadth=20

Process:
Area=l*b

Sample Outputs:
Area of Rectangle=result */
import java.util.Scanner;
class AreaOfRectangle{
    public static void main(String[]args)
    {
       Scanner s=new Scanner(System.in);
       System.out.println("Enter Length:");
       int length=s.nextInt();
       System.out.println("Enter Breadth:");
       int breadth=s.nextInt();
       int area=length*breadth;
       System.out.println("Area of Rectangle="+area);
    }
}