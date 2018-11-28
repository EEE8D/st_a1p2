package model;

public class Dealer extends Player{

    private Deck m_deck;

    Dealer(){};

    boolean NewGame(Player a_player){
        return true;
    }

    boolean Hit(Player a_player){
        return true;
    }

    boolean Stand(Player a_player){
        return true;
    }

    boolean IsDealerWinner(Player a_player){
        return false;
    }

    boolean IsGameOver(){
        return false;
    }

    void dealNextCard(boolean isCardNotHidden, Player a_player){

    }
}
