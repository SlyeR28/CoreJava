public class OrderItem {
    private final Product product;
    private final int quantiy;

    public OrderItem(Product product, int quantiy) {
        this.product = product;
        this.quantiy = quantiy;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantiy() {
        return quantiy;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "product=" + product +
                ", quantiy=" + quantiy +
                '}';
    }

}
