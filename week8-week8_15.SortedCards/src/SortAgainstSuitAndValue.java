
import java.util.Comparator;

public class SortAgainstSuitAndValue implements Comparator<Card> {

    @Override
    public int compare(Card card1, Card card2) {
        int suit = card1.getSuit() - card2.getSuit();
        if (suit == 0) {
            return card1.compareTo(card2);
        }
        return suit;
    }
}
