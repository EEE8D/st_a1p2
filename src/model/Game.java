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
        return false;
    }

    public boolean Hit(){
        return false;
    }

    public boolean Stand(){
        return false;
    }

    public boolean IsGameOver(){
        return false;
    }

    public boolean IsDealerWinner(){
        return false;
    }


}
