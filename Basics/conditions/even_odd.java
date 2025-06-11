// WAP to take input from the user and check whether that number is even or odd

import java.util.*;
class even_odd
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        if(num % 2 == 0)
        {
            System.out.println(num + " is an even number");
        }
        else
        {
            System.out.println(num + " is an odd number");
        }
    }
}