/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 *
 * Patrick Ryan and Karam Fasih
 * June 9, 2019
 */
package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general
 * enough to be instantiated for any Card game. Students wishing to add to the
 * code should remember to add themselves as a modifier.
 *
 * @author dancye, 2018
 * @modified Patrick Ryan
 */
public final class Card {
   
    // We make the class immutable to simplify design and reduce the surface area
    // for bugs.
    private final CardColor color;
    private final CardValue value;

    /**
     * 
     * @param color colour of the card
     * @param value value of the card. 
     * 
     * Note: Only wild and draw four may have colour wild. Furthermore, this is 
     * the only colour they may have.
     */
    public Card(CardColor color, CardValue value) {
        
        if (color == CardColor.WILD) { // only wild and draw four can have this type.
            if ((value != CardValue.WILD) && (value != CardValue.DRAW_FOUR)) {
                throw new IllegalArgumentException("Invalid card constructed");
            }
        } else { // wild and draw four can ONLY be wild colour
            if ((value == CardValue.WILD) || (value == CardValue.DRAW_FOUR)) {
                throw new IllegalArgumentException("Invalid card constructed");
            }
        }
        
        // We have a valid card, so create it.
        this.color = color;
        this.value = value;
    }
    
    /**
     * @return A string representation of the card instance.
     */
    @Override
    public String toString() {
        return getColor() + " " + getValue();
    }
    
    public CardColor getColor() {
        return color;
    }
    
    public CardValue getValue() {
        return value;
    }
    
    /**
     * 
     * Test equality between instance and another object.
     * 
     * @param other card instance
     * @return true if other is equal to this instance
     */
    @Override
    public boolean equals(Object other) {
        
        if (other == null) {
            return false;
        }
        
        if (other.getClass() != this.getClass()) {
            return false;
        }
        
        Card otherCard = (Card)other;
        return color == otherCard.color && value == otherCard.value;
    }   
}
