/*
             1
           2 1 2
         3 2 1 2 3
       4 3 2 1 2 3 4
     5 4 3 2 1 2 3 4 5
 */

import java.util.*;
class palindromic
{
    public static void main(String args[])
    {
        int i, j, n=5;
        for(i=1; i<=n; i++)
        {
            // for spaces
            for(j=1; j<=n-i; j++)
            {
                System.out.print("  ");
            }

            // for first half of numbers
            for(j=i; j>=1; j--)
            {
                System.out.print(j+" ");
            }

            //for second half of numbers
            for(j=2; j<=i; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
