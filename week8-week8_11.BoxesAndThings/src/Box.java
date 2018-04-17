
import java.util.ArrayList;
import java.util.List;

public class Box implements ToBeStored {

    private List<ToBeStored> thingsInBox = new ArrayList<ToBeStored>();
    private double maxWeight;

    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void add(ToBeStored things) {
        if (weight() + things.weight() <= maxWeight) {
            this.thingsInBox.add(things);
        }
    }

    public double weight() {
        double weight = 0;
        for (ToBeStored things : thingsInBox) {
            weight += things.weight();
        }
        return weight;
    }

    public String toString() {
        return "Box: " + thingsInBox.size() + " things, total weight " + weight() + " kg";
    }

}
