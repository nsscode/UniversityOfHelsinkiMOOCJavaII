import java.util.ArrayList;
import java.util.HashMap;


public class VehicleRegistry {
    
    private HashMap<LicensePlate, String> registry;


    public VehicleRegistry() {
        this.registry = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {

        // Check if the plate is already in the registry
        if (this.registry.containsKey(licensePlate)) {
            return false; // If it contains the plate it already has an owner
        }

        // If not, add the plate and owner to the registry
        this.registry.put(licensePlate, owner);
        return true; // Successfully added 

    }

    public String get(LicensePlate licensePlate) {
        if (!(this.registry.containsKey(licensePlate))) {
            return null;
        }

        return this.registry.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate) {
        if (!(this.registry.containsKey(licensePlate))) {
            return false;
        }

        this.registry.remove(licensePlate);
        return true;
    }

    public void printLicensePlates() {
        for (LicensePlate plate : registry.keySet()) {
            System.out.println(plate);
        }
    }

    public void printOwners() {
        ArrayList<String> printed = new ArrayList<>();

        for (String owner : registry.values()) {
            if (printed.contains(owner)) {
                continue;
            }

            System.out.println(owner);
            printed.add(owner);
        }
    }
}
