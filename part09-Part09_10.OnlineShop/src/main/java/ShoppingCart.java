import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

    private Map<String, Item> shoppingCart;

    public ShoppingCart() {
        this.shoppingCart = new HashMap<String, Item>();
    }

    public void add(String product, int price) {

        this.shoppingCart.putIfAbsent(product, new Item(product, 0, price));
        this.shoppingCart.get(product).increaseQuantity();
    }

    public int price() {
        int sum = 0;

        for (Item item : shoppingCart.values()) {
            sum += item.price();
        }

        return sum;
    }

    public void print() {
        for (Item item : shoppingCart.values()) {
            System.out.println(item);
        }
    }
    
}
