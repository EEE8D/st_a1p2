package model;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void DealCard_ReceiveCard_TwoOfHearts_ShouldPass(){
        Player a_player = new Player();
        Card card = new Card(Card.Value.Two, Card.Color.Hearts);
        a_player.DealCard(card);
        assertEquals(card, a_player.GetHand().iterator().next());
    }

    @Test
    void Without_ShowHand_Value_ShouldReturnHidden(){
        Player a_player = new Player();
        Card card = new Card(Card.Value.Two, Card.Color.Hearts);
        a_player.DealCard(card);
        assertEquals(Card.Value.Hidden, a_player.GetHand().iterator().next().GetValue());
    }

    @Test
    void Without_ShowHand_Color_ShouldReturnHidden(){
        Player a_player = new Player();
        Card card = new Card(Card.Value.Two, Card.Color.Hearts);
        a_player.DealCard(card);
        assertEquals(Card.Color.Hidden, a_player.GetHand().iterator().next().GetColor());
    }

}