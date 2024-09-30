/*check the year is leap or not?
Sample Inputs:
year=2024

process:
Given year is divisible by 4 = leap year 
Otherwise not a leap.

Sample Outputs:
2024 is a Leap year
*/
import java.util.Scanner;
class LeapyearOrNot{
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Year:");
        int year=s.nextInt();
        if(year%4==0)
        {
            System.out.println(year +"is a Leap Year");
        }
        else
        {
            System.out.println(year +"is a not a Leap Year");
        }
    }

}
/*OUTPUT:
Enter Year:
2024
2024is a Leap Year
*/