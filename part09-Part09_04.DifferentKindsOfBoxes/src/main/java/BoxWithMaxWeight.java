import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {

    private int maxWeight;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity) {
        this.maxWeight = capacity;
        this.items = new ArrayList<>();
    }

    @Override
    public void add(Item item) {

        int totalWeight = 0;
        for (Item existingItem : items) {
            totalWeight += existingItem.getWeight();
        }

        if (item.getWeight() + totalWeight <= this.maxWeight) {
            this.items.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return this.items.contains(item);

    }

}
