//To find out string is a rotation of string 2
import java.util.Scanner;
class Main
{
    static boolean compare(String s1, String s2)
    {
        return (s1.length() == s2.length()) &&((s1+s2).contains(s2));
    }
    public static void main(String args[])
    {
        String s1, s2;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string 1 :");
        s1 = in.nextLine();
        System.out.println("Enter the string 2 :");
        s2 = in.nextLine();
        System.out.println("Is string2 is rotation of string 1 :"+compare(s1,s2));
    }
}
