package controller;

import model.Game;
import view.SimpleView;

import javax.swing.text.View;

public class PlayGame {

    boolean Play(SimpleView a_view, Game a_game){
        a_view.DisplayWelcomeMessage();
        return true;
    }
}
