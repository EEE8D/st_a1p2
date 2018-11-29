package view;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleViewTest {

    //First test input
    @Test
    void GetInputChar_Char_ShouldReturnChar(){
        SimpleView a_view = new SimpleView();

        int actual = a_view.getInputChar();

        int expect = 'p';

        assertEquals(expect, actual);

    }



//    @Test
//    void CollectEvent_a_letter_


}