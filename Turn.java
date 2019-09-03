/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.Scanner;

/**
 *
 * @author kd
 */
public class Turn {

    public static boolean playable(Card card, Card topCard) {
        if (card.getColor() == topCard.getColor() 
                || topCard.getColor() == CardColor.WILD) {
            return true;
        } else if (card.getValue() == topCard.getValue()) {
            return true;
        } else if (card.getColor() == CardColor.WILD) {
            return true;
        } else {
            return false;
        }
    }
}
