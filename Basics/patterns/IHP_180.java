/*
          *
        * *
      * * *
    * * * *   
 */

import java.util.*;
class IHP_180 //Inverted half pyramid (Rotated 180 deg)
{
    public static void main(String args[])
    {
        int i, j ,n=4;
        for(i=1; i<=n; i++)
        {
            for(j=1; j<=n-i; j++)  //inner loop for spaces
            {
                System.out.print("  ");
            }
            for(j=1; j<=i; j++) // inner loop for stars
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}