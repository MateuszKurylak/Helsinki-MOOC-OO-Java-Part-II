
import java.util.HashMap;
import java.util.Map;

public class ShoppingBasket {

    private Map<String, Purchase> purchases;

    public ShoppingBasket() {
        this.purchases = new HashMap<String, Purchase>();
    }

    public void add(String product, int price) {
        int counter = 1;
        Purchase addProduct = new Purchase(product, counter, price);

        if (!purchases.containsKey(product)) {
            purchases.put(product, addProduct);
        } else {
            addProduct = purchases.get(product);
            addProduct.increaseAmount();
            purchases.put(product, addProduct);
        }
    }

    public int price() {
        int price = 0;
        for (Purchase thing : purchases.values()) {
            price += thing.price();
        }
        return price;
    }

    public void print() {
        for (String things : purchases.keySet()) {
            System.out.println(purchases.get(things));
        }
    }
}
