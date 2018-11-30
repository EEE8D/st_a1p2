package view;

public class SimpleView {

    int m_input;

    int GetInputChar() {
        try {
            int c = System.in.read();
            while (c == '\r' || c == '\n') {
                c = System.in.read();
            }
            return c;
        } catch (java.io.IOException e) {
            System.out.println("" + e);
            return 0;
        }
    }

    public void collectEvents() {
        m_input = GetInputChar();
    }

    public boolean wantsToStartNewGame() {
        return m_input == 'p';
    }

    public boolean wantsToHit() {
        return m_input == 'h';
    }

    public boolean wantsToStand() {
        return m_input == 's';
    }

    public boolean wantsToQuit() {
        return m_input == 'q';
    }
    //above is input part

    //below is output part
    public void DisplayWinner(boolean a_dealerIsWinner) {
        System.out.println("GameOver: ");
        if (a_dealerIsWinner) {
            System.out.println("Dealer Won!");
        } else {
            System.out.println("You Won!");
        }
    }

    private void DisplayCard(model.Card a_card) {
        System.out.println("\t" + a_card.GetValue() + " of " + a_card.GetColor());
    }

    public void DisplayDealerHand(Iterable<model.Card> a_hand, int a_score) {
        DisplayHand("Dealer", a_hand, a_score);
    }

    public void DisplayPlayerHand(Iterable<model.Card> a_hand, int a_score) {
        DisplayHand("Player", a_hand, a_score);
    }

    private void DisplayHand(String a_name, Iterable<model.Card> a_hand, int a_score) {
        System.out.println(a_name + " Has: ");
        for (model.Card c : a_hand) {
            DisplayCard(c);
        }
        System.out.println("Score: " + a_score);
        System.out.println("");
    }

    public void DisplayWelcomeMessage() {
        System.out.println("\nHello Black Jack World");
        System.out.println("Type 'p' to Play, 'h' to Hit, 's' to Stand or 'q' to Quit\n");
    }
}