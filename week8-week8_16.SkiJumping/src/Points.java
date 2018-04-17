
import java.util.ArrayList;

public class Points {

    private ArrayList<Integer> vote = new ArrayList<Integer>();

    public ArrayList votes() {
        for (int i = 0; i < 5; i++) {
            int rand = 10 + (int) (Math.random() * ((20 - 10) + 1));
            this.vote.add(rand);
        }
        return vote;
    }
    
    public int length() {
        int rand = 60 + (int) (Math.random() * ((120 - 60) + 1));
        return rand;
    }
}
