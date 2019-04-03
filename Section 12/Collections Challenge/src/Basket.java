import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Basket {
    private final String name;
    private final Map<StockItem, Integer> basket;

    public Basket(String name) {
        this.name = name;
        this.basket = new TreeMap<>();
    }

    public int addToBasket(StockItem item, int quantity) {
        if (item != null && quantity > 0) {
            int inBasket = basket.getOrDefault(item, 0);
            basket.put(item, inBasket + quantity);
            return inBasket;
        }
        return 0;
    }

    public int removeFromBasket(StockItem item, int quantity) {
        if (item != null && quantity > 0) {
            int inBasket = basket.getOrDefault(item, 0);
            int newQuantity = inBasket - quantity;
            if (newQuantity > 0) {
                basket.put(item, newQuantity);
                return quantity;
            } else if (newQuantity == 0) {
                basket.remove(item);
                return quantity;
            }
        }
        return 0;
    }

    public void clearBasket() {
        this.basket.clear();
    }

    public Map<StockItem, Integer> Items() {
        return Collections.unmodifiableMap(basket);
    }

    @Override
    public String toString() {
        String s = "\nShopping basket " + name + " contains " + basket.size() + ((basket.size() == 1) ? " item" : " items") + "\n";
        double totalCost = 0.0;
        for (Map.Entry<StockItem, Integer> item : basket.entrySet()) {
            s = s + item.getKey() + ". " + item.getValue() + " purchased\n";
            totalCost += item.getKey().getPrice() * item.getValue();
        }
        return s + "Total cost " + totalCost;
    }
}
