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
    void GetCard_getFirst_ShouldBeTwoOfHearts(){
        Deck a_deck = new Deck();
        Card a_card = a_deck.GetCard();
        a_card.Show(true);
        assertEquals(Card.Value.Two, a_card.GetValue());
        assertEquals(Card.Color.Hearts, a_card.GetColor());
    }

    @Test
    void GetCard2_clear_insert_HiddenOfHidden(){
        Deck a_deck = new Deck();
        a_deck.m_cards.clear();

        Card a_card = new Card(Card.Value.Two, Card.Color.Hearts);
        a_deck.m_cards.add(a_card);

        assertEquals(a_card, a_deck.GetCard());
    }

    @Test
    void Shuffle_ShouldPass(){
        Deck a_deck = new Deck();
        a_deck.Shuffle();
    }
}