package FirstTask;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class OddNamesFilter {
    public static String namesMethod(List<String> names){
        AtomicInteger i = new AtomicInteger(1);
        List<String> collect = names.stream()
                .map((name) -> i.getAndIncrement() + ". " + name)
                .filter((name) -> i.get() % 2 == 0).toList();
        return String.valueOf(collect);
    }

    public static void main(String[] args) {
        List<String> names = List.of("Kirill","Artem","Dimon","Hypix","Flexiks");
        System.out.println(namesMethod(names));
    }
}
