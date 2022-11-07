package lesson6.PokerWithOOP.model;

import java.util.Objects;

public class Card {

    private String number;

    private String color;

    public Card(String number, String color) {
        this.number = number;
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return Objects.equals(number, card.number) && Objects.equals(color, card.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, color);
    }

    @Override
    public String toString() {
        return number + " " + color;
    }
}
