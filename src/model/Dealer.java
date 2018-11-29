package model;

import java.util.LinkedList;
import java.util.List;

class Dealer extends Player{

    Deck m_deck;

    Dealer(Deck deck){
        this.m_deck = deck;
    }

    boolean NewGame(Player a_player){
        m_deck = new Deck();

        this.ClearHand();
        a_player.ClearHand();

        dealNextCard(false, this);
        dealNextCard(true, this);
        dealNextCard(true, a_player);
        dealNextCard(true, a_player);
        return true;
    }

    boolean Hit(Player a_player){
        if (a_player.CalcScore() < 21){
            dealNextCard(true, a_player);
            return true;
        }
        return false;
    }

    boolean Stand(){
        if (!IsGameOver()){
            ShowHand();
            while (this.CalcScore() < 17){
                dealNextCard(true, this);
            }
            return true;
        }
        return false;
    }

    boolean IsDealerWinner(Player a_player){
        if (a_player.CalcScore() > g_maxScore) {
            return true;
        } else if (CalcScore() > g_maxScore) {
            return false;
        }
        return this.CalcScore() >= a_player.CalcScore();
    }

    boolean IsGameOver(){
        return this.CalcScore() >= 17;
    }

    void dealNextCard(boolean isCardNotHidden, Player a_player){
        Card c;
        c = m_deck.GetCard();
        c.Show(isCardNotHidden);
        a_player.DealCard(c);
    }

//    boolean PracticeMethod(){
//        if (will_return_zero() == 0){
//            return will_return_true();
//        }
//        return false;
//    }
//
//    boolean will_return_true(){
//        return true;
//    }
//
//    int will_return_zero(){
//        return 0;
//    }
}
