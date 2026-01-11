import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class mainnn {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", "Electronics", 55000);
        Product p2 = new Product("Headphones", "Electronics", 2000);
        Product p3 = new Product("Shoes", "Fashion", 3000);
        Product p4 = new Product("T-shirt", "Fashion", 1500);
        Product p5 = new Product("Watch", "Accessories", 5000);

        List<Order> orders = Arrays.asList(
                new Order(1, Arrays.asList(
                        new OrderItem(p1, 1),
                        new OrderItem(p2, 2)
                )),
                new Order(2, Arrays.asList(
                        new OrderItem(p3, 3),
                        new OrderItem(p4, 2),
                        new OrderItem(p2, 1)
                )),
                new Order(3, Arrays.asList(
                        new OrderItem(p5, 2),
                        new OrderItem(p3, 1)
                ))
        );


        double sum = orders.stream().flatMap(order -> order.getItems().stream())
                .mapToDouble(item -> item.getProduct().getPrice() * item.getQuantiy())
                .sum();
        System.out.println("Total Revenue " +sum);

        List<String> collect = orders.stream()
                .flatMap(o -> o.getItems().stream())
                .collect(Collectors.groupingBy(
                        item -> item.getProduct().getName(),
                        Collectors.summingInt(OrderItem::getQuantiy)
                ))
                .entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .limit(3)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println(collect);

        // average order value
        double v = orders.stream()
                .mapToDouble(order -> order.getItems().stream()
                        .mapToDouble(item -> item.getProduct().getPrice() * item.getQuantiy()).sum())
                .average().orElse(0);
        System.out.println(v);

        Map<String, Double> collect1 = orders.stream()
                .flatMap(o -> o.getItems().stream())
                .collect(Collectors.groupingBy(item -> item.getProduct().getCategory(),
                        Collectors.summingDouble(i -> i.getProduct().getPrice() * i.getQuantiy())));

        System.out.println(collect1);

        List<Product> collect2 = orders.stream()
                .flatMap(order -> order.getItems().stream())
                .map(OrderItem::getProduct)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(collect2);


    }
}
