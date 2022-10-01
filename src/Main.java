import java.sql.SQLOutput;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String trash = "";
        int meters = 0;
        double inches = 0;
        double feet = 0;
        double miles = 0;

        System.out.print("Enter the length in meters: ");
        if (in.hasNextInt())
        {
            meters = in.nextInt();
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println(trash + " is not a number!"); }
        {
            inches = meters * 39.3700787;
            feet = meters * 3.2808399;
            miles = meters * 0.00062137;
            {
                System.out.println("Meters to Inches: " + inches + "   Meters to Feet: " + feet + "   Miles to Feet: " + miles);
            }
        }
    }
}