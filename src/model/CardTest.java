package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardTest {

    @Test
    void JunitPractice(){
        assertEquals(4, 2+2);
    }

    @Test
    void NewCard_TwoOfHearts_TestConstructor_ShouldReturnTrue(){
        Card a_card = new Card(Card.Value.values()[0], Card.Color.values()[0]);
        a_card.Show(true);
        assertEquals(Card.Value.Two, a_card.GetValue());
        assertEquals(Card.Color.Hearts, a_card.GetColor());
    }

    @Test
    void GetValue_ShouldReturnTwo(){
        Card a_card = new Card(Card.Value.values()[0], Card.Color.values()[0]);
        a_card.Show(true);
        assertEquals(Card.Value.Two, a_card.GetValue());
    }

    @Test
    void GetColor_ShouldReturnHearts(){
        Card a_card = new Card(Card.Value.values()[0], Card.Color.values()[0]);
        a_card.Show(true);
        assertEquals(Card.Color.Hearts, a_card.GetColor());
    }

    @Test
    void WithoutShow_GetValue_ShouldReturnHidden(){
        Card a_card = new Card(Card.Value.values()[0], Card.Color.values()[0]);
        assertEquals(Card.Value.Hidden, a_card.GetValue());
    }

    @Test
    void WithoutShow_GetColor_ShouldReturnHidden(){
        Card a_card = new Card(Card.Value.values()[0], Card.Color.values()[0]);
        assertEquals(Card.Color.Hidden, a_card.GetColor());
    }
}