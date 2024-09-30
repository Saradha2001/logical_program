/*check Given number is Positive or Negative?
Sample Inputs:
n=2

process:
>o=positive
<0=negative
0=not consider

Sample Outputs:
This number is Positive
*/

import java.util.Scanner;
class PositiveOrNegative{
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter n:");
        int n=s.nextInt();
        if(n>0){
            System.out.println("This number is Positive");
        }
        else
        {
            System.out.println("This number is Negative");
        }
    }
}
/*OUTPUTS:
Enter n:
-12
This number is Negative
Enter n:
9
This number is Positive
*/