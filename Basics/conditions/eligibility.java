// WAP to check whether the user is eligible for voting or not

import java.util.*;
class eligibility
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int age = 0;
        System.out.println("Enter your age: ");
        age = sc.nextInt();
        if(age >= 18)
        {
            System.out.println("Congrats you are eligible for voting ");
        }
        else
        {
            System.out.println("You are not eligilbe for voting");
        }
    }
}
