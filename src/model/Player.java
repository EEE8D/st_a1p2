package model;

import java.util.LinkedList;
import java.util.List;

public class Player {

    private List<Card> m_hand;

    Player(){
        m_hand = new LinkedList<Card>();
    }

    protected void DealCard(Card a_addToHand) {
        m_hand.add(a_addToHand);
//        HandUpdateEvent();
    }

    protected Iterable<Card> GetHand() {
        return m_hand;
    }

    void ShowHand() {
        for (Card c : GetHand()) {
            c.Show(true);
        }
    }

    int CalcScore(){
        int cardScores[] = {
                2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11
        };

        int score = 0;

        for (Card c : GetHand()) {
            if (c.GetValue() != Card.Value.Hidden) {
                score += cardScores[c.GetValue().ordinal()];
            }
        }

        return score;
    }
}
