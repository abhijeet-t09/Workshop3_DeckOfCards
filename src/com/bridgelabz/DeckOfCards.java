package com.bridgelabz;

public class DeckOfCards {
    public static void main(String[] args) {
        System.out.println("-- Deck of Cards --\n");

        String[] suit = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] rank = {"2", "3", "4", "5", "6", "7", "8","9", "10", "Jack", "Queen", "King", "Ace"};
        String[][] cardArray = new String[4][13];

        for(int i = 0; i < 4; i++) {
            System.out.println();
            for (int j = 0; j < 13; j++) {
                cardArray[i][j] = suit[i] + ' ' + rank[j];
                System.out.println(cardArray[i][j]);
            }
        }

        Players player = new Players();
        int noOfPlayer = player.noOfPlayers();

        for(int i=0;i<noOfPlayer;i++) {

            System.out.println();
            System.out.println("\nPlayer " + (i + 1) + " Cards.....");
            System.out.println();

            for (int j = 0; j < 9; j++) {
                System.out.println(cardArray[i][j]);
            }
        }
    }
}
