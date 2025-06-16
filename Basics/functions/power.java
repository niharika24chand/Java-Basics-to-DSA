import java.util.*;
class power
{
    public static double cal(double x, int n)
    {
        return Math.pow(x,n);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        double x = sc.nextDouble();
        int n = sc.nextInt();
        double result= cal(x,n);
        System.out.println(result);
    }
}