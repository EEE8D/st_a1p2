package model;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;

import static org.junit.jupiter.api.Assertions.*;

class DealerTest {

    @Test
    void IsDealerWinner_Dealer_AH_10H_Player_AS_9H_ShouldReturnTrue(){
        Dealer a_dealer = new Dealer();
        Player a_player = new Player();

        a_dealer.DealCard(new Card(Card.Value.Ace, Card.Color.Hearts));
        a_dealer.DealCard(new Card(Card.Value.Ten, Card.Color.Hearts));
        a_dealer.ShowHand();
        a_player.DealCard(new Card(Card.Value.Ace, Card.Color.Spades));
        a_player.DealCard(new Card(Card.Value.Nine, Card.Color.Hearts));
        a_dealer.ShowHand();

        assertTrue(a_dealer.IsDealerWinner(a_player));
    }

    @Test
    void IsDealerWinner_Dealer_AH_9H_Player_AS_10H_ShouldReturnFalse(){
        Dealer a_dealer = new Dealer();
        Player a_player = new Player();

        a_dealer.DealCard(new Card(Card.Value.Ace, Card.Color.Hearts));
        a_dealer.DealCard(new Card(Card.Value.Nine, Card.Color.Hearts));
        a_dealer.ShowHand();
        a_player.DealCard(new Card(Card.Value.Ace, Card.Color.Spades));
        a_player.DealCard(new Card(Card.Value.Ten, Card.Color.Hearts));
        a_player.ShowHand();

        assertFalse(a_dealer.IsDealerWinner(a_player));
    }

    @Test
    void IsDealerWinner_Dealer_AH_9H_10S_Player_AS_10H_ShouldReturnFalse(){
        Dealer a_dealer = new Dealer();
        Player a_player = new Player();

        a_dealer.DealCard(new Card(Card.Value.Ace, Card.Color.Hearts));
        a_dealer.DealCard(new Card(Card.Value.Nine, Card.Color.Hearts));
        a_dealer.DealCard(new Card(Card.Value.Ten, Card.Color.Spades));
        a_dealer.ShowHand();
        a_player.DealCard(new Card(Card.Value.Ace, Card.Color.Spades));
        a_player.DealCard(new Card(Card.Value.Ten, Card.Color.Hearts));
        a_player.ShowHand();

        assertFalse(a_dealer.IsDealerWinner(a_player));
    }

    @Test
    void IsDealerWinner_Dealer_AH_9H_Player_AS_10H_10S_2H_ShouldReturnTrue(){
        Dealer a_dealer = new Dealer();
        Player a_player = new Player();

        a_dealer.DealCard(new Card(Card.Value.Ace, Card.Color.Hearts));
        a_dealer.DealCard(new Card(Card.Value.Nine, Card.Color.Hearts));
        a_dealer.ShowHand();
        a_player.DealCard(new Card(Card.Value.Ace, Card.Color.Spades));
        a_player.DealCard(new Card(Card.Value.Ten, Card.Color.Hearts));
        a_player.DealCard(new Card(Card.Value.Ten, Card.Color.Spades));
        a_player.DealCard(new Card(Card.Value.Two, Card.Color.Hearts));
        a_player.ShowHand();

        assertTrue(a_dealer.IsDealerWinner(a_player));
    }

    @Test
    void DealNextCard_ShouldPass(){
        Dealer a_dealer = new Dealer();
        a_dealer.m_deck = new Deck();

        Card firstCard = a_dealer.m_deck.m_cards.get(0);

        a_dealer.dealNextCard(true, a_dealer);

        assertEquals(firstCard, a_dealer.GetHand().iterator().next());
    }

    @Test
    void NewGame_WhenCall_ShouldDealCardsInRightWay(){
        Dealer a_dealer = mock(Dealer.class);
//        Player a_player = new Player();
        Player a_player = mock(Player.class);

        when(a_dealer.NewGame(a_player)).thenReturn(true);
        verify(a_dealer).dealNextCard(false, a_dealer);
        verify(a_dealer).dealNextCard(true, a_dealer);
        verify(a_dealer).dealNextCard(true, a_player);
        verify(a_dealer).dealNextCard(true, a_player);

    }
}