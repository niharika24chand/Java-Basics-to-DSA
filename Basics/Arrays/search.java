import java.util.*;
class search
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int i;

        // Input
        for(i=0; i<n; i++)
        {
            System.out.println("Enter an element: ");
            arr[i] = sc.nextInt();
        }

        // search
        System.out.println("Enter an element to be searched: ");
        int x = sc.nextInt();
        for(i=0; i<n; i++)
        {
            if(arr[i] == x)
            {
               System.out.println(x + " found at index: " + i);
            }
        }
    }
}
