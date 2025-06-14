import java.util.*;
class calulate
{
    public static int calSum(int a, int b)
    {
        int s = a+b;
        return s;
    }

    public static int calProduct(int a, int b)
    {
        int p = a*b;
        return p;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result1 = calSum(a, b);
        System.out.println("Sum = " + result1);
        int result2 = calProduct(a, b);
        System.out.println("Product = " + result2);
    }
}