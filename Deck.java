package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 *
 * This class models the Uno game's deck.
 *
 * @author Patrick Ryan
 */
public class Deck extends GroupOfCards {

    public Deck(ArrayList<Card> cards) {
        super(cards);
    }

    /**
     * Remove and return the top card of the deck. If the deck is empty, an
     * IllegalStateException is thrown
     *
     * @return the card at the top of the deck
     * @throws IllegalStateException if the deck is empty
     */
    public Card draw() throws IllegalStateException {

        if (isEmpty()) {
            throw new IllegalStateException("Deck is empty");
        }

        return remove(getSize() - 1);
    }

    public static Deck standardDeckFactory() {
        Deck d = new Deck(new ArrayList<>());

        // Add two of each standard number cards, skip, and draw two for colours
        d.add(new Card(CardColor.BLUE, CardValue.ONE));
        d.add(new Card(CardColor.BLUE, CardValue.TWO));
        d.add(new Card(CardColor.BLUE, CardValue.THREE));
        d.add(new Card(CardColor.BLUE, CardValue.FOUR));
        d.add(new Card(CardColor.BLUE, CardValue.FIVE));
        d.add(new Card(CardColor.BLUE, CardValue.SIX));
        d.add(new Card(CardColor.BLUE, CardValue.SEVEN));
        d.add(new Card(CardColor.BLUE, CardValue.EIGHT));
        d.add(new Card(CardColor.BLUE, CardValue.NINE));
        d.add(new Card(CardColor.BLUE, CardValue.SKIP));
        d.add(new Card(CardColor.BLUE, CardValue.DRAW_TWO));
        d.add(new Card(CardColor.GREEN, CardValue.ONE));
        d.add(new Card(CardColor.GREEN, CardValue.TWO));
        d.add(new Card(CardColor.GREEN, CardValue.THREE));
        d.add(new Card(CardColor.GREEN, CardValue.FOUR));
        d.add(new Card(CardColor.GREEN, CardValue.FIVE));
        d.add(new Card(CardColor.GREEN, CardValue.SIX));
        d.add(new Card(CardColor.GREEN, CardValue.SEVEN));
        d.add(new Card(CardColor.GREEN, CardValue.EIGHT));
        d.add(new Card(CardColor.GREEN, CardValue.NINE));
        d.add(new Card(CardColor.GREEN, CardValue.SKIP));
        d.add(new Card(CardColor.GREEN, CardValue.DRAW_TWO));
        d.add(new Card(CardColor.RED, CardValue.ONE));
        d.add(new Card(CardColor.RED, CardValue.TWO));
        d.add(new Card(CardColor.RED, CardValue.THREE));
        d.add(new Card(CardColor.RED, CardValue.FOUR));
        d.add(new Card(CardColor.RED, CardValue.FIVE));
        d.add(new Card(CardColor.RED, CardValue.SIX));
        d.add(new Card(CardColor.RED, CardValue.SEVEN));
        d.add(new Card(CardColor.RED, CardValue.EIGHT));
        d.add(new Card(CardColor.RED, CardValue.NINE));
        d.add(new Card(CardColor.RED, CardValue.SKIP));
        d.add(new Card(CardColor.RED, CardValue.DRAW_TWO));
        d.add(new Card(CardColor.YELLOW, CardValue.ONE));
        d.add(new Card(CardColor.YELLOW, CardValue.TWO));
        d.add(new Card(CardColor.YELLOW, CardValue.THREE));
        d.add(new Card(CardColor.YELLOW, CardValue.FOUR));
        d.add(new Card(CardColor.YELLOW, CardValue.FIVE));
        d.add(new Card(CardColor.YELLOW, CardValue.SIX));
        d.add(new Card(CardColor.YELLOW, CardValue.SEVEN));
        d.add(new Card(CardColor.YELLOW, CardValue.EIGHT));
        d.add(new Card(CardColor.YELLOW, CardValue.NINE));
        d.add(new Card(CardColor.YELLOW, CardValue.SKIP));
        d.add(new Card(CardColor.YELLOW, CardValue.DRAW_TWO));
        d.add(new Card(CardColor.BLUE, CardValue.ONE));
        d.add(new Card(CardColor.BLUE, CardValue.TWO));
        d.add(new Card(CardColor.BLUE, CardValue.THREE));
        d.add(new Card(CardColor.BLUE, CardValue.FOUR));
        d.add(new Card(CardColor.BLUE, CardValue.FIVE));
        d.add(new Card(CardColor.BLUE, CardValue.SIX));
        d.add(new Card(CardColor.BLUE, CardValue.SEVEN));
        d.add(new Card(CardColor.BLUE, CardValue.EIGHT));
        d.add(new Card(CardColor.BLUE, CardValue.NINE));
        d.add(new Card(CardColor.BLUE, CardValue.SKIP));
        d.add(new Card(CardColor.BLUE, CardValue.DRAW_TWO));
        d.add(new Card(CardColor.GREEN, CardValue.ONE));
        d.add(new Card(CardColor.GREEN, CardValue.TWO));
        d.add(new Card(CardColor.GREEN, CardValue.THREE));
        d.add(new Card(CardColor.GREEN, CardValue.FOUR));
        d.add(new Card(CardColor.GREEN, CardValue.FIVE));
        d.add(new Card(CardColor.GREEN, CardValue.SIX));
        d.add(new Card(CardColor.GREEN, CardValue.SEVEN));
        d.add(new Card(CardColor.GREEN, CardValue.EIGHT));
        d.add(new Card(CardColor.GREEN, CardValue.NINE));
        d.add(new Card(CardColor.GREEN, CardValue.SKIP));
        d.add(new Card(CardColor.GREEN, CardValue.DRAW_TWO));
        d.add(new Card(CardColor.RED, CardValue.ONE));
        d.add(new Card(CardColor.RED, CardValue.TWO));
        d.add(new Card(CardColor.RED, CardValue.THREE));
        d.add(new Card(CardColor.RED, CardValue.FOUR));
        d.add(new Card(CardColor.RED, CardValue.FIVE));
        d.add(new Card(CardColor.RED, CardValue.SIX));
        d.add(new Card(CardColor.RED, CardValue.SEVEN));
        d.add(new Card(CardColor.RED, CardValue.EIGHT));
        d.add(new Card(CardColor.RED, CardValue.NINE));
        d.add(new Card(CardColor.RED, CardValue.SKIP));
        d.add(new Card(CardColor.RED, CardValue.DRAW_TWO));
        d.add(new Card(CardColor.YELLOW, CardValue.ONE));
        d.add(new Card(CardColor.YELLOW, CardValue.TWO));
        d.add(new Card(CardColor.YELLOW, CardValue.THREE));
        d.add(new Card(CardColor.YELLOW, CardValue.FOUR));
        d.add(new Card(CardColor.YELLOW, CardValue.FIVE));
        d.add(new Card(CardColor.YELLOW, CardValue.SIX));
        d.add(new Card(CardColor.YELLOW, CardValue.SEVEN));
        d.add(new Card(CardColor.YELLOW, CardValue.EIGHT));
        d.add(new Card(CardColor.YELLOW, CardValue.NINE));
        d.add(new Card(CardColor.YELLOW, CardValue.SKIP));
        d.add(new Card(CardColor.YELLOW, CardValue.DRAW_TWO));

        // add wilds
        d.add(new Card(CardColor.WILD, CardValue.WILD));
        d.add(new Card(CardColor.WILD, CardValue.WILD));
        d.add(new Card(CardColor.WILD, CardValue.DRAW_FOUR));
        d.add(new Card(CardColor.WILD, CardValue.DRAW_FOUR));
        d.add(new Card(CardColor.WILD, CardValue.WILD));
        d.add(new Card(CardColor.WILD, CardValue.WILD));
        d.add(new Card(CardColor.WILD, CardValue.DRAW_FOUR));
        d.add(new Card(CardColor.WILD, CardValue.DRAW_FOUR));
        d.shuffle();
        return d;
    }
}

