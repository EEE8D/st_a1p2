package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DealerTest {

    @Test
    void IsDealerWinner_Dealer_AH_10H_Player_AS_9H_ShouldReturnTrue(){
        Dealer a_dealer = new Dealer();
        Player a_player = new Player();

        a_dealer.DealCard(new Card(Card.Value.Ace, Card.Color.Hearts));
        a_dealer.DealCard(new Card(Card.Value.Ten, Card.Color.Hearts));
        a_player.DealCard(new Card(Card.Value.Ace, Card.Color.Spades));
        a_player.DealCard(new Card(Card.Value.Nine, Card.Color.Hearts));

//        int d_score = a_dealer.CalcScore();
//        int p_score = a_player.CalcScore();

        assertTrue(a_dealer.IsDealerWinner(a_player));
    }
}