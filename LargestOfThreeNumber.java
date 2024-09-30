/*Largest of three numbers?

Sample Inputs:
a=10;b=30;c=5;

process
a>b && a>c
b>c

Sample Ouputs:
b is Greater
*/

import java.util.Scanner;
class LargestOfThreeNumber{
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a:");
        int a=s.nextInt();
        System.out.println("Enter b:");
        int b=s.nextInt();
        System.out.println("Enter c:");
        int c=s.nextInt();
        if(a>b && a>c)
        {
            System.out.println("a is Greater");
        }
        else if (b>c)
        {
            System.out.println("b is Greater");
        }
        else{
            System.out.println("c is Greater");
        }
       
    }
}
/*
OUTPUT:

Enter a:
10
Enter b:
30
Enter c:
5
b is Greater
*/