package com.company;

enum Suit { Hearts, Diamonds, Spades, Clubs };
enum Rank { N2, N3, N4, N5, N6, N7, N8, N9, N10, Jack, Queen, King, Ace };

public class PokerCard
{
    Suit suit;
    Rank rank;

    public PokerCard(Suit suit, Rank rank)
    {
        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit() {return suit;}
    public Rank getRank() {return rank;}

    @Override
    public String toString()
    {
        String ANSI_RESET = "\u001B[0m";
        String ANSI_RED = "\u001B[31m";
        String[] num = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[] mano = {ANSI_RED + "♥", ANSI_RED + "◆", "♠", "♣"};
        return num[rank.ordinal()] + mano[suit.ordinal()] + ANSI_RESET;
    }
}
