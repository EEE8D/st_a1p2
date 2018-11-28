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

    @Test
    void ShowHand_Value_ShouldReturnTwo(){
        Player a_player = new Player();
        Card card = new Card(Card.Value.Two, Card.Color.Hearts);
        a_player.DealCard(card);

        a_player.ShowHand();

        assertEquals(Card.Value.Two, a_player.GetHand().iterator().next().GetValue());
    }

    @Test
    void ShowHand_Color_ShouldReturnHearts(){
        Player a_player = new Player();
        Card card = new Card(Card.Value.Two, Card.Color.Hearts);
        a_player.DealCard(card);

        a_player.ShowHand();

        assertEquals(Card.Color.Hearts, a_player.GetHand().iterator().next().GetColor());
    }

    @Test
    void CalcScore_2H_ShouldReturn2(){
        Player a_player = new Player();

        a_player.DealCard(new Card(Card.Value.Two, Card.Color.Hearts));
        a_player.ShowHand();

        int expected = 2;
        int actual = a_player.CalcScore();

        assertEquals(expected, actual);
    }

    @Test
    void CalcScore_2H_5H_ShouldReturn7(){
        Player a_player = new Player();

        a_player.DealCard(new Card(Card.Value.Two, Card.Color.Hearts));
        a_player.DealCard(new Card(Card.Value.Five, Card.Color.Hearts));
        a_player.ShowHand();

        int expected = 7;
        int actual = a_player.CalcScore();

        assertEquals(expected, actual);
    }

    @Test
    void CalcScore_2H_5H_AceH_ShouldReturn18(){
        Player a_player = new Player();

        a_player.DealCard(new Card(Card.Value.Two, Card.Color.Hearts));
        a_player.DealCard(new Card(Card.Value.Five, Card.Color.Hearts));
        a_player.DealCard(new Card(Card.Value.Ace, Card.Color.Hearts));
        a_player.ShowHand();

        int expected = 18;
        int actual = a_player.CalcScore();

        assertEquals(expected, actual);
    }

    @Test
    void CalcScore_2H_5H_AceH_10H_ShouldReturn18(){
        Player a_player = new Player();

        a_player.DealCard(new Card(Card.Value.Two, Card.Color.Hearts));
        a_player.DealCard(new Card(Card.Value.Five, Card.Color.Hearts));
        a_player.DealCard(new Card(Card.Value.Ace, Card.Color.Hearts));
        a_player.DealCard(new Card(Card.Value.Ten, Card.Color.Hearts));
        a_player.ShowHand();

        int expected = 18;
        int actual = a_player.CalcScore();

        assertEquals(expected, actual);
    }

    @Test
    void CalcScore_AceH_AceS_ShouldReturn12(){
        Player a_player = new Player();

        a_player.DealCard(new Card(Card.Value.Ace, Card.Color.Hearts));
        a_player.DealCard(new Card(Card.Value.Ace, Card.Color.Spades));
        a_player.ShowHand();

        int expected = 12;
        int actual = a_player.CalcScore();

        assertEquals(expected, actual);
    }
}