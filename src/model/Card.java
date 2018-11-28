package model;

public class Card {

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

    Card(Value a_value, Color a_color) {
        m_value = a_value;
        m_color = a_color;
    }

    public Value getValue() {
        return m_value;
    }

    public Color getColor() {
        return m_color;
    }
}
