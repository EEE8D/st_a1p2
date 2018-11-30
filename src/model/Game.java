package model;

import java.security.PublicKey;

public class Game {

    protected Dealer m_dealer;
    protected Player m_player;

    public boolean GameInit(Dealer dealer, Player player){
        try{
            m_dealer = dealer;
            m_player = player;
            return true;
        } catch (Exception e){
            System.out.println("" + e);
            return false;
        }
    }

    public boolean NewGame(){
        return m_dealer.NewGame(m_player);
    }

    public boolean Hit(){
        return m_dealer.Hit(m_player);
    }

    public boolean Stand(){
        return m_dealer.Stand();
    }

    public boolean IsGameOver(){
        return m_dealer.IsGameOver();
    }

    public boolean IsDealerWinner(){
        return m_dealer.IsDealerWinner(m_player);
    }

    public int GetDealerScore() {
        return m_dealer.CalcScore();
    }

    public int GetPlayerScore() {
        return m_player.CalcScore();
    }
}
