import java.util.*;
class basic_func
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name: ");
        String fName = sc.next();
        System.out.println("Enter last name: ");
        String lName = sc.next();

        //concatenation
        String fullName = fName + " " + lName;
        System.out.println("Full name : " + fullName);

        // length func
        int l = fullName.length();
        System.out.println("Length: " + l);
        
        //charAt
        int i;
        for(i=0; i<l; i++)
        {
            System.out.println(fullName.charAt(i));
        }

        //compareTo func
        System.out.println("Enter a string: ");
        String name1 = sc.next();
        System.out.println("Enter a string: ");
        String name2 = sc.next();
        if(name1.compareTo(name2) == 0)
        System.out.println("Strings are equal");
        else if(name1.compareTo(name2) > 0)
        System.out.println( name1 + " is greater than " + name2);
        else
        System.out.println(name2 + " is greater than " + name1);

        //substring
        System.out.println(fullName.substring(0,9));
    }
}
