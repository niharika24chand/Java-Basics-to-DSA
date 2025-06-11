//WAP to take 2 inputs from the user and check whether they are equal, greater or lesser
       
import java.util.*;
class check
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        System.out.println("Enter the second number:");
        int b = sc.nextInt();
        if(a == b)
        {
            System.out.println("Equal");
        }
        else if(a > b)
        {
            System.out.println(a + " is greater than " + b);
        }
        else
        {
            System.out.println(a + " is smaller than " + b);
        }
    }   
}
