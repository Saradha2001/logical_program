/*Factorial without using function?

Sample Inputs:

n=5

Process:

f=1;
for(i=1;i<=n;i++)
f=f*i;

Sample Outputs:

Factorial of 5 is 120
*/
import java.util.Scanner;
class Factorial{
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter n:");
        int n=s.nextInt();
        int f=1;
        for(int i=1;i<=n;i++)
        f=f*i;
        System.out.println("Factorial of " +n+"is "+f);
        }
}
/*OUTPUT:
Enter n:
5
Factorial of 5is 120
*/