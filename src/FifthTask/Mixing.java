package FifthTask;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Mixing {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        List<T> ts = first.toList();
        List<T> ts1 = second.toList();

        int minLength = Math.min(ts.size(), ts1.size());

        List<T> result = new ArrayList<>();

        for (int i = 0; i < minLength; i++) {
            result.add(ts.get(i));
            result.add(ts1.get(i));
        }

        return result.stream();
    }

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        a.add(1);
        a.add(3);
        a.add(5);
        a.add(7);
        a.add(9);

        b.add(0);
        b.add(2);
        b.add(4);
        b.add(6);

        Stream<Integer> zip = zip(a.stream(), b.stream());
        List<Integer> integers = zip.toList();
        System.out.println(integers);
    }
}
