package com.company;

import java.util.Arrays;

public class PokerHand
{
    PokerCard[] hand = new PokerCard[5];

    public PokerHand(PokerCard c1, PokerCard c2, PokerCard c3, PokerCard c4, PokerCard c5)
    {
        hand[0] = c1;
        hand[1] = c2;
        hand[2] = c3;
        hand[3] = c4;
        hand[4] = c5;

        sortHand();
    }

    @Override
    public String toString() {return Arrays.toString(hand);}
    public void sortHand ()
    {
        int i, j;
        for (i = 0; i < hand.length-1; i++)
        {
            for (j = i + 1; j < hand.length; j++)
            {
                if (hand[i].getSuit().ordinal() > hand[j].getSuit().ordinal())
                {
                    PokerCard temp = hand[i];
                    hand[i] = hand[j];
                    hand[j] = temp;
                }
                if (hand[i].getRank().ordinal() > hand[j].getRank().ordinal())
                {
                    PokerCard temp = hand[i];
                    hand[i] = hand[j];
                    hand[j] = temp;
                }
            }
        }
    }
    public boolean isPair()
    {
        boolean p = false;
        int i;
        for (i = 0; i < hand.length-1; i++)
        {
            if (hand[i].getRank() == hand[i+1].getRank())
            {
                p = true;
                i = hand.length-1;
            }
        }
        return p;
    }
    public boolean isTwoPairs()
    {
        boolean p2 = false;
        int i, j = 0;
        for (i = 0; i < hand.length-1; i++)
        {
            if (hand[i].getRank() == hand[i+1].getRank())
            {
                j++;
            }
        }
        if (j == 2)
        {
            p2 = true;
        }
        return p2;
    }
    public boolean isThree()
    {
        boolean t = false;
        int i;
        for (i = 0; i < hand.length-2; i++)
        {
            if (hand[i].getRank() == hand[i+1].getRank() &&
                    hand[i].getRank() == hand[i+2].getRank())
            {
                t = true;
                i = hand.length-2;
            }
        }
        return t;
    }
    public boolean isStraight()
    {
        boolean s = true;
        int i;
        for (i = 0; i < hand.length-1; i++)
        {
            if (hand[i].getRank().ordinal() != 12)
            {
                if (hand[i].getRank().ordinal() != hand[i].getRank().ordinal() + 1)
                {
                    s = false;
                    i = hand.length - 1;
                }
            }
            else
            {
                s = false;
                i = hand.length -1;
            }
        }
        return s;
    }
    public boolean isFlush()
    {
        boolean f = true;
        int i;
        for (i = 0; i < hand.length-1; i++)
        {
            if (hand[i].getSuit() != hand[i+1].getSuit())
            {
                f = false;
                i = hand.length-1;
            }
        }
        return f;
    }
    public boolean isFull()
    {
        boolean p = false;
        boolean t = false;
        int i, pos = -1;
        for (i = 0; i < hand.length-2; i++)
        {
            if (hand[i].getRank() == hand[i+1].getRank() &&
                    hand[i].getRank() == hand[i+2].getRank())
            {
                t = true;
                i = hand.length-2;
                pos = i;
            }
        }

        if (pos == 0)
        {
            if (hand[pos].getRank() == hand[pos + 1].getRank())
            {
                p = true;
            }
        }
        else if (pos == 2)
        {
            if (hand[pos].getRank() == hand[pos-1].getRank())
            {
                p = true;
            }
        }

        return t && p;
    }
    public boolean isPoker()
    {
        boolean p = false;
        int i, eq = 0;
        for (i = 0; i < hand.length-1; i++)
        {
            if (hand[i].getRank() == hand[i+1].getRank())
            {
                eq++;
            }
        }
        if (eq == 4)
        {
            p = true;
        }
        return p;
    }
    public boolean isStraightFlush()
    {
        return isStraight() && isFlush();
    }
    public boolean isRoyalFlush()
    {
        return isStraightFlush() && hand[hand.length - 1].getRank() == Rank.Ace;
    }

    public void descartar(int pos, PokerCard pd)
    {
        hand[pos] = pd;
    }
}