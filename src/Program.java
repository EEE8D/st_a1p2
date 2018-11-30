import controller.PlayGame;
import model.Dealer;
import model.Deck;
import model.Game;
import model.Player;
import view.SimpleView;

public class Program {

    public static void main(String[] a_args) throws InterruptedException {

        Deck a_deck = new Deck();
        Dealer a_dealer = new Dealer(a_deck);
        Player a_player = new Player();
        Game a_game = new Game(a_dealer, a_player);
        SimpleView a_view = new SimpleView();
        PlayGame projectManager = new PlayGame();

        while (!projectManager.Play(a_view, a_game)) ;
    }
}
