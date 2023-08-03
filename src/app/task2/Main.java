package app.task2;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;
public class Main {
    public static void main(String[] args) {

        getOutput(filterProducts(getProducts().entrySet().stream()));
    }
    public static Map<String, Double> getProducts() {
        Map<String, Double> products = new HashMap<>();
        products.put("Tomato", 2.50);
        products.put("Pepsi", 1.05);
        products.put("Cheese", 3.00);
        products.put("Eggs", 2.00);
        products.put("Cucumber", 2.75);
        products.put("Onion", 3.15);
        return products;
    }

    public static Stream<Map.Entry<String, Double>> filterProducts(Stream<Map.Entry<String, Double>> products) {
        return products.filter(entry -> entry.getValue() <= 2.00);
    }
    private static void getOutput(Stream<Map.Entry<String, Double>> products) {
        AtomicInteger counter = new AtomicInteger(1);
        products.forEach(entry -> System.out.println(counter.getAndIncrement() + ") "
                + entry.getKey() + " - $ " + entry.getValue()));
    }

}