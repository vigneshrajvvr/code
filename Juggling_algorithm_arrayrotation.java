//Not yet completed
import java.util.Scanner;
class arrayrotation
{
    int temp,k;
    int [] leftrotation(int arr[], int n, int d)
    {
        for(int i =0;i<gcd(n,d);i++)
        {
            temp = arr[i];
            k=i;
            for(int j =i;j<d;j++)
            {
                arr[j] = arr[(j+d) %n];
                k = (k+d)%n;
            }
            arr[k] = temp;
        }
        return arr;
    }
    int gcd(int a , int b)
    {
        if(b==0)
        {
            return a;
        }
        return gcd(b, a%b);
    }
}
public class Main
{
    public static void main(String args[])
    {
        int n,k;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements :");
        n = in.nextInt();
        int arr[] = new int[n];
        System.out.println("Array elements :");
        for(int i =0;i<n;i++)
        {
            arr[i] = in.nextInt();
        }
        System.out.println("Enter the number of rotations :");
        k = in.nextInt();
        arrayrotation a = new arrayrotation();
        arr = a.leftrotation(arr,n,k);
        System.out.println("Rotated array :");
        for(int i =0;i<n;i++)
        {
            System.out.println(""+arr[i]);
        }
    }
}
