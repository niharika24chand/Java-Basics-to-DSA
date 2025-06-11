import java.util.*;
class sum
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        int i, sum = 0;
        for(i=1; i<=n; i++)
        {
            sum = sum + i;
        }
        System.out.println("Sum of " + n + "natural number's = " + sum);
    }
}
