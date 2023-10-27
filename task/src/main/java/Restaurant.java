import java.util.Map;

public class Restaurant {
    public Map<Integer, Waiter> waiters;

    public Map<Integer, Product> products;

    public Map<Integer, Table> tables;

    public Map<Long, Order> orders;

    public Restaurant(){}

    public Restaurant(Map<Integer, Waiter> waiters, Map<Integer, Product> products,
                      Map<Integer, Table> tables, Map<Long, Order> orders) {
        this.waiters = waiters;
        this.products = products;
        this.tables = tables;
        this.orders = orders;
    }

    public Map<Integer, Waiter> getWaiters(){
        return waiters;
    }

    public Map<Integer, Table> getTables(){
        return tables;
    }

    public Map<Integer, Product> getProducts() {
        return products;
    }

    public Map<Long, Order> getOrders() {
        return orders;
    }
}