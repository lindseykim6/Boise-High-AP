/**
* TODO:  This takes the total amount of seconds and converts it into the exact
* Hours, minutes, and seconds.
* @author Colin Poly, Lindsey Kim, and Nicholas Richter
* @version 9 / 11 / 2018
*/
public class ConvertToHours
{
    public static void main(String[] args)
    {
        int a = 5322;
        System.out.println("Total Seconds: " + a);
        int Hours = a / 3600;
        System.out.println("Hours: " + Hours);
        int Minutes = (a % 3600) / 60;
        System.out.println("Minutes: " + Minutes);
        int Seconds = ((a % 3600) % 60);
        System.out.println("Seconds: " + Seconds);
    }
}
