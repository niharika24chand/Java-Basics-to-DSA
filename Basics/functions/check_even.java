import java.util.*;
class check_even
{
    public static void check(int n)
    {
      if(n%2 == 0)
      System.out.println(n+ " is an even number");
      else
      System.out.println(n+" is an odd number");  
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        check(num);
    }
}
