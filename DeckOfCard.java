package com.bridgelabz.objectOriented;

import java.util.Random;
public class DeckOfCard {
    String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
    String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    String[][] cards = new String[4][13];
    String[][] player = new String[4][9];
    public void getCardCombination() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                cards[i][j] = ranks[j] + suits[i];
            }
        }
    }
    public void getPlayer() {
        for (int i = 0; i < 4; i++) {
            System.out.println("\nCards for Player " + (i + 1) + "\n");
            for (int j = 0; j < 9; j++) {
                Random random = new Random();
                int randomSuit = random.nextInt(4);
                int randomRank = random.nextInt(13);
                player[i][j] = cards[randomSuit][randomRank];
                System.out.print(player[i][j] + "   \n");
            }
        }
    }
    public static void main(String[] args) {
       DeckOfCard card = new DeckOfCard();
       card.getCardCombination();
       card.getPlayer();
    }
}
