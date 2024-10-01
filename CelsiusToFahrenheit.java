/*Convert Celsius to Fahrenheit?

Sample Inputs:
celsius=40

Process:
Fahrenheit=celsius*(9/5)+32

Sample Outputs:
Fahrenheit=72.0
*/
import java.util.Scanner;
class CelsiusToFahrenheit{
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter celsius:");
        float celsius=s.nextFloat();
        float fahrenheit=celsius*(9/5)+32;
        System.out.println(fahrenheit);
    }
}
/*OUTPUTS:
Enter celsius:
40
72.0
*/
