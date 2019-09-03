/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 *
 * Patrick Ryan and Karam Fasih
 * June 9, 2019
 *
 */
package ca.sheridancollege.project;

/**
 * A class that models each Player in the game. Players have an identifier,
 * which should be unique.
 *
 * @author dancye, 2018
 * @modified Patrick Ryan
 */
public class Player {

    private String playerID; //the unique ID for this player
    private Hand hand; //the unique ID for this player

    /**
     * A constructor that allows you to set the player's unique ID
     *
     * @param name the unique ID to assign to this player.
     * @param hand the current hand of the player.
     */
    public Player(String name, Hand hand) {
        playerID = name;
        this.hand = hand;
    }

    /**
     * @return the playerID
     */
    public String getPlayerID() {
        return playerID;
    }

    /**
     * Ensure that the playerID is unique
     *
     * @param givenID the playerID to set
     */
    public void setPlayerID(String givenID) {
        playerID = givenID;
    }
    
    public Hand getHand() {
        return hand;
    }
    
    public void setHand(Hand hand) {
        this.hand = hand;
    }
    
    public Card getCard(int index) {
        return hand.get(index);
    }
    
    public void addCardToHand(Card c) {
        hand.add(c);
    }
    
    public Card removeCardFromHand(Card c) {
        hand.remove(hand.indexOf(c));
        return c;
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Player)) {
            return false;
        }
        
        Player player = (Player)other;
        
        return playerID.equals(player.playerID);
        
    }
}
