/*
    * * * *
    * * *
    * *
    *
 */

import java.util.*;
class IHP //Inverted half pyramid
{
    public static void main(String args[])
    {
        int i, j, n=4;
        for(i=1; i<=n; i++)  
        {
            for(j=n; j>=i; j--) // or for(j=1; j<=n-(i-1); j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}