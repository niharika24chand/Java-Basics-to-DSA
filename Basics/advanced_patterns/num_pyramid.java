/* 
             1
            2 2
           3 3 3
          4 4 4 4
         5 5 5 5 5
 */

import java.util.*;
class num_pyramid
{
    public static void main(String args[])
    {
        int i, j, n=5;
        for(i=1; i<=n; i++)
        {
            // for spaces
            for(j=1; j<=n-i; j++)
            {
                System.out.print(" ");
            }

            // for numbers
            for(j=1; j<=i; j++)
            {

                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}