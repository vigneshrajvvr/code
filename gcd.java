//GCD of a number in various ways
import java.util.Scanner;
public class Main
{
    static int gcd(int a, int b) // Using normal method
    {
        int value=0;
        if(a==b)
        {
            value = a;
        }
        else if(a>b)
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
    static int gcdeuclidean(int a, int b) // Using euclidean algorithum
    {
        int value;
        if(a==b)
        {
            value = a;
        }
        else if(a>b)
        {
            value = a%b;
            while(value !=0)
            {
                a=b;
                b=value;
                if(a %b == 0)
                    break;
                value = a %b;
            }
        }
        else
        {
            value = b%a;
            while(value !=0)
            {
                b=a;
                a=value;
                if(b%a == 0)
                    break;
                value = b %a;
            }
        }
        return value;
    }
    static int gcdrecursion(int a, int b)//using recursion
    {
        if(b==0)
        {
            return a;
        }
        return gcdrecursion(b,a%b);
    }
	public static void main(String[] args)
	{
	    int a,b;
	    Scanner in = new Scanner(System.in);
	    System.out.println("Enter the values of a and b");
	    a = in.nextInt();
	    b = in.nextInt();
	    System.out.printf("The GCD of %d and %d is %d",a,b,gcd(a,b));
	    System.out.printf("\nThe GCD of %d and %d using euclidean algorithm is %d",a,b,gcdeuclidean(a,b));
	    System.out.printf("\nThe GCD of %d and %d using recursion is %d",a,b,gcdrecursion(a,b));
	}
}

