import java.util.Map;

public class Main {
    private static StockList stockList = new StockList();

    public static void main(String[] args) {
        /*
        Modify the program so that adding items to the shopping basket doesn't
        actually reduce the stock count but, instead, reserves the requested
        number of items.

        You will need to add a "reserved" field to the StockItem class to store the
        number of items reserved.

        Items can continue to be added to the basket, but it should not be possible to
        reserveStock more than the available stock of any item. An item's available stock
        is the stock count less the reserved amount.

        The stock count for each item is reduced when a basket is checked out, at which
        point all reserved items in the basket have their actual stock count reduced.

        Once checkout is complete, the contents of the basket are cleared.

        It should also be possible to "unreserve" items that were added to the basket
        by mistake.

        The program should prevent any attempt to unreserve more items than were
        reserved for a basket.

        Add code to Main that will unreserve items after they have been added to the basket,
        as well as unreserving items that have not been added to make sure that the code
        can cope with invalid requests like that.

        After checking out the baskets, display the full stock list and the contents of each
        basket that you created.
        */
        StockItem temp = new StockItem("milk", 1.26, 272);
        stockList.addStock(temp);

        temp = new StockItem("bread", 3.15, 323);
        stockList.addStock(temp);

        temp = new StockItem("rice", 2.58, 472);
        stockList.addStock(temp);

        temp = new StockItem("eggs", 4.91, 250);
        stockList.addStock(temp);

        temp = new StockItem("cheese", 14.01, 357);
        stockList.addStock(temp);

        temp = new StockItem("chicken", 15.97, 125);
        stockList.addStock(temp);

        temp = new StockItem("beef", 21.19, 128);
        stockList.addStock(temp);

        temp = new StockItem("apple", 2.15, 369);
        stockList.addStock(temp);

        temp = new StockItem("banana", 1.93, 246);
        stockList.addStock(temp);

        temp = new StockItem("orange", 2.38, 229);
        stockList.addStock(temp);

        temp = new StockItem("tomato", 3.38, 364);
        stockList.addStock(temp);

        temp = new StockItem("potato", 2.05, 245);
        stockList.addStock(temp);

        temp = new StockItem("onion", 1.24, 212);
        stockList.addStock(temp);

        temp = new StockItem("lettuce", 2.22, 237);
        stockList.addStock(temp);

        System.out.println(stockList);

        Basket elvarsBasket = new Basket("Elvar");
        sellItem(elvarsBasket, "eggs", 125);
        System.out.println(elvarsBasket);

        sellItem(elvarsBasket, "eggs", 125);
        System.out.println(elvarsBasket);
        System.out.println();

        if (sellItem(elvarsBasket, "eggs", 1) != 1) {
            System.out.println("There are no more eggs in stock");
        }

        sellItem(elvarsBasket, "bacon", 50);
        sellItem(elvarsBasket, "banana", 100);
        sellItem(elvarsBasket, "orange", 150);
        sellItem(elvarsBasket, "cheese", 200);

        Basket basket = new Basket("Bob");
        sellItem(basket, "chicken", 100);
        sellItem(basket, "milk", 100);
        sellItem(basket, "bread", 100);
        removeItem(basket, "chicken", 100);
        System.out.println(basket);

        removeItem(elvarsBasket, "chicken", 100);
        removeItem(elvarsBasket, "potato", 100);
        removeItem(elvarsBasket, "chicken", 25);
        System.out.println();
        System.out.println("chicken removed: " + removeItem(elvarsBasket, "chicken", 10));

        System.out.println(elvarsBasket);
        removeItem(elvarsBasket, "apple", 1);
        removeItem(elvarsBasket, "milk", 3);
        removeItem(elvarsBasket, "onion", 4);
        removeItem(elvarsBasket, "lettuce", 3);
        System.out.println(elvarsBasket);

        System.out.println("\nDisplay stock list before and after checkout");
        System.out.println(basket);
        System.out.println();

        System.out.println(stockList);
        checkOut(basket);

        System.out.println(basket);
        System.out.println();
        System.out.println(stockList);

        checkOut(elvarsBasket);
        System.out.println(elvarsBasket);
    }

    public static int sellItem(Basket basket, String item, int quantity) {
        StockItem stockItem = stockList.get(item);
        if (stockItem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }
        if (stockList.reserveStock(item, quantity) != 0) {
            return basket.addToBasket(stockItem, quantity);
        }
        return 0;
    }

    public static int removeItem(Basket basket, String item, int quantity) {
        StockItem stockItem = stockList.get(item);
        if (stockItem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }
        if (basket.removeFromBasket(stockItem, quantity) == quantity) {
            return stockList.unreserveStock(item, quantity);
        }
        return 0;
    }

    public static void checkOut(Basket basket) {
        for (Map.Entry<StockItem, Integer> item : basket.Items().entrySet()) {
            stockList.sellStock(item.getKey().getName(), item.getValue());
        }
        basket.clearBasket();
    }
}
