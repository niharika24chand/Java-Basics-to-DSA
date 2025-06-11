import java.util.Scanner;

class arithOp  //arithOp = Arithmetic Operations 
{
   public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num1 = 0, num2 = 0, sum = 0;
        System.out.println("Enter two numbers: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        System.out.println("Sum = " + (num1+num2)); 
        System.out.println("Subtraction = " + (num1-num2)); 
        System.out.println("Product = " + (num1*num2)); 
        System.out.println("Division = " + (num1/num2)); 
        System.out.println("Remainder = " + (num1%num2)); 
    }
}
