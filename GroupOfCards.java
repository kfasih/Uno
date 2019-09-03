/**
 * SYST 17796 Project Winter 2019
 *
 * Patrick Ryan and Karam Fasih
 * June 9, 2019
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * A concrete class that represents any grouping of cards for a Game. HINT, you
 * might want to subclass this more than once. The group of cards has a maximum
 * size attribute which is flexible for reuse.
 *
 * @author dancye
 * @modified Patrick Ryan
 */
public abstract class GroupOfCards implements Iterable<Card> {

    private ArrayList<Card> cards;

    public GroupOfCards() {
    }

    public GroupOfCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    /**
     * A method that will get the group of cards as an ArrayList
     *
     * @return the group of cards.
     */
    public final ArrayList<Card> getCards() {
        return cards;
    }

    /**
     * Shuffle the cards within the group into a random order.
     */
    public void shuffle() {
        Collections.shuffle(cards);
    }

    /**
     * @return the size of the group of cards
     */
    public final int getSize() {
        return cards.size();
    }

    public final void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    /**
     *
     * @param index
     * @return desired card
     * @throws IllegalArgumentException if index is out of bounds
     */
    public Card get(int index) throws IllegalArgumentException {

        if (index >= getSize()) {
            throw new IllegalArgumentException("Invalid card index");
        }

        return cards.get(index);
    }

    public void add(Card card) {
        cards.add(card);
    }

    public boolean isEmpty() {
        return cards.isEmpty();
    }
    
    /**
     * 
     * @param index of card to be removed and returned
     * @return selected card
     * @throws IllegalArgumentException if the index is out of bounds.
     */
    public Card remove(int index) throws IllegalArgumentException {
        
        if (index >= getSize()) {
            throw new IllegalArgumentException("Invalid card index");
        }
        
        return cards.remove(index);
    }
    
    /**
     * Empty the GroupOfCards
     */
    public void clear() {
        cards.clear();
    }
    
    /**
     * Get the array index of card c
     * @param c card to get index of
     * @return index of card
     */
    public int indexOf(Card c) {
        return cards.indexOf(c);
    }
    
    /**
     * Implement enhanced for loop operations on GroupOfCards
     * 
     * @return iterator of the underlying container.
     */
    @Override
    public Iterator<Card> iterator() {
        return cards.iterator();
    }
    
    /**
     * Override of equals method
     * 
     * @param other other group of cards
     * @return true if two groups are equal, false otherwise.
     */
    @Override
    public boolean equals(Object other) {
        return cards.equals(((GroupOfCards)other).cards);
    }

}//end class
