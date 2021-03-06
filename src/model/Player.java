package model;

import java.util.LinkedList;
import java.util.List;

public class Player {

    private List<Card> m_hand;
    protected final int g_maxScore = 21;

    public Player() {
        m_hand = new LinkedList<Card>();
    }

    void DealCard(Card a_addToHand) {
        m_hand.add(a_addToHand);
    }

    Iterable<Card> GetHand() {
        return m_hand;
    }

    void ShowHand() {
        for (Card c : GetHand()) {
            c.Show(true);
        }
    }

    //no test implement in this method, should be detected by code coverage
    void ClearHand() {
        m_hand.clear();
    }

    int CalcScore() {
        int cardScores[] = {
                2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11
        };

        int score = 0;

        for (Card c : GetHand()) {
            if (c.GetValue() != Card.Value.Hidden) {
                score += cardScores[c.GetValue().ordinal()];
            }
        }

        if (score > g_maxScore) {
            for (Card c : GetHand()) {
                if (c.GetValue() == Card.Value.Ace && score > g_maxScore) {
                    score -= 10;
                }
            }
        }

        return score;
    }
}
