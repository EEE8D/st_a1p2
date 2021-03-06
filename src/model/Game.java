package model;

public class Game {

    Dealer m_dealer;
    Player m_player;

    public Game(Dealer dealer, Player player) {
        m_dealer = dealer;
        m_player = player;
    }

    public boolean NewGame() {
        return m_dealer.NewGame(m_player);
    }

    public boolean Hit() {
        return m_dealer.Hit(m_player);
    }

    public boolean Stand() {
        return m_dealer.Stand();
    }

    public boolean IsGameOver() {
        return m_dealer.IsGameOver();
    }

    public boolean IsDealerWinner() {
        return m_dealer.IsDealerWinner(m_player);
    }

    public int GetDealerScore() {
        return m_dealer.CalcScore();
    }

    public int GetPlayerScore() {
        return m_player.CalcScore();
    }

    public Iterable<Card> GetDealerHand() {
        return m_dealer.GetHand();
    }

    public Iterable<Card> GetPlayerHand() {
        return m_player.GetHand();
    }
}
