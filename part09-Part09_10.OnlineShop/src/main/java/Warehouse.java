import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Warehouse {
    private Map<String, Integer> prices;
    private Map<String, Integer> quantities;

    public Warehouse() {
        this.prices = new HashMap<String, Integer>();
        this.quantities = new HashMap<String, Integer>();
    }

    public void addProduct(String product, int price, int stock) {
       this.prices.put(product, price);
       this.quantities.put(product, stock);
    }

    public int price(String product) {
        return this.prices.getOrDefault(product, -99);
    }

    public int stock(String product) {
        return this.quantities.getOrDefault(product, 0);
    }

    public boolean take(String product) {
        if (quantities.containsKey(product) && quantities.get(product) > 0) {
            int updatedStock = quantities.get(product) - 1;
            quantities.put(product, updatedStock);
            return true;
        }

        return false;
    }

    public Set<String> products() {
        return this.prices.keySet();
        
    }




}
