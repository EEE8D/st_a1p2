package controller;

import model.Game;
import view.SimpleView;

import javax.swing.text.View;

public class PlayGame {

    boolean Play(SimpleView a_view, Game a_game){
        a_view.DisplayWelcomeMessage();

        a_view.DisplayDealerHand(a_game.GetDealerHand(), a_game.GetDealerScore());
        a_view.DisplayPlayerHand(a_game.GetPlayerHand(), a_game.GetPlayerScore());

        if (a_game.IsGameOver()) {
            a_view.DisplayWinner(a_game.IsDealerWinner());
        }

        a_view.collectEvents();

        if (a_view.wantsToStartNewGame()) {
            a_game.NewGame();
        } else if (a_view.wantsToHit()) {
            a_game.Hit();
        } else if (a_view.wantsToStand()) {
            a_game.Stand();
        }

        return true;
    }
}
