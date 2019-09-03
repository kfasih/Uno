
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 *
 * @author Patrick Ryan
 */
public class PlayedCardPile extends GroupOfCards {
    
    public PlayedCardPile(ArrayList<Card> cards) {
        super(cards);
    }
    
    /**
     * 
     * @return The top of the discard pile
     * @throws IllegalStateException if the pile is empty
     */
    public Card getTop() throws IllegalStateException {
        
        if (isEmpty()) {
            throw new IllegalStateException("Played Card pile is empty");
        }
        
        return get(getSize() - 1);
    }
    
    /**
     * 
     * @param card card to be placed on the top of the pile
     */
    public void put(Card card) {
        add(card);
    }
}
