/*
     *                    *
     *  *              *  *
     *  *  *        *  *  *
     *  *  *  *  *  *  *  *
     *  *  *  *  *  *  *  *
     *  *  *        *  *  *
     *  *              *  *
     *                    *
 */

import java.util.*;
class butterfly
{
    public static void main(String args[])
    {
        int i, j, n=4;
        //first half
        for(i=1; i<=n; i++)
        {
            //first part stars
            for(j=1; j<=i; j++)
            {
                System.out.print("* ");
            }

            // spaces
            for(j=1; j<=2*(n-i); j++)
            {
                System.out.print("  ");
            }

            //second part stars
            for(j=1; j<=i; j++)
            {
               System.out.print("* "); 
            }
            System.out.println();
        }

        //second half
        for(i=n; i>=1; i--)
        {
           //first part stars
            for(j=1; j<=i; j++)
            {
                System.out.print("* ");
            }

            // spaces
            for(j=1; j<=2*(n-i); j++)
            {
                System.out.print("  ");
            }

            //second part stars
            for(j=1; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println(); 
        }
    }
}