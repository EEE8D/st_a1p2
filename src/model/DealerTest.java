package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

class DealerTest {

    @Test
    void IsDealerWinner_Dealer_AH_10H_Player_AS_9H_ShouldReturnTrue() {
        Deck a_deck = new Deck();
        Dealer a_dealer = new Dealer(a_deck);
        Player a_player = new Player();

        a_dealer.DealCard(new Card(Card.Value.Ace, Card.Color.Hearts));
        a_dealer.DealCard(new Card(Card.Value.Ten, Card.Color.Hearts));
        a_dealer.ShowHand();
        a_player.DealCard(new Card(Card.Value.Ace, Card.Color.Spades));
        a_player.DealCard(new Card(Card.Value.Nine, Card.Color.Hearts));
        a_player.ShowHand();

        assertTrue(a_dealer.IsDealerWinner(a_player));
    }

    @Test
    void IsDealerWinner_Dealer_AH_9H_Player_AS_10H_ShouldReturnFalse() {
        Deck a_deck = new Deck();
        Dealer a_dealer = new Dealer(a_deck);
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
    void IsDealerWinner_Dealer_AH_9H_10S_Player_AS_10H_ShouldReturnFalse() {
        Deck a_deck = new Deck();
        Dealer a_dealer = new Dealer(a_deck);
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
    void IsDealerWinner_Dealer_AH_9H_Player_AS_10H_10S_2H_ShouldReturnTrue() {
        Deck a_deck = new Deck();
        Dealer a_dealer = new Dealer(a_deck);
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
    void DealNextCard_ShouldPass() {
//        Dealer a_dealer = mock(Dealer.class);
//        when(a_dealer.dealNextCard())
        Deck a_deck = new Deck();
        Dealer a_dealer = new Dealer(a_deck);
        a_dealer.m_deck = new Deck();


        Card firstCard = a_dealer.m_deck.m_cards.get(0);

        a_dealer.dealNextCard(true, a_dealer);

        assertEquals(firstCard, a_dealer.GetHand().iterator().next());
    }

//    @Test //have trouble in testing behaviour
//    void NewGame_WhenCall_ShouldDealCardsInRightWay() {
//        Dealer a_dealer = mock(Dealer.class);
//        Player a_player = mock(Player.class);
//
//        a_dealer.NewGame(a_player);
////        when(a_dealer.NewGame(a_player)).thenReturn(true);
//
////        verify(a_dealer).ClearHand();
//
//        fail();
////        verify(a_dealer).dealNextCard(false, a_dealer);
////        verify(a_dealer).dealNextCard(true, a_dealer);
////        verify(a_dealer).dealNextCard(true, a_player);
////        verify(a_dealer).dealNextCard(true, a_player);
//
//    }

//    @Test
//    void NewGame_EmptyDeck_

//    @Test
//    void TestMethod_PracticeMock(){
//        Dealer a_dealer = mock(Dealer.class);
////        when(a_dealer.PracticeMethod()).thenReturn(true);
//        when(a_dealer.will_return_zero()).thenReturn(0);
//        when(a_dealer.will_return_true()).thenReturn(true);
//
//        a_dealer.PracticeMethod();
//
//        verify(a_dealer).will_return_zero();
//        verify(a_dealer).will_return_true();
//    }

    @Test
    void isGameOver_d_Score_16_ShouldBeFalse(){
        Deck a_deck = new Deck();
        Dealer a_dealer = new Dealer(a_deck);

        a_dealer.DealCard(new Card(Card.Value.Six, Card.Color.Hearts));
        a_dealer.DealCard(new Card(Card.Value.Ten, Card.Color.Hearts));
        a_dealer.ShowHand();

        assertFalse(a_dealer.IsGameOver());
    }

    @Test
    void isGameOver_d_Score_17_ShouldBeTrue(){
        Deck a_deck = new Deck();
        Dealer a_dealer = new Dealer(a_deck);

        a_dealer.DealCard(new Card(Card.Value.Seven, Card.Color.Hearts));
        a_dealer.DealCard(new Card(Card.Value.Ten, Card.Color.Hearts));
        a_dealer.ShowHand();

        assertTrue(a_dealer.IsGameOver());
    }

    @Test
    void Hit_Player_2_ReturnTrue(){
        Deck a_deck = new Deck();
        Dealer a_dealer = new Dealer(a_deck);
        Player a_player = new Player();

        a_player.DealCard(new Card(Card.Value.Two, Card.Color.Hearts));
        a_player.ShowHand();

        assertTrue(a_dealer.Hit(a_player));
    }

    @Test
    void Hit_Player_22_ReturnFalse(){
        Deck a_deck = new Deck();
        Dealer a_dealer = new Dealer(a_deck);
        Player a_player = new Player();

        a_player.DealCard(new Card(Card.Value.Two, Card.Color.Hearts));
        a_player.DealCard(new Card(Card.Value.King, Card.Color.Hearts));
        a_player.DealCard(new Card(Card.Value.Knight, Card.Color.Hearts));
        a_player.ShowHand();

        assertFalse(a_dealer.Hit(a_player));
    }
}