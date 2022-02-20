package SecondTask;

import java.util.List;
import java.util.stream.Collectors;

public class SortingList {
    public static List<String> sortingMethod(List<String> values){
        List<String> collect = values.stream()
                .map((value) -> value.toUpperCase())
                .sorted()
                .collect(Collectors.toList());
        return collect;
    }

    public static void main(String[] args) {
        List<String> names = List.of("Kirill","Artem","Dimon","Hypix","Flexiks");
        System.out.println(sortingMethod(names));
    }
}
