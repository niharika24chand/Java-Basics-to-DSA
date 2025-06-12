/*
             *
           * * *
         * * * * *
       * * * * * * *
       * * * * * * *
         * * * * *
           * * *
             *
*/

import java.util.*;
class diamond
{
    public static void main(String args[])
    {
        int i, j, n=4;
        //upper half
        for(i=1; i<=n; i++)
        {
            // for spaces
            for(j=1; j<=n-i; j++)
            {
                System.out.print("  ");
            }

            //for stars
            for(j=1; j<=2*i-1; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        //lower half
        for(i=n; i>=1; i--)
        {
            // for spaces
            for(j=1; j<=n-i; j++)
            {
                System.out.print("  ");
            }

            // for stars
            for(j=1; j<=2*i-1; j++)
            {
                System.out.print("* "); 
            }
            System.out.println();
        }
    }
}

