import java.util.*;
class fibonacci
{
    public static void series(int n)
    {
        int x = 0;
        int y = 1;
        System.out.print(x+" ");
        System.out.print(y+" ");
        int i = 2, sum=0;
        while(i != n)
        {
            sum = x + y;
            System.out.print(sum+" ");
            x = y;
            y = sum;
            i++;
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n = sc.nextInt();
        series(n);
    }
}
