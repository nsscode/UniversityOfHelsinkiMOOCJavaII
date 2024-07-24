public class Container {
    private int amountContainer;

    public Container() {
        this.amountContainer = 0;
    }

    public int contains() {
        return amountContainer;
    }

    public void add (int amount) {
        if (amount < 0) {
            return;
        }

        amountContainer = amountContainer + amount;

        if (amountContainer > 100) {
            amountContainer = 100;
        }
    }


    public void remove (int amount) {
        if (amount < 0) {
            return;
        }

        amountContainer = amountContainer - amount;

        if (amountContainer < 0) {
            amountContainer = 0;
        }
    }

    public String toString() {
        return amountContainer + "/100";
    }

}
