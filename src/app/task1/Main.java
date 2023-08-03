package app.task1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

   public static List<String> listOfNames() {
        return Arrays.asList("Alice", "Bob", "Charlie", "Daniel", "Eva", "Frank", "Gina", "Hanna", "Alex","Arina");
    }
    private static Stream<String> filterNames(Stream<String> names, char targetLetter) {
        return names.filter(name -> name.startsWith(String.valueOf(targetLetter)));
    }
}
