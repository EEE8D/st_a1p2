package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

class GameTest {

    private Dealer m_dealer;
    private Player m_player;

    @BeforeEach
    void setup() {
        m_dealer = mock(Dealer.class);
        m_player = mock(Player.class);
    }

    @Test
    void GameInit_ShouldReturnTrue() {
        Game a_game = new Game(m_dealer, m_player);
        assertEquals(m_dealer, a_game.m_dealer);
        assertEquals(m_player, a_game.m_player);
    }

    @Test
    void NewGame_WillCall_Dealer_NewGame(){
        Game a_game = new Game(m_dealer, m_player);

        a_game.NewGame();
        verify(m_dealer).NewGame(m_player);
    }

    @Test
    void Hit_WillCall_Dealer_Hit(){
        Game a_game = new Game(m_dealer, m_player);

        a_game.Hit();
        verify(m_dealer).Hit(m_player);
    }

    @Test
    void Stand_WillCall_Dealer_Stand(){
        Game a_game = new Game(m_dealer, m_player);

        a_game.Stand();
        verify(m_dealer).Stand();
    }

    @Test
    void IsGameOver_WillCall_Dealer_IsGameOver(){
        Game a_game = new Game(m_dealer, m_player);

        a_game.IsGameOver();
        verify(m_dealer).IsGameOver();
    }

    @Test
    void IsDealerWinner_WillCall_Dealer_IsDealerWinner(){
        Game a_game = new Game(m_dealer, m_player);

        a_game.IsDealerWinner();
        verify(m_dealer).IsDealerWinner(m_player);
    }

    @Test
    void GetDealerScore_Will_Return_2(){
        Game a_game = new Game(m_dealer, m_player);

        when(m_dealer.CalcScore()).thenReturn(2);

        assertEquals(2, a_game.GetDealerScore());
    }

    @Test
    void GetPlayererScore_Will_Return_4(){
        Game a_game = new Game(m_dealer, m_player);

        when(m_player.CalcScore()).thenReturn(4);

        assertEquals(4, a_game.GetPlayerScore());
    }

    @Test
    void GetDealerHand_Will_Call_Dealer_GetHand(){
        Game a_game = new Game(m_dealer, m_player);

        a_game.GetDealerHand();

        verify(m_dealer).GetHand();
    }

    @Test
    void GetPlayerHand_Will_Call_Player_GetHand(){
        Game a_game = new Game(m_dealer, m_player);

        a_game.GetPlayerHand();

        verify(m_player).GetHand();
    }


}