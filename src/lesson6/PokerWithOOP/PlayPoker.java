package lesson6.PokerWithOOP;

import lesson6.PokerWithOOP.model.Card;
import lesson6.PokerWithOOP.model.Gamer;
import lesson6.PokerWithOOP.service.CardService;
import lesson6.PokerWithOOP.service.CardServiceImpl;

import java.util.Arrays;
import java.util.Scanner;

public class PlayPoker {
    private static final int NUMBER_OF_PLAYERS = 4;
    private static final String[] cardNum = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    private static final String[] cardColor = {"diamonds", "spades", "clubs", "hearts"}; // бубна, піка, хреста, черва


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CardService cardService = new CardServiceImpl();
        Gamer[] gamersArray = new Gamer[NUMBER_OF_PLAYERS];


        for (int i = 0; i < NUMBER_OF_PLAYERS; i++) {
            int j = i;
            System.out.println("Input " + ++j);
            String s = scanner.nextLine();
            gamersArray[i] = new Gamer(s);
        }

        Card[] cards = cardService.generationCards(cardNum, cardColor);
        System.out.println("\n"
                + Arrays.toString(cards)
                + "\n");

        System.out.println("Gamer " + gamersArray[0].getName() + " : " + Arrays.toString(cardService.sorting(cards, 0)));
        System.out.println("Gamer " + gamersArray[1].getName() + " : " + Arrays.toString(cardService.sorting(cards, 1)));
        System.out.println("Gamer " + gamersArray[2].getName() + " : " + Arrays.toString(cardService.sorting(cards, 2)));
        System.out.println("Gamer " + gamersArray[3].getName() + " : " + Arrays.toString(cardService.sorting(cards, 3)));

    }

}
