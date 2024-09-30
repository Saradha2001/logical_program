//check the alphabet is Vowels or Consonant?
import java.util.Scanner;
class VowelOrConsonent
{
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the word:");
        char alphabet=s.next().charAt(0);
        if(alphabet=='a'||alphabet=='e'||alphabet=='i'||alphabet=='o'||alphabet=='u')
        {
            System.out.println("This alphabet is Vowel");
        }
        else
        {
            System.out.println("This alphabet is Consonant");

        }

    }
}
/*OUTPUTS:
Enter the word:
icecream
This alphabet is Vowel
*/