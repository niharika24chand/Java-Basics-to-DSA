import java.util.*;
 class pascals_triangle
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
            int k=1;
            for(j=1; j<=i; j++)
            {
                System.out.print(k + " ");
                k = k * (i - j) / j;
            }
            System.out.println();
        }
    }
 }
