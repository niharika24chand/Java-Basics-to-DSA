// WAP to print table of a number input by the user
import java.util.*;
class table
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int i, cal;
        System.out.println("TABLE OF " + n + ":");
        for(i=1; i<=10; i++)
        {
            cal = n*i;
            System.out.println(n + " * " +  i + " = " +  cal);
        }
    }
}
