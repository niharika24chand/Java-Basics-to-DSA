import java.util.*;
class print_info
{

    public static void print(String n, int a, String c, int id)
    {
        System.out.println(n + " is " + a + " years old. " + "She studies in " + c + " and her SAP ID is " + id);
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String s = sc.nextLine();
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your college name: ");
        String cname = sc.nextLine();
        System.out.println("Enter your SAP ID: ");
        int sap = sc.nextInt();
        print(s, age, cname, sap);
    }
}