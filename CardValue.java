/**
 * SYST 17796 Project Winter 2019.
 *
 * Patrick Ryan and Karam Fasih
 * July 23, 2019
 *
 */
package ca.sheridancollege.project;

/**
 * This enumeration holds the possible types of card types for the Uno card game.
 * Each card must have a type.
 * @author Patrick Ryan
 */
public enum CardValue {
    ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, WILD, SKIP, 
    DRAW_TWO, DRAW_FOUR;
    
    @Override
    public String toString() {
        String string  = "";
        
        switch (this) {
            case ONE:
                string = "1";
                break;
            case TWO:
                string = "2";
                break;
            case THREE:
                string = "3";
                break;
            case FOUR:
                string = "4";
                break;
            case FIVE:
                string = "5";
                break;
            case SIX:
                string = "6";
                break;
            case SEVEN:
                string = "7";
                break;
            case EIGHT:
                string = "8";
                break;
            case NINE:
                string = "9";
                break;
            case TEN:
                string = "10";
                break;
            case WILD:
                string = "Wild";
                break;
            case SKIP:
                string = "Skip";
                break;
            case DRAW_TWO:
                string = "Draw Two";
                break;
            case DRAW_FOUR:
                string = "Draw Four";
                break;
        }
        return string;
    }
    
    public int toNum() {
           int num = 0;
        
        switch (this) {
            case ONE:
                num = 1;
                break;
            case TWO:
                num = 2;
                break;
            case THREE:
                num = 3;
                break;
            case FOUR:
                num = 4;
                break;
            case FIVE:
                num = 5;
                break;
            case SIX:
                num = 6;
                break;
            case SEVEN:
                num = 7;
                break;
            case EIGHT:
                num = 8;
                break;
            case NINE:
                num = 9;
                break;
            case TEN:
                num = 10;
                break;
            case WILD:
                num = 11;
                break;
            case SKIP:
                num = 12;
                break;
            case DRAW_TWO:
                num = 13;
                break;
            case DRAW_FOUR:
                num = 14;
                break;
        }
        return num;
    }
}
