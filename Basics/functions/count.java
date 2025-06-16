// program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 
import java.util.*;
class count
{
    public static int getNum()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        return num;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num, z=0, p=0, n=0;
        char ch;
        do
        {
            num = getNum();
            if(num == 0)
            z++;
            else if(num > 0)
            p++;
            else
            n++;
            System.out.println("Do you want to contine?\n Press Y for yes and N for no: ");
            ch = sc.next().charAt(0);
        }while(ch == 'Y' || ch == 'y');
        System.out.println("Total zeroes: "+z);
        System.out.println("Total positive numbers: "+p);
        System.out.println("Total negative numbers: "+n);
    }
}

