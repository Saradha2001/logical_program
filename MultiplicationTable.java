import java.util.Scanner;
class MultiplicationTable{
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter n:");
        int n=s.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(i+"*"+n+"="+ i*n);
        }
    }
}

/*
OUTPUT:
Enter n:
5
1*5=5
2*5=10
3*5=15
4*5=20
5*5=25
6*5=30
7*5=35
8*5=40
9*5=45
10*5=50
*/