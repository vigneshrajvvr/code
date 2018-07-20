//Not yet completed
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
	    int arr[][] = new int[100][100],i,j, sum =0,O1=0,I1=0,O2=3,I2=3,k;
	    Scanner in = new Scanner(System.in);
	    for(i = 0;i<6;i++)
	    {
	        for(j=0;j<6;j++)
	        {
	            arr[i][j] = in.nextInt();
	        }
	    }
	    for(k=0;k<4;k++)
	    {
	        for(i =O1;i<O2;i++)
	        {
	            for(j=I1;j<I2;j++)
	            {
	                sum =sum + arr[i][j];
	            }
	        }
	        O1++;
	        O2++;
	        I1++;
	        I2++;
	        System.out.println(""+sum);
	    }
	}
}

