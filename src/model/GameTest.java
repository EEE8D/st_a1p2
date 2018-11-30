package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

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
        Game a_game = new Game();
        assertTrue(a_game.GameInit(m_dealer, m_player));
        assertEquals(m_dealer, a_game.m_dealer);
        assertEquals(m_player, a_game.m_player);
    }

    @Test
    void NewGame_WillCall_Dealer_NewGame(){
        Game a_game = new Game();
        assertTrue(a_game.GameInit(m_dealer, m_player));

        a_game.NewGame();
        verify(m_dealer).NewGame(m_player);
    }

}