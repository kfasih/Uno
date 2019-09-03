package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * This class serves as the main controller of the application. The class
 * retrieves and sends data to and from the user, and interacts with the model
 * classes like deck, hand, player and others.
 *
 * @author Patrick Ryan and Karam Fasih
 */
public class Round {

    private final Player p1;
    private final Player p2;
    private final PlayedCardPile pcp;
    private final Deck deck;

    public Round(Player p1, Player p2) {
        this.p1 = p1;
        this.p2 = p2;
        this.deck = Deck.standardDeckFactory();
        pcp = new PlayedCardPile(new ArrayList<>());
        pcp.add(deck.draw());

        // CLear the current hands of the players, if they exist
        p1.getHand().clear();
        p2.getHand().clear();

        for (int i = 0; i < 7; ++i) {
            p1.addCardToHand(deck.draw());
            p2.addCardToHand(deck.draw());
        }

    }

    public Player play() {

        Player currentPlayer = p1;
        Scanner input = new Scanner(System.in);
        while (p1.getHand().getSize() > 0 && p2.getHand().getSize() > 0) {

            int selection = -1;
            while (selection == -1) {

                displayTurnInfo(currentPlayer);

                try {
                    // Get selected card from user
                    selection = getCardSelection(input,
                            currentPlayer.getHand().getSize());
                } catch (InputMismatchException ex) {
                    System.out.println(ex.getMessage());
                }
            }

            boolean cardPlayed = playTurn(currentPlayer, selection);
            while (!cardPlayed) {
                boolean selectedPrompt = false;
                int response = 0;
                while (!selectedPrompt) {
                    try {
                        System.out.println("Pick one of the following:\n"
                                + "1. Pick a Different Card\n"
                                + "2. Draw Card");

                        response = input.nextInt();
                    } catch (InputMismatchException ex) {
                        System.out.println("Invalid choice!");
                    } finally {
                        input.nextLine(); // flush buffer
                    }

                    if (response == 1 || response == 2) {
                        selectedPrompt = true;
                    }
                }

                if (response == 1) {
                    try {
                        // Get selected card from user
                        selection = getCardSelection(input,
                                currentPlayer.getHand().getSize());
                        cardPlayed = playTurn(currentPlayer, selection);
                    } catch (InputMismatchException ex) {
                        System.out.println(ex.getMessage());
                    }
                } else if (response == 2) {
                    currentPlayer.addCardToHand(draw());
                    break;
                }
            }
            // Apply special effects of pickups and skip cards to other player
            Player otherPlayer = currentPlayer.equals(p1) ? p2 : p1;
            if (cardPlayed) {
                switch (pcp.getTop().getValue()) {
                    case DRAW_TWO:
                        System.out.println("Oh no! " + otherPlayer.getPlayerID()
                                + "Has to draw two cards!");
                        otherPlayer.addCardToHand(draw());
                        otherPlayer.addCardToHand(draw());
                        break;
                    case DRAW_FOUR:
                        System.out.println("Oh no! " + otherPlayer.getPlayerID()
                                + "Has to draw four cards!");
                        otherPlayer.addCardToHand(draw());
                        otherPlayer.addCardToHand(draw());
                        otherPlayer.addCardToHand(draw());
                        otherPlayer.addCardToHand(draw());
                        break;
                    case SKIP:
                        System.out.println("Oh no! " + otherPlayer.getPlayerID()
                                + "Has been skipped!");
                        continue;
                    default:
                        break;
                }
            }
            currentPlayer = otherPlayer; //switches players
        }

        Player winner;
        if (p1.getHand().getSize() == 0) {
            winner = p1;
        } else {
            winner = p2;
        }
        System.out.println("WOW! " + winner.getPlayerID() + " has won the game!");
        return winner;
    }

    /**
     *
     * Prompt user for input and then retrieve.
     *
     * @param input scanner for input
     * @param max max value of the integer that can be inputted.
     * @return the number the user selected
     * @throws InputMismatchException if bad input is given
     */
    public int getCardSelection(Scanner input, int max)
            throws InputMismatchException {
        System.out.print("Which card would you like to play?");

        try {
            int selection = input.nextInt();
            if (selection < 0 || selection >= max) {
                throw new InputMismatchException("Invalid choice entered!");
            }
            return selection;
        } catch (InputMismatchException ex) {
            throw new InputMismatchException("Invalid choice entered!");
        } finally {
            input.nextLine(); // flush buffer
        }
    }

    /**
     * Attempt to play a move specified by the user.
     *
     * @param cp current player
     * @param selection the integer id of the selected card
     * @return true if the turn could be played, false otherwise
     */
    public boolean playTurn(Player cp, int selection) {
        boolean playable = Turn.playable(cp.getCard(selection), pcp.getTop());
        if (playable) {
            Card c = cp.removeCardFromHand(cp.getCard(selection));
            pcp.add(c);
            System.out.println("Played card!");
            return true;
        } else {
            return false;
        }
    }

    /**
     *
     * Display information for the current player's turn.
     *
     * @param player current player
     */
    public void displayTurnInfo(Player player) {
        // Display Cards in hand and who's turn it is
        int i = 0;
        System.out.println(player.getPlayerID());

        System.out.println("Your hand:");
        for (Card card : player.getHand()) {
            System.out.println(i + ": " + card);
            ++i;
        }

        // Print the top of the pile
        System.out.println("Top of discard pile:" + pcp.getTop());
    }

    /**
     * Draw a card from the deck. If the deck is empty, reshuffle the played
     * card pile and then draw a card afterwards.
     *
     * @return a card from the deck.
     */
    public Card draw() {
        if (deck.getSize() == 0) {

            // shuffle the discard pile, return it to the deck, then clear the 
            // discard pile.
            System.out.println("Deck out of cards, re-shuffling...");
            pcp.shuffle();
            deck.setCards((ArrayList<Card>) pcp.getCards().clone());
            pcp.clear();

            // Flip a card for the pile.
            pcp.put(deck.draw());
        }

        return deck.draw();
    }
}
