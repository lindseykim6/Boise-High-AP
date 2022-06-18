/**
* TODO:  This program will make your full name when you give it your first name,
* and then your last name.
* @author Colin Poly, Lindsey Kim, and Nicholas Richter
* @version 9-13-2018
*/
import java.io.*;
import java.util.*;
public class WhatsMyName
{
    public static void main( String args[] )
    {
        System.out.print("What is your first name?: ");
        Scanner blingReader = new Scanner(System.in);
        String FirstName = blingReader.nextLine();
        System.out.print("What is your last name?: ");
        Scanner bingReader = new Scanner(System.in);
        String LastName = bingReader.nextLine();
        String FullName = FirstName + " " + LastName;
        System.out.print("Your full name is ");
        System.out.println(FullName);
    }
}