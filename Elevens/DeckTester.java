
/**
 * Write a description of class DeckTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class DeckTester {

    /**
     * The main method in this class checks the Deck operations for consistency.
     *  @param args is not used.
     */
    public static void main(String[] args) {
        String[] ranks={"jack","queen", "king"};
        String[] suits = {"clover", "spades"};
        int[] pointValues={11,12,13};
        Deck a= new Deck(ranks, suits, pointValues);
        
        String[] rank={"3", "5", "J"};
        String[] suit={"clover", "spades"};
        int[] pointValue={3,5,11};
        Deck b=new Deck(rank, suit, pointValue);
        
        String[] r={"6", "7", "8"};
        String[] s={"hearts", "diamonds"};
        int[] pv={6,7,8};
        Deck c=new Deck(r,s,pv);
        
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());
        System.out.println(a.deal());
        System.out.println(a.deal());
        System.out.println(a.deal());
        System.out.println(a.isEmpty());
        System.out.println(a.toString());
        System.out.println(b.size());
    }
}


