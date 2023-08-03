package app.task3;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class Main {

    public static Map<String, Integer> getWeek(){
        Map<String,Integer> week = new HashMap<>();
        week.put("Monday", 8);
        week.put("Tuesday", 9);
        week.put("Wensday", 10);
        week.put("Thursday", 11);
        week.put("Friday", 12);
        week.put("Saturday", 13);
        week.put("Sunday", 14);
        return week;
    }
    private static Stream<Map.Entry<String, Integer>> filterProducts(Stream<Map.Entry<String, Integer>> products) {
        return products.filter(day -> day.getValue() >= 10 && day.getValue() <= 13);
    }

    private static void getOutput(Stream<Map.Entry<String, Integer>> products) {
        AtomicInteger counter = new AtomicInteger(1);
        products.forEach(entry -> System.out.println(counter.getAndIncrement() + ") "
                + entry.getKey() + " -  +" + entry.getValue() + " *C" ));
    }

}
