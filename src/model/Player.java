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

}
