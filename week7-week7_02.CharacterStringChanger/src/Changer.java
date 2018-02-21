
import java.util.*;

public class Changer {

    ArrayList<Change> changes = new ArrayList<Change>();

    public void addChange(Change change) {
        changes.add(change);
    }

    public String change(String characterString) {
        for (Change changed : changes) {
            characterString = changed.change(characterString);
        }
        return characterString;
    }
}
