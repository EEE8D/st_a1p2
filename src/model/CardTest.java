package model;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardTest {

    @Test
    void JunitPractice(){
        assertEquals(4, 2+2);
    }

    @Test
    void newCard_TwoOfHearts_TestConstructor_ShouldReturnTrue(){
        Card a_card = new Card(Card.Value.values()[0], Card.Color.values()[0]);
        assertEquals(Card.Value.Two, a_card.m_value);
        assertEquals(Card.Color.Hearts, a_card.m_color);
    }

    @Test
    void getValue_ShouldPass(){
        Card a_card = new Card(Card.Value.values()[0], Card.Color.values()[0]);
        assertEquals(Card.Value.Two, a_card.getValue());
    }
}