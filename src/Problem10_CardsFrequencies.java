import java.util.LinkedHashMap;
import java.util.Scanner;

public class Problem10_CardsFrequencies {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] inputCards = console.nextLine().split("[^0-9JQKA]+");
        LinkedHashMap<String, Integer> cardsCount = new LinkedHashMap<>();

        for (String card : inputCards) {
            if (cardsCount.keySet().contains(card)) {
                int counter = cardsCount.get(card) + 1;
                cardsCount.put(card, counter);
            } else {
                cardsCount.put(card, 1);
            }
        }

        int totalCardsCount = inputCards.length;

        for (String card : cardsCount.keySet()) {
            double cardFrequency = 100d * cardsCount.get(card) / (double) totalCardsCount;
            System.out.printf("%s -> %.2f%%\r\n", card, cardFrequency);
        }
    }
}
