import java.util.Scanner;
class CountOfDigit{
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter n:");
        int n=s.nextInt();
        int c=0;
        while(n!=0)
        {
            
            n=n/10;
            c=c+1;

        }
        System.out.println(c);


    }
}
/*Output:
Enter n:
1224
4
*/