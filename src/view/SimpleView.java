package view;

import java.io.IOException;

public class SimpleView {

    int m_input;

    int GetInputChar()  {
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
//        return false;
        return m_input == 'p';
    }

    public boolean wantsToHit() {
        return false;

//        return m_input == 'h';
    }

    public boolean wantsToStand() {
        return false;

//        return m_input == 's';
    }

    public boolean wantsToQuit() {
        return false;

//        return m_input == 'q';
    }
}
