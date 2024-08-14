import java.util.HashMap;
import java.util.ArrayList;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> storageMap;

    public StorageFacility() {
        this.storageMap = new HashMap<>();
    }

    public void add(String unit, String item) {
        this.storageMap.putIfAbsent(unit, new ArrayList<>());

        ArrayList<String> itemList = this.storageMap.get(unit);
        itemList.add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        return this.storageMap.getOrDefault(storageUnit, new ArrayList<>());
    }

    public void remove(String storageUnit, String item) {
        ArrayList<String> items = storageMap.get(storageUnit);

        if (!(items.isEmpty())) {
            items.remove(item);

            if (items.isEmpty()) {
                storageMap.remove(storageUnit);
            }
        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> unitList = new ArrayList<>();

        for (String name : storageMap.keySet()) {
            if (unitList.contains(name)) {
                continue;
            }
            
            unitList.add(name);
        }

        return unitList;
    }
    
}
