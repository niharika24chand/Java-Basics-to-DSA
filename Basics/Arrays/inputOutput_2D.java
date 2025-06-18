import java.util.*;
class inputOutput_2D
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter size of 2D array: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int arr[][] = new int[rows][cols];
        int i, j;

        for(i=0; i<rows; i++)
        {
            for(j=0; j<cols; j++)
            {
                System.out.println("Enter an element: ");
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("2D ARRAY: ");
        for(i=0; i<rows; i++)
        {
            for(j=0; j<cols; j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
