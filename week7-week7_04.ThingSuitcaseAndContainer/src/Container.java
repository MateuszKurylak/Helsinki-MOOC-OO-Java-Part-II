
import java.util.ArrayList;

public class Container {

    private ArrayList<Suitcase> suitcaseArr = new ArrayList<Suitcase>();
    private int maxWeightLimit;
    private int sumOfSuitcasesMaxWeight;

    public Container(int maxWeightLimit) {
        this.maxWeightLimit = maxWeightLimit;
    }

    public void addSuitcase(Suitcase suitcase) {
        this.sumOfSuitcasesMaxWeight += suitcase.totalWeight();
        if ((sumOfSuitcasesMaxWeight) <= maxWeightLimit) {
            suitcaseArr.add(suitcase);
        }
    }

    public String toString() {
        int totalWeight = 0;
        for (Suitcase suitcase : suitcaseArr) {
            totalWeight += suitcase.totalWeight();
        }
        return suitcaseArr.size() + " suitcases (" + totalWeight + " kg)";
    }

    public void printThings() {
        for (Suitcase list : suitcaseArr) {
            list.printThings();
        }
    }
}
