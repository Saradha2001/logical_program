/*swap value of two variables?

Sample Inputs
a=10
b=5

Sample Outputs
a=5
b=10

process
c=a;a=b;b=c */

import java.util.Scanner;
class Swap{
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a:");
        int a=s.nextInt();
        System.out.println("Enter b:");
        int b=s.nextInt();
        int c=a;
        a=b;
        b=c;
        System.out.println("After Swapping value of a is:"+a);
        System.out.println("After Swapping value of b is:"+b);
    }
}

/* OUTPUT:

Enter a:
10
Enter b:
5
After Swapping value of a is:5
After Swapping value of b is:10
*/