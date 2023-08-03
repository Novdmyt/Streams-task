package app.task3;

import java.util.HashMap;
import java.util.Map;

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
}
