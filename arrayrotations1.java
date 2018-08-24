//using temp[] array
//Time complexity : O(n)
//Auxiliary Space : O(d)
import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int n,d,j=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Length of array :");
        n = in.nextInt();
        int arr[] = new int[n];
        System.out.println("Array elements :");
        for(int i =0;i<n;i++)
        {
            arr[i] = in.nextInt();
        }
        System.out.println("Number of rotations :");
        d = in.nextInt();
        int temp[] = new int[d];
        for(int i =0;i<d;i++)
        {
            temp[i] = arr[i];
        }
        for(int i =0;i<n-d;i++)
        {
            arr[i] = arr[i+d];
        }
        for(int i = n-d; i<n;i++)
        {
            arr[i] = temp[j];
            j++;
        }
        System.out.println("Rotated array  :");
        for(int i =0;i<n;i++)
        {
            System.out.println(""+arr[i]);
        }
    }
}
