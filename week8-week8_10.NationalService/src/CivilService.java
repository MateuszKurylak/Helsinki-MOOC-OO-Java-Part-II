
public class CivilService implements NationalService {

    private int workingdays = 362;

    @Override
    public int getDaysLeft() {
        return workingdays;
    }

    @Override
    public void work() {
        if (workingdays >= 1) {
            this.workingdays -= 1;
        }
    }

}
