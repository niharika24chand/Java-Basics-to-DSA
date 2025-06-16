// calculate the sum of odd numbers from 1 to n

import java.util.*;
class sumOdd
{
    public static void calSum(int n)
    {
        int i, s=0;
        for(i=1; i<=n; i++)
        {
            if(i%2 != 0)
            s = s+i;
        }
        System.out.println("Sum of odd numbers from 1 to "+ n + " is: " + s);
        return;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number till which you want to calculate the sum of odd numbers: ");
        int n = sc.nextInt();
        calSum(n);
    }
}