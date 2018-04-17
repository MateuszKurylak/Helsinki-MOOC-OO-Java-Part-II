
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class VehicleRegister {

    private HashMap<RegistrationPlate, String> owners;

    public VehicleRegister() {
        this.owners = new HashMap<RegistrationPlate, String>();
    }

    public boolean add(RegistrationPlate plate, String owner) {
        if (!owners.containsKey(plate)) {
            owners.put(plate, owner);
            return true;
        }
        return false;
    }

    public String get(RegistrationPlate plate) {
        if (owners.containsKey(plate)) {
            return owners.get(plate);
        }
        return null;
    }

    public boolean delete(RegistrationPlate plate) {
        if (owners.containsKey(plate)) {
            owners.remove(plate);
            return true;
        }
        return false;
    }

    public void printRegistrationPlates() {
        for (RegistrationPlate all : owners.keySet()) {
            System.out.println(all);
        }
    }

    public void printOwners() {
        List<String> names = new ArrayList<String>();
        for (String all : owners.values()) {
            if (!names.contains(all)) {
                names.add(all);
            }
        }
        for (String name : names) {
            System.out.println(name);
        }
    }
}
