/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 *          Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{
    /**
     * Get a default greeting   
     * @return a greeting
     */
    public String getGreeting()
    {
        return "Hello, let's talk.";
    }
    
    /**
     * Gives a response to a user statement
     * 
     * @param statement
     *            the user statement
     * @return a response based on the rules given
     */
    public String getResponse(String statement)
    {
        String response = "";
    
        if (statement.indexOf("mother") >= 0
                || statement.indexOf("father") >= 0
                || statement.indexOf("sister") >= 0
                || statement.indexOf("brother") >= 0)
        {
            response = "Tell me more about your family.";
        }
        else if(statement.indexOf("dog") >=0 || statement.indexOf("cat") >=0)
        {
            response = "Tell me more about your pets";
        }
        else if(statement.indexOf("Davis")>=0 || statement.indexOf("Mrs.")>=0 || statement.indexOf("Weisensel")>=0
        || statement.indexOf("Talley")>=0 || statement.indexOf("Dinkelman")>=0 || statement.indexOf("Wilmot")>=0)
        {
            response= "She sounds like a good teacher";

        }
        else if(statement.indexOf("Mr.")>=0 || statement.indexOf("Ulrickson")>=0 || statement.indexOf("Reader")>=0)
        {
            response= "He sounds like a good teacher";
       
        }
        else if(statement.trim().length()>=0)
        {
            response = "Say something please.";
        }
        else if(statement.indexOf("no") >= 0)
        {
            response = "Why so negative?";
        }
        else if(statement.indexOf("yes") >= 0)
        {
            response = "You agree with me?";
        }
        else if(statement.indexOf("What") >= 0)
        {
            response = "I don't know what I'm saying.";
        }
        else if(statement.indexOf("sun") >=0 || statement.indexOf("rain")>=0 || statement.indexOf("temperature")>=0)
        {
            response = "The weather is quite peculiar";
        }
        else
        {
            response = getRandomResponse();
        }
        
        return response;
    }

    /**
     * Pick a default response to use if nothing else fits.
     * @return a non-committal string
     */
    private String getRandomResponse()
    {
        final int NUMBER_OF_RESPONSES = 6;
        double r = Math.random();
        int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
        String response = "";
        
        if (whichResponse == 0)
        {
            response = "Interesting, tell me more.";
        }
        else if (whichResponse == 1)
        {
            response = "Hmmm.";
        }
        else if (whichResponse == 2)
        {
            response = "Do you really think so?";
        }
        else if (whichResponse == 3)
        {
            response = "You don't say.";
        }
        else if (whichResponse == 4)
        {
            response = "That's cool!";
        }
        else if (whichResponse == 5)
        {
            response = "Wow.";
        }
        return response;
    }
}