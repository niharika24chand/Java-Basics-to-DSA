/* Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows : 
1 : + (Addition) a + b
2 : - (Subtraction) a - b
3 : * (Multiplication) a * b
4 : / (Division) a / b
5 : % (Modulo or remainder) a % b
Calculate the result according to the operation given and display it to the user.
*/

import java.util.*;
class calculator
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("_______CALCULATOR_______");
        System.out.println("Enter two numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("Enter your choice: ");
        int ch = sc.nextInt();
        switch(ch)
        {
            case 1 : System.out.println(x + y);
                     break;
            case 2 : System.out.println(x - y);
                     break;
            case 3 : System.out.println(x * y);
                     break;
            case 4 : if (y == 0)
                     {
                        System.out.println("INVALID DIVISION");
                     }
                     System.out.println(x / y);
                     break;
            case 5 : if (y == 0)
                     {
                        System.out.println("INVALID DIVISION");
                     }
                     System.out.println(x % y);
                     break;
            default : System.out.println("INVALID CHOICE");
        }
    }
}
