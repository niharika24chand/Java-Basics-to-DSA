/*
      *                 *
      * *             * *
      *   *         *   *
      *     *     *     *
      *       * *       *
      *       * *       *
      *     *     *     *
      *   *         *   *
      * *             * *
      *                 *
 
*/

import java.util.*;
class hollow_butterfly
{
    public static void main(String args[])
    {
        int i, j, n=5, m=10;
        //first half
        for(i=1; i<=n; i++)
        {
            for(j=1; j<=m; j++)
            {
                if(j==1 || j==m || i+j==11 || i==j)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        // second half
        for(i=n; i>=1; i--)
        {
            for(j=1; j<=m; j++)
            {
                if(j==1 || j==m || i+j==11 || i==j)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
