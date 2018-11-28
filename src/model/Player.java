package model;

import java.util.LinkedList;
import java.util.List;

public class Player {

    protected List<Card> m_hand;

    Player(){
        m_hand = new LinkedList<Card>();
    }

    public void DealCard(Card a_addToHand) {
        m_hand.add(a_addToHand);
//        HandUpdateEvent();
    }

}
