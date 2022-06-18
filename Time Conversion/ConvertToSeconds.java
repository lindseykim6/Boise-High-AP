/**
* TODO:  This code will convert hours, minutes, and seconds into the time in
* in seconds.
* @author Colin Poly, Lindsey Kim, and Nicholas Richter
* @ 9 / 10 / 2018
*/
public class ConvertToSeconds
{
    public static void main(String[] args)
    {
        int sec = 42;
        int min = 28;
        int hrs = 1;
        System.out.print("Hours : ");
        System.out.println(hrs);
        System.out.print("Minutes : ");
        System.out.println(min);
        System.out.print("Seconds : ");
        System.out.println(sec);
        System.out.print("Total Seconds : ");
        System.out.println(sec + (min * 60) + (hrs * 3600));
    }
}
