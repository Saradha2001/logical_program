import java.util.Scanner;
class VowelOrConsonent{
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        char alphabet=s.nextChar();
        if(alphabet=='a'||alphabet=='e'||alphabet=='i'||alphabet=='o'||alphabet=='u')
        {
            System.out.println("This alphabet is Vowel");
        }
        else
        {
            System.out.println("This alphabet is Consonent");

        }

    }
}