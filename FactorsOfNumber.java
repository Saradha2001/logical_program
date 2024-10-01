import java.util.Scanner;
class FactorsOfNumber{
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter n:");
        int n=s.nextInt();
        for(int i=1;i<=n/2;i++)
        {
            if (n%i==0)
            {
                System.out.println(i);
            }
        }
        
        
    }
}
/* 
OUTPUTS:
Enter n:
20
1
2
4
5
10
*/