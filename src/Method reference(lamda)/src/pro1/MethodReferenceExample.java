package pro1;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceExample {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("John", "Mary", "Alice", "Bob");

        // Using lambda expression to call a method
        names.forEach((name) -> System.out.println(name.toUpperCase()));

        // Using method reference to call a method
        names.forEach(String::toUpperCase);
    }
}
