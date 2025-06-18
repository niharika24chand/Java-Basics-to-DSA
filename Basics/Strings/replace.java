//replace e in orginal string with i in the new string
import java.util.*;
class replace
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        String result = ""; int i;
        for(i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch == 'e')
            result += 'i';
            else
            result += ch;
        }
        System.out.println("New string: " + result);
    }
}