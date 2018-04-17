
public class MilitaryService implements NationalService {

    private int daysLeft;

    @Override
    public int getDaysLeft() {
        return this.daysLeft;
    }

    @Override
    public void work() {
        if (daysLeft >= 1) {
            this.daysLeft -= 1;
        }
    }

    public MilitaryService(int daysLeft) {
        this.daysLeft = daysLeft;
    }

}
