import java.util.*;
class SpiralOrder_2D
{
    public static void display(int arr[][], int n, int m)
    {
        int i, j;
        for(i=0; i<n; i++)
        {
            for(j=0; j<m; j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter size of 2D array: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        int i, j;

        for(i=0; i<n; i++)
        {
            for(j=0; j<m; j++)
            {
                System.out.println("Enter an element: ");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Original array: ");
        display(arr, n, m);

        //spiral
        System.out.println("Sprial Order: ");
        int rstart = 0, rend = n-1, cstart=0, cend = m-1;
        while(rstart <= rend && cstart <= cend)
        {
            //column
            for(j=cstart; j<=cend; j++)
            {
                System.out.print(arr[rstart][j]+" ");
            }
            rstart++;

            //row
            for(i=rstart; i<=rend; i++)
            {
                System.out.print(arr[i][cend]+" ");
            }
            cend--;

            //column reverse
            for(j=cend ; j>=cstart; j--)
            {
                System.out.print(arr[rend][j]+" ");
            }
            rend--;

            //row reverse
            for(i=rend; i>=rstart; i--)
            {
                System.out.print(arr[i][cstart]+" ");
            }
            cstart++;

            System.out.println();
        } 

    }
}