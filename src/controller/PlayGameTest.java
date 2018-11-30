package controller;

import model.Game;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import view.SimpleView;

import static org.mockito.Mockito.*;

import javax.swing.text.View;

import static org.junit.jupiter.api.Assertions.*;

class PlayGameTest {

    SimpleView a_view;
    Game a_game;

    @BeforeEach
    void setup(){
        a_view = mock(SimpleView.class);
        a_game = mock(Game.class);
    }

    @Test
    void Play_Should_Print_WelcomeMessage(){
        PlayGame projectManager = new PlayGame();
        projectManager.Play(a_view, a_game);
        verify(a_view).DisplayWelcomeMessage();
    }

}