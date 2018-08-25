//GCD of two numbers by normal method
import java.util.Scanner;
public class Main
{
    static int gcd(int a, int b)
    {
        int value=0;
        if(a>b)
        {
            for(int i =1;i<=b;i++)
            {
                if(a%i == 0 && b %i == 0)
                {
                    value =i;
                }
            }
        }
        else
        {
            for(int i =1;i<=a;i++)
            {
                if(a%i == 0 && b %i == 0)
                {
                    value =i;
                }
            }
        }
        return value;
    }
	public static void main(String[] args)
	{
	    int a,b;
	    Scanner in = new Scanner(System.in);
	    System.out.println("Enter the values of a and b");
	    a = in.nextInt();
	    b = in.nextInt();
	    System.out.printf("The GCD of %d and %d is %d",a,b,gcd(a,b));
	}
}
