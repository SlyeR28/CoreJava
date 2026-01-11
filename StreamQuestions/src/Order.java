import java.util.List;

public class Order {
    private final int orderId;
    private final List<OrderItem> items;

    public Order(int orderId, List<OrderItem> items) {
        this.orderId = orderId;
        this.items = items;
    }

    public int getOrderId() {
        return orderId;
    }

    public List<OrderItem> getItems() {
        return items;
    }
}
