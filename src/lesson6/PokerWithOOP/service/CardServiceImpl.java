package lesson6.PokerWithOOP.service;

import lesson6.PokerWithOOP.model.Card;

import java.util.Random;

public class CardServiceImpl implements CardService {

    @Override
    public Card[] generationCards(String[] cardNum, String[] cardColor) {
        Random random = new Random();
        Card[] allSet = new Card[20];
        for (int i = 0, k = 1; i < 20; i++, k++) {
            String card = cardNum[random.nextInt(cardNum.length)];
            String color = cardColor[random.nextInt(cardColor.length)];

            allSet[i] = new Card(card, color);

            if (k == 5)
                k = 1;
            if (i == 0) {
                System.out.println("Player № " + k + " gets card: " + allSet[i]);
                continue;
            }
            for (int j = 0; j < i; j++) {
                if (allSet[j].equals(allSet[i])) {
                    allSet[i] = new Card(cardNum[random.nextInt(cardNum.length)], cardColor[random.nextInt(cardColor.length)]);
                    j = 0;
                }
            }
            System.out.println("Player № " + k + " gets card: " + allSet[i]);
        }
        return allSet;
    }

    @Override
    public Card[] sorting(Card[] set, int count) {
        int index = 0;
        Card[] cardSet = new Card[5];
        while (count < set.length) {
            cardSet[index] = set[count];
            count = count + 4;
            index++;
        }
        return cardSet;
    }
}
