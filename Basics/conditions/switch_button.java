//enter 1 for Hello , 2 for Namaste and 3 for Bonjour

import java.util.*;
class switch_button
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice: ");
        int choice = sc.nextInt();
        switch(choice)
        {
            case 1 : System.out.println("HELLO");
                     break;
            case 2 : System.out.println("NAMASTE");
                     break;
            case 3 : System.out.println("BONJOUR");
                     break;
            default : System.out.println("INVALID CHOICE");
        }
    }
}