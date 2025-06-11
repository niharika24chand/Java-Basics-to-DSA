/*
Make a menu-driven program where the user can enter either 1 or 0. 
If the user enters 1, continue taking input for a student's marks (out of 100). 
If they enter 0, stop the program.

Conditions:
- Marks >= 90 -> print "Excellent"
- 60 <= Marks <= 89 -> print "Good"
- 0 <= Marks <= 59 -> print "You can do better"
*/


import java.util.*;
class marks_menu
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int ch;
        do
        {
            System.out.println("Enter marks of a student: ");
            int m = sc.nextInt();
            if(m<0 || m>100)
            {
                System.out.println("Invalid marks");
            }
            else if(m >= 90)
            {
                System.out.println("Excellent");
            }
            else if(m >= 60)
            {
                System.out.println("Good");
            }
            else
            {
                System.out.println("You can do better");
            }
            System.out.println("Do you want to continue? Enter 1 for yes and 0 to exit: ");
            ch = sc.nextInt();
        } while(ch == 1);
    }
}





