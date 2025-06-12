/*
    1 2 3 4 5
    1 2 3 4
    1 2 3
    1 2
    1
 */

 import java.util.*;
 class IHP_num //Inverted half pyramid
 {
    public static void main(String args[])
    {
        int i, j, n=5;
        for(i=1; i<=n; i++)
        {
            for(j=1; j<= n-(i-1); j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
 }
