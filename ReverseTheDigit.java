import java.util.Scanner;
class ReverseTheDigit{
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter n:");
        int n=s.nextInt();
        int r=0;
        while(n!=0)
        {
            int a=n%10;
            r=r*10+a;
            n=n/10;

        }
       
        System.out.println(r);


    }
}