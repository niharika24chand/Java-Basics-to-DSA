// to calculate the cumulative length of an array of strings
import java.util.*;
class arrayString
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();
        String arr[] = new String[n];
        int i, totalLen=0;
        System.out.println("Enter the content: ");
        for(i=0; i<n; i++)
        {
            arr[i] = sc.next();
            totalLen += arr[i].length();
        }
        System.out.println("Total length of string: " + totalLen);
    }
}