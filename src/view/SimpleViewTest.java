package view;

import model.Card;
import model.Game;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

import static org.junit.jupiter.api.Assertions.*;

class SimpleViewTest {

    //First test input
//    @Test //mock System.in
//    void CollectEvent_p_ShouldReturnChar(){
//        SimpleView a_view = mock(SimpleView.class);
////        System mock_system = mock(System.class);
//        when(a_view.GetInputChar()).thenReturn((int)'p');
////        when(System.in.read())
//
////        a_view.collectEvents();
//        a_view.m_input = a_view.GetInputChar();
//
//        int actual = a_view.m_input;
//        int expect = 'p';
//
//        assertEquals(expect, actual);

//        SimpleView a_view = new SimpleView();
//        a_view.GetInputChar();
//    }

    @Test
    void wantsToStartNewGame_receive_p_then_return_true(){
        SimpleView a_view = new SimpleView();
        a_view.m_input = (int) 'p';
        assertTrue(a_view.wantsToStartNewGame());
    }

    @Test
    void wantsToStartNewGame_receive_h_then_return_false(){
        SimpleView a_view = new SimpleView();
        a_view.m_input = (int) 'h';
        assertFalse(a_view.wantsToStartNewGame());
    }

    @Test
    void wantsToHit_receive_p_then_return_false(){
        SimpleView a_view = new SimpleView();
        a_view.m_input = (int) 'p';
        assertFalse(a_view.wantsToHit());
    }

    @Test
    void wantsToHit_receive_h_then_return_true(){
        SimpleView a_view = new SimpleView();
        a_view.m_input = (int) 'h';
        assertTrue(a_view.wantsToHit());
    }

    @Test
    void wantsToStand_receive_s_then_return_true(){
        SimpleView a_view = new SimpleView();
        a_view.m_input = (int) 's';
        assertTrue(a_view.wantsToStand());
    }

    @Test
    void wantsToQuit_receive_h_then_return_true(){
        SimpleView a_view = new SimpleView();
        a_view.m_input = (int) 'q';
        assertTrue(a_view.wantsToQuit());
    }

    @Test
    void DisplayWelcomeMessage_ShouldPass(){
        SimpleView a_view = new SimpleView();
        a_view.DisplayWelcomeMessage();
    }

    @Test
    void DisplayWinner_ShouldPass(){
        SimpleView a_view = new SimpleView();
        Game a_game = mock(Game.class);
        when(a_game.IsDealerWinner()).thenReturn(true);
        a_view.DisplayWinner(a_game.IsDealerWinner());
    }

    @Test
    void DisplayWinner_ShouldPass2(){
        SimpleView a_view = new SimpleView();
        Game a_game = mock(Game.class);
        when(a_game.IsDealerWinner()).thenReturn(false);
        a_view.DisplayWinner(a_game.IsDealerWinner());
    }

    @Test
    void DisplayDealerHand_ShouldPass(){
        SimpleView a_view = new SimpleView();
        Game a_game = mock(Game.class);
        when(a_game.GetDealerScore()).thenReturn(0);

        a_view.DisplayDealerHand(a_game.GetDealerHand(), a_game.GetDealerScore());
    }

    @Test
    void DisplayPlayerHand_ShouldPass(){
        SimpleView a_view = new SimpleView();
        Game a_game = mock(Game.class);
        when(a_game.GetPlayerScore()).thenReturn(0);

        a_view.DisplayPlayerHand(a_game.GetPlayerHand(), a_game.GetPlayerScore());
    }

    @Test
    void DisplayHand_ShouldPass(){
        SimpleView a_view = new SimpleView();
        Game a_game = mock(Game.class);
        when(a_game.GetPlayerScore()).thenReturn(0);

        a_view.DisplayHand("Dealer", a_game.GetPlayerHand(), a_game.GetPlayerScore());
    }

    @Test
    void DisplayCard_shouldPass(){
        SimpleView a_view = new SimpleView();
        Card a_card = mock(Card.class);
        a_view.DisplayCard(a_card);
    }


}