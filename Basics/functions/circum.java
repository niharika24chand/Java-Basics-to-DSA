import java.util.*;
class circum
{
    public static void calCircum(double r)
    {
        double c = 2 * Math.PI * r;
        System.out.println("Radius of the circle: "+c);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of a circle: ");
        double rad = sc.nextDouble();
        calCircum(rad);
    }
}
