
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import static java.util.Collections.list;
import java.util.List;

public class Participants implements Comparable<Participants> {

    Points points = new Points();

    private String name;
    private int length;
    private List<Integer> votes = new ArrayList<Integer>();
    private List<Integer> savedJumpLengths = new ArrayList<Integer>();
    private int totalScore;

    Participants(String name) {
        this.name = name;
    }

    public String getEveryJumpLength() {
        StringBuilder sb = new StringBuilder();
        for (Integer value : savedJumpLengths) {
            sb.append(value).append(" m, ");
        }
        return sb.toString().substring(0, sb.length() - 2);
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void nextJump() {
        votes.removeAll(votes);
        votes = points.votes();
        this.length = points.length();
        savedJumpLengths.add(this.length);

        int votesSum = 0;
        for (Integer vote : votes) {
            votesSum += vote;
        }
        int min = 0;
        int max = 0;
        this.totalScore += this.length + votesSum - (Collections.max(votes) + Collections.min(votes));
    }

    public String roundRecords() {
        StringBuilder sb = new StringBuilder();
        sb.append("  ").append(name).append(System.getProperty("line.separator"))
        .append("    ").append("length: ").append(length).append(System.getProperty("line.separator"))
        .append("    ").append("judge votes: ").append(votes);

        return sb.toString();
    }

    @Override
    public String toString() {
        return this.name + " (" + this.totalScore + " points)";
    }

    @Override
    public int compareTo(Participants t) {
        if (this.totalScore == t.getTotalScore()) {
            return 0;
        } else if (this.totalScore > t.getTotalScore()) {
            return 1;
        } else {
            return -1;
        }
    }
}
