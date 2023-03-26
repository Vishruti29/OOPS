package com.Day11_12;
import java.util.Arrays;
import java.util.Random;

public class DeckOfCards {

    private static final String[] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"};
    private static final String[] RANKS = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    private static final int NUM_CARDS = SUITS.length * RANKS.length;

    private static final String[] deck = new String[NUM_CARDS];

    public static void main(String[] args) {
        initializeDeck();
        shuffleDeck();
        dealCards();
    }

    private static void initializeDeck() {
        int i = 0;
        for (String suit : SUITS) {
            for (String rank : RANKS) {
                deck[i++] = rank + " of " + suit;
            }
        }
    }

    private static void shuffleDeck() {
        Random random = new Random();
        for (int i = 0; i < NUM_CARDS; i++) {
            int j = i + random.nextInt(NUM_CARDS - i);
            String temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }
    }

    private static void dealCards() {
        String[][] playerCards = new String[4][9];
        int cardIndex = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 9; j++) {
                playerCards[i][j] = deck[cardIndex++];
            }
        }
        printCards(playerCards);
    }

    private static void printCards(String[][] playerCards) {
        for (int i = 0; i < 4; i++) {
            System.out.println("Cards for Player " + (i+1) + ": " + Arrays.toString(playerCards[i]));
        }
    }
}
