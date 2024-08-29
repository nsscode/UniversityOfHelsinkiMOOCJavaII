import java.util.ArrayList;

public class Box implements Packable {

    private ArrayList<Packable> box;
    private double maxCapacity;

    public Box(double maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.box = new ArrayList<>();
    }

    public void add(Packable packable) {
       if (this.weight() + packable.weight() <= maxCapacity) {
        box.add(packable);
       }
    }

    public double weight() {
        double totalWeight = 0;

        for (Packable packable : box) {
            totalWeight += packable.weight();
        }
        return totalWeight;
    }

    @Override 
    public String toString() {
        return "Box: " + box.size() + " items, total weight " + this.weight() + " kg";
    }

}
