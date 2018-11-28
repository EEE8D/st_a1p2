package model;

import java.util.TreeMap;

class Card {

    public enum Value {
        Two,
        Three,
        Four,
        Five,
        Six,
        Seven,
        Eight,
        Nine,
        Ten,
        Knight,
        Queen,
        King,
        Ace,
        Count,
        Hidden
    }

    public enum Color {
        Hearts,
        Spades,
        Diamonds,
        Clubs,
        Count,
        Hidden
    }

    private Color m_color;
    private Value m_value;
    private boolean m_isHidden;

    Card(Value a_value, Color a_color) {
        m_value = a_value;
        m_color = a_color;
        m_isHidden = true;
    }

    Color GetColor() {
        if (m_isHidden) {
            return Color.Hidden;
        }
        return m_color;
    }

    Value GetValue() {
        if (m_isHidden) {
            return Value.Hidden;
        }
        return m_value;
    }

    void Show(boolean a_show) {
        m_isHidden = !a_show;
    }

}
