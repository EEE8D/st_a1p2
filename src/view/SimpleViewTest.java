package view;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

import static org.junit.jupiter.api.Assertions.*;

class SimpleViewTest {

    //First test input
    @Test //mock System.in
    void CollectEvent_p_ShouldReturnChar(){
        SimpleView a_view = mock(SimpleView.class);
        when(a_view.GetInputChar()).thenReturn((int)'p');

        int actual = a_view.GetInputChar();
        int expect = 'p';

        assertEquals(expect, actual);
    }

    @Test
    void CollectEvent_h_ShouldReturnChar(){
        SimpleView a_view = mock(SimpleView.class);
        when(a_view.GetInputChar()).thenReturn((int)'h');

        int actual = a_view.GetInputChar();
        int expect = 'h';

        assertEquals(expect, actual);
    }



//    @Test
//    void CollectEvent_a_letter_


}