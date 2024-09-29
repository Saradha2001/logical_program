/* Check the given number is odd or even?
Sample Inputs:
Given num=5
Process:
check given number is divisible by 2 or not
Sample Outputs:
Given num is even/Given num is odd */
import java.util.Scanner;
class EvenOrAdd{
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter n:");
        int n=s.nextInt();
        if(n%2==0)
        {
            System.out.println("Given num is even");
        }
        else
        {
            System.out.println("Given num is odd");
        }
    }
}
/*OUTPUT:
Enter n:
5
Given num is odd
*/
