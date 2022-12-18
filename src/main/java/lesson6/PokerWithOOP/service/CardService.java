package lesson6.PokerWithOOP.service;

import lesson6.PokerWithOOP.model.Card;

public interface CardService {

    Card[] generationCards(String[] cardNum, String[] cardColor);

    Card[] sorting(Card[] set, int count);

}
