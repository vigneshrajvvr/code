//fibonacci series
import java.util.Scanner;
public class Main
{
    static int sum = 0;
	public static void main(String[] args) 
	{
	    int first = 1;
	    int second = 1;
	    Scanner in = new Scanner(System.in);
	    System.out.println("Enter the number of elements in the fibonacci series :");
	    int n = in.nextInt();
	    System.out.println("Fiobnacci series :");
	    if(n == 1)
	    {
	        System.out.println(""+first);
	    }
	    else if(n == 2)
	    {
	        System.out.println(""+first+"\n"+second);
	    }
	    else
	    {
	        System.out.println(""+first+"\n"+second);
		    for(int i =0;i<n-2;i++)
		    {
		        sum = first + second;
		        System.out.println(""+sum);
		        first = second;
		        second = sum;
		    }
	    }
	}
}
