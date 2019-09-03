/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 *
 * Patrick Ryan and Karam Fasih
 * June 9, 2019
 */
package ca.sheridancollege.project;

import java.util.Comparator;

/**
 * The ordering implied upon the card class through this comparator is as
 * follows: 1-10 < wild < skip < draw two < draw four
 *
 * That is, if a deck is to be arranged according to colours, the red cards will
 * be first, then blue, yellow, and finally wild. 
 * @author Patrick Ryan
 */
public class CardValueComparator implements Comparator<Card> {

    @Override
    public int compare(Card t, Card t1) {
        if (t.getValue().toNum() < t1.getValue().toNum()) {
            return -1;
        } else if (t.getValue().toNum() == t1.getValue().toNum()) {
            return 0;
        } else {
            return 1;
        }
    }
}