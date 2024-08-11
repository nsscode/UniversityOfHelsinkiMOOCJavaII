import java.util.HashMap;

public class IOU {
    private HashMap<String, Double> debtdirectory;

    public IOU() {
        this.debtdirectory = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {
        this.debtdirectory.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        return this.debtdirectory.getOrDefault(toWhom, 0.0);
    }
}
