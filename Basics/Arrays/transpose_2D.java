import java.util.*;
class transpose_2D
{
    public static void display(int arr[][], int row, int col)
    {
        int i, j;
        for(i=0; i<row; i++)
        {
            for(j=0; j<col; j++)
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

        // transpose
        int narr[][] = new int[m][n];
        for(i=0; i<m; i++)
        {
            for(j=0; j<n; j++)
            {
                if(i==j)
                narr[i][j]=arr[i][j];
                else
                narr[i][j]=arr[j][i];
            }
        }
        System.out.println("Array after transpose: ");
        display(narr,m,n);
    }
}
