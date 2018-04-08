//Given an array of integers, return indices of the two numbers such that they add up to a specific target.
import java.io.*;
import java.util.Scanner;
class task1
{
    public static void main(String args[])
    {
        int i, j, N, target;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements :");
        N = in.nextInt();
        System.out.println("Enter the target value :");
        target = in.nextInt();
        int a[] = new int[100];
        System.out.println("Enter the array elements :");
        for(i=0;i<N;i++)
        {
            a[i] = in.nextInt();
        }
        System.out.println("Output is :");
        for(i=0;i<N;i++)
        {
            for(j=i+1;j<N;j++)
            {
              if((a[i]+a[j])==target)
              {
               System.out.println(i+" "+j);
              }
            }
        }
    }
}
