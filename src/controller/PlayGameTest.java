package controller;

import model.Dealer;
import model.Game;
import model.Player;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import view.SimpleView;

import static org.mockito.Mockito.*;

class PlayGameTest {

    SimpleView a_view;
    Game a_game;
    Dealer a_dealer;
    Player a_player;

    @BeforeEach
    void setup() {
        a_view = mock(SimpleView.class);
        a_game = mock(Game.class);
        a_dealer = mock(Dealer.class);
        a_player = mock(Player.class);
    }

    @Test
    void Play_Should_Print_WelcomeMessage() {
        PlayGame projectManager = new PlayGame();

        projectManager.Play(a_view, a_game);

        verify(a_view).DisplayWelcomeMessage();
    }

    @Test
    void Play_Should_Print_Table_after_print_message() {
        PlayGame projectManager = new PlayGame();

        projectManager.Play(a_view, a_game);

        verify(a_view).DisplayDealerHand(a_game.GetDealerHand(), a_game.GetDealerScore());
        verify(a_view).DisplayPlayerHand(a_game.GetPlayerHand(), a_game.GetPlayerScore());
    }

    @Test
    void IsGameOver_Branch_True_Should_Call_View_DisplayGameOver() {
        PlayGame projectManager = new PlayGame();
        when(a_game.IsGameOver()).thenReturn(true);
        when(a_game.IsDealerWinner()).thenReturn(true);

        projectManager.Play(a_view, a_game);

        verify(a_view).DisplayWinner(a_game.IsDealerWinner());
    }

    @Test
    void IsGameOver_Branch_False_Should_Not_Call_View_DisplayGameOver() {
        PlayGame projectManager = new PlayGame();
        when(a_game.IsGameOver()).thenReturn(false);
        when(a_game.IsDealerWinner()).thenReturn(true);

        projectManager.Play(a_view, a_game);

        verify(a_view, never()).DisplayWinner(a_game.IsDealerWinner());
    }

    @Test
    void Play_Should_collectEvent() {
        PlayGame projectManager = new PlayGame();

        projectManager.Play(a_view, a_game);

        verify(a_view).collectEvents();
    }

    @Test
    void StartNewGame_Branch_True_Should_Call_Dealer_To_Start_NewGame() {
        PlayGame projectManager = new PlayGame();
        when(a_view.wantsToStartNewGame()).thenReturn(true);

        projectManager.Play(a_view, a_game);

        verify(a_game).NewGame();
    }

    @Test
    void StartNewGame_Branch_False_Should_Call_Dealer_To_Start_NewGame() {
        PlayGame projectManager = new PlayGame();
        when(a_view.wantsToStartNewGame()).thenReturn(false);

        projectManager.Play(a_view, a_game);

        verify(a_game, never()).NewGame();
    }

    @Test
    void Stand_Branch_True_Should_Call_Dealer_Stand() {
        PlayGame projectManager = new PlayGame();
        when(a_view.wantsToStand()).thenReturn(true);

        projectManager.Play(a_view, a_game);

        verify(a_game).Stand();
    }

    @Test
    void Stand_Branch_False_Should_Call_Dealer_Stand() {
        PlayGame projectManager = new PlayGame();
        when(a_view.wantsToStand()).thenReturn(false);

        projectManager.Play(a_view, a_game);

        verify(a_game, never()).Stand();
    }

    @Test
    void Hit_Branch_True_Should_Call_Dealer_Hit() {
        PlayGame projectManager = new PlayGame();
        when(a_view.wantsToHit()).thenReturn(true);

        projectManager.Play(a_view, a_game);

        verify(a_game).Hit();
    }

    @Test
    void Hit_Branch_False_Should_Call_Dealer_Hit() {
        PlayGame projectManager = new PlayGame();
        when(a_view.wantsToHit()).thenReturn(false);

        projectManager.Play(a_view, a_game);

        verify(a_game, never()).Hit();
    }

}