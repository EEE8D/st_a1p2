package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


class DeckTest {

    @Test
    void ShuffledDeck_PracticeMock_ShouldPass(){
        Deck mocked_deck = mock(Deck.class);
        mocked_deck.Shuffle();
        verify(mocked_deck).Shuffle();
    }

    @Test
    void getCard(){
        Deck a_deck = new Deck();
        assertEquals(new Card(Card.Value.Two, Card.Color.Hearts), a_deck.getCard());
    }

//    @Test
//    void newDeck_ShouldHas52Cards(){
//        Deck a_deck = new Deck();
//        assertTrue(a_deck.m_cards.contains());
//    }
}