/*
         * * * * *
        *       *
       *       * 
      *       *
     * * * * *
 */

 import java.util.*;
 class hollow_rhombus
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

            // for stars
            for(j=1; j<=n; j++)
            {
                if(i==1 || i==n || j==1 || j==n)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
 }
