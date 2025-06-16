import java.util.*;
class average
{
    public static void calAvg(float x, float y, float z)
    {
        float avg = (x+y+z)/3;
        System.out.println("Average = " + avg);
        return;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        calAvg(a, b, c);
    }
}