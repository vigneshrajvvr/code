//array rotation one by one
//Time complexity : O(n * d)
//Auxiliary Space : O(1)
import java.util.Scanner;
class arrayrotation
{
    int temp;
    public int[] array(int arr[],int d,int n)
    {
        for(int i=0;i<d;i++)
        {
            temp = arr[0];
            for(int j =0;j<n-1;j++)
            {
                arr[j] = arr[j+1];
            }
            arr[n-1] = temp;
        }
        return arr;
    }
}
class Main
{
    public static void main(String args[])
    {
        int n,d;
        Scanner in = new Scanner(System.in);
        System.out.println("Length of the array :");
        n = in.nextInt();
        int arr[] = new int[n];
        System.out.println("Array elements :");
        for(int i=0;i<n;i++)
        {
            arr[i] = in.nextInt();
        }
        arrayrotation a = new arrayrotation();
        System.out.println("Number of rotations :");
        d =in.nextInt();
        arr = a.array(arr,d,arr.length);
        for(int i=0;i<n;i++)
        {
            System.out.println(""+arr[i]);
        }
    }
}
