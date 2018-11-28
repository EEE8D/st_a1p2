package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


class DeckTest {

    @Test
    void ShuffledDeck_ShouldPass(){
        Deck mocked_deck = mock(Deck.class);
        mocked_deck.Shuffle();
        verify(mocked_deck).Shuffle();
    }
}