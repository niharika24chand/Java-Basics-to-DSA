import java.util.*;
class max_min
{
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

        // find max min
        int max = Integer.MIN_VALUE , min = Integer.MAX_VALUE;
        for(i=0; i<n; i++)
        {
            if(arr[i] > max)
            max = arr[i];
            if(arr[i] < min)
            min = arr[i];
        }
        System.out.println("Maximum number in array = " + max +"\nMinimum number in array = " + min);
    }
}
