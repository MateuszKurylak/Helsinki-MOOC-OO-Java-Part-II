
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Storehouse {

    private Map<String, Integer> storedItemsPrice = new HashMap<String, Integer>();
    private Map<String, Integer> storedItemsStock = new HashMap<String, Integer>();

    public void addProduct(String product, int price, int stock) {
        storedItemsPrice.put(product, price);
        storedItemsStock.put(product, stock);
    }

    public int price(String product) {
        if (storedItemsPrice.containsKey(product)) {
            return storedItemsPrice.get(product);
        }
        return -99;
    }

    public int stock(String product) {
        if (storedItemsPrice.containsKey(product)) {
            return storedItemsStock.get(product);
        }
        return 0;
    }

    public boolean take(String product) {
        int helper = stock(product);
        if (helper > 0) {
            helper--;
            storedItemsStock.put(product, storedItemsStock.get(product) - 1);
            return true;
        }
        return false;
    }

    public Set<String> products() {
        return storedItemsPrice.keySet();
    }
}
