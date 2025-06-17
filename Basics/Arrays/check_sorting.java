import java.util.*;
class check_sorting
{
    public static void display(int arr[], int n)
    {
        int i;
        for(i=0; i<n-1; i++)
        {
            System.out.print(arr[i]+", ");
        }
        System.out.println(arr[n-1]);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int i;

        for(i=0; i<n; i++)
        {
            System.out.println("Enter an element: ");
            arr[i] = sc.nextInt();
        }
        display(arr, n);

        // check sorted in ascending order or not
        boolean result = false;
        for(i=0; i<n-1; i++)
        {
            if(arr[i] < arr[i+1])
            {
                result = true;
            }
            else
            {
                result = false;
                break;
            }
        }
        if(result == true)
        System.out.println("The array is sorted in ascending order");
        else
        System.out.println("The array is not sorted in ascending order");
    }
}
