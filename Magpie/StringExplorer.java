
/* A program to allow students to try out different 
 * String methods. 
 * @author Laurie White
 * @version April 2012
 */
public class StringExplorer
{
    
    public static void main(String[] args)
    {
        String sample = "The quick brown fox jumped over the lazy dog.";
        
        //  Demonstrate the indexOf method.
        int position = sample.indexOf("quick");
        System.out.println ("sample.indexOf(\"quick\") = " + position);
        
        //  Demonstrate the toLowerCase method.
        String lowerCase = sample.toLowerCase();
        System.out.println ("sample.toLowerCase() = " + lowerCase);
        System.out.println ("After toLowerCase(), sample = " + sample);
        
        //demonstrate the indexOf method
        int notFoundPsn = sample.indexOf("slow");
        System.out.println("sample.indexOf(\"slow\") = " + notFoundPsn);
        
        // Add other methods here
        String comp="Computer Science is the best, the greatest, and the most wonderful subject to study!";
         startPos);
        Int the = comp.toLowerCase().indexOf("the", startPos);
        while(the>=0)
        {String before="";
         String after="";
         
            // Find the string of length 1 before and after
            // the word
            String before = " ", after = " ";
            if ( the > 0)
            {
                before = phrase.substring(psn - 1, psn)
                        .toLowerCase();
            }
            if (the + 3 < comp.length())
            {
                after = phrase.substring(
                        psn + 3,
                        psn + g)
                        .toLowerCase();
            }

            // If before and after aren't letters, we've
            // found the word
            if (((before.compareTo("a") < 0) || (before
                    .compareTo("z") > 0)) // before is not a
                                            // letter
                    && ((after.compareTo("a") < 0) || (after
                            .compareTo("z") > 0)))
            {
                return psn;
            }

            // The last position didn't work, so let's find
            // the next, if there is one.
            psn = phrase.indexOf(goal.toLowerCase(),
                    psn + 1);

        }

        return -1;
    } 
        
       
        
    }
