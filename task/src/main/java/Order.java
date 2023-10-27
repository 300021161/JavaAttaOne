public class Order {

    private int amount;

    private int table;

    private int waiter;

    private long visitor;

    public Order(){}
    public Order(int amount, int table, int waiter, long visitor) {
        this.amount = amount;
        this.table = table;
        this.waiter = waiter;
        this.visitor = visitor;
    }

    public int getAmount() {
        return amount;
    }

    public int getTable() {
        return table;
    }

    public int getWaiter() {
        return waiter;
    }

    public long getVisitor(){
        return visitor;
    }
}
