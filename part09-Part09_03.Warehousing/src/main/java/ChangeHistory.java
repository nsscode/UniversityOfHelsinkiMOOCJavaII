import java.util.ArrayList;

public class ChangeHistory {

    private ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }

    public void add(double status) {
        history.add(status);
    }

    public void clear() {
        history.clear();
    }

    public String toString() {
        return history.toString();
    }

    public double maxValue() {
        if (history.isEmpty()) {
            return 0;
        }

        double largestValue = history.get(0);

        for (int index = 0; index < history.size(); index++) {
            double currentValue = history.get(index);

            if (currentValue > largestValue) {
                largestValue = currentValue;
            }
        }

        return largestValue;
    }

    public double minValue() {
        if (history.isEmpty()) {
            return 0;
        }

        double smallestValue = history.get(0);

        for (int index = 0; index < history.size(); index++) {
            double currentValue = history.get(index);

            if (currentValue < smallestValue) {
                smallestValue = currentValue;
            }
        }

        return smallestValue;
    }

    public double average() {
        if (history.isEmpty()) {
            return 0;
        }

        double total = 0;

        for (Double value : history) {
            total += value;
        }

        double average = total / history.size();
        return average;

    }
}
