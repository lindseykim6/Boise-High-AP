/**
* TODO:  This program will tell us the radius of a circle when the area is inputed
* @author Colin Poly, Lindsey Kim, and Nicholas Richter
* @version 9-11-2018
*/
import java.io.*; //see “Imports necessary” on next page
import java.util.*;
public class GoingInCircles
{
    public static void main( String args[] )
    {
        Scanner R2R5Reader = new Scanner(System.in);
        System.out.println("Enter Cricle Area Here:");
        int area = R2R5Reader.nextInt();
        double h = area / Math.PI;
        double radius = Math.sqrt(h);
        System.out.println(radius);
    }
}
