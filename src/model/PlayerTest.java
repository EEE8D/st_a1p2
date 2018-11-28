package model;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    Player a_player;

    @BeforeAll
    void setup(){
        Player a_player = new Player();
    }

    @Test
    void DealCard_ReceiveCard_TwoOfHearts_ShouldPass(){
        Card card = new Card(Card.Value.Two, Card.Color.Hearts);
        a_player.DealCard(card);
        assertEquals(card, a_player.m_hand.get(0));
    }
}