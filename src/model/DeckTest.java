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
    void GetCard(){
        Deck a_deck = new Deck();
        Card a_card = a_deck.GetCard();
        assertEquals(Card.Value.Two, a_card.GetValue());
        assertEquals(Card.Color.Hearts, a_card.GetColor());
    }

//    @Test
//    void newDeck_ShouldHas52Cards(){
//        Deck a_deck = new Deck();
//        assertTrue(a_deck.m_cards.contains());
//    }
}