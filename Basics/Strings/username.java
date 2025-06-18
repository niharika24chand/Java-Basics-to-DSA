//to create a username from the email by deleting the part that comes after ‘@’
import java.util.*;
class username
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your email: ");
        String email = sc.nextLine(); 
        int i; String uName ="";
        for(i=0; i<email.length(); i++)
        {
            char ch = email.charAt(i);
            if(ch == '@')
            {
                uName = email.substring(0,i);
                break;
            }
        }
        System.out.println("Your username is : " + uName);
    }
}
