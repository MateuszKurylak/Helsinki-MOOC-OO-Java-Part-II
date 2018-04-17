
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hand implements Comparable<Hand> {
    
    private List<Card> cardList = new ArrayList<Card>();
    
    public void add(Card card) {
        cardList.add(card);
    }
    
    public void print() {
        for (Card card : cardList) {
            System.out.println(card);
        }
    }
    
    public void sort() {
        Collections.sort(cardList);
    }
    
    public int sumOfCards() {
        int sum = 0;
        for (Card card : cardList) {
            sum += card.getValue();
        }
        return sum;
    }
    
    @Override
    public int compareTo(Hand hand) {
        if (sumOfCards() == hand.sumOfCards()) {
            return 0;
        } else if (sumOfCards() > hand.sumOfCards()) {
            return 1;
        } else {
            return -1;
        }
    }
    
    public void sortAgainstSuit() {
        Collections.sort(cardList, new SortAgainstSuitAndValue());
    }
}
