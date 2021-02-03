package com.company;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class PokerDeck
{
    List<PokerCard> deck;

    public PokerDeck()
    {
        deck = new LinkedList<>();
        int i, j;
        for (i = 0; i < 4; i++)
        {
            for (j = 0; j < 13; j++)
            {
                deck.add(new PokerCard(Suit.values()[i], Rank.values()[j]));
            }
        }

        Collections.shuffle(deck);
    }

    public PokerCard drawCard()
    {
        PokerCard pc = deck.get(0);
        deck.remove(pc);
        return pc;
    }

    public List<PokerCard> getDeck()
    {
        return deck;
    }
}
