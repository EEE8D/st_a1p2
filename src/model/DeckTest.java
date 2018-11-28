package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


class DeckTest {

    @Test
    void ShuffledDeck_constructor_ShouldPass(){
        Deck mocked_deck = mock(Deck.class);
//        when(mocked_deck.)
        verify(mocked_deck).shuffle();
    }
}