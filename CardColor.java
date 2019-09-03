/**
 * SYST 17796 Project Winter 2019.
 *
 * Patrick Ryan and Karam Fasih
 * July 23, 2019
 *
 */
package ca.sheridancollege.project;

/**
 * This enumeration holds the possible types of card colours for the Uno card game.
 * Each card must have a colour.
 * @author Patrick Ryan
 */
public enum CardColor {
    GREEN, RED, BLUE, YELLOW, WILD;
    
    public int toNum() {
        switch (this) {
            case RED:
                return 0;
            case BLUE:
                return 1;
            case GREEN:
                return 2;
            case YELLOW:
                return 3;
            case WILD:
                return 4;
        }
        throw new IllegalArgumentException("Unknown Card color encountered");
    }
    
    @Override
    public String toString() {
        String string = "";
        switch (this) {
            case RED:
                string = "Red";
                break;
            case BLUE:
                string = "Blue";
                break;
            case GREEN:
                string = "Green";
                break;
            case YELLOW:
                string = "Yellow";
                break;
            case WILD:
                string = "Wild";
                break;
        }
        return string;
    }
}
