
import java.util.ArrayList;

public class Suitcase {

    private int maxWeightLimit;
    private ArrayList<Thing> things = new ArrayList<Thing>();

    public Suitcase(int maxWeightLimit) {
        this.maxWeightLimit = maxWeightLimit;
    }

    public void addThing(Thing thing) {
        int initialWeight = totalWeight();
        int a = initialWeight + thing.getWeight();
        if (this.maxWeightLimit >= a) {
            things.add(thing);
            initialWeight = totalWeight();
        }
    }

    public String toString() {
        if (things.size() == 0) {
            return "empty (" + totalWeight() + " kg)";
        }
        if (things.size() == 1) {
            return things.size() + " thing " + "(" + totalWeight() + " kg)";
        }
        if (things.size() > 1) {
            return things.size() + " things " + "(" + totalWeight() + " kg)";
        }
        return null;
    }

    public void printThings() {
        for (Thing thing : things) {
            System.out.println(thing);
        }
    }

    public int totalWeight() {
        int weight = 0;
        for (Thing thing : things) {
            weight += thing.getWeight();
        }
        return weight;
    }

    public Thing heaviestThing() {
        int valueOne;
        int valueTwo = 0;
        if (things.size() != 0) {

            for (Thing thing : things) {
                valueOne = thing.getWeight();
                System.out.println(thing.getWeight());
                if (valueOne > valueTwo) {
                    valueTwo = valueOne;
                    System.out.println("valueone = " + valueOne + "    valueTwo = " + valueTwo);
                }
            }
            for (Thing thing : things) {
                if (thing.getWeight() == valueTwo) {
                    return thing;
                }
            }
        }
        return null;
    }
}
