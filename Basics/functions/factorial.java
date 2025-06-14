import java.util.*;
class factorial
{
    public static void fact(int n)
    {
        int i, f=1;
        if(n < 0)
        {
            System.out.println("Invalid number");
            return;
        }
        else if(n == 0 || n == 1)
        {
           System.out.println("Factorial of " + n + " is: 1"); 
        }
        else
        {
            for(i=2; i<=n; i++)
            {
                f = f*i;
            }
            System.out.println("Factorial of " + n + " is: " + f); 
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        fact(num);
    }
}