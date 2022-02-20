package FourthTask;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RandomAlgorithm{
    private static long a = 25214903917L;
    private static long c = 11;
    private static long m = (long) Math.pow(2,48);


    public static Stream<Long> randomNumber(long seed, long a, long c, long m) {
        return Stream.iterate(seed, x -> ((x * a + c) % m));
    }

    public static void main(String[] args) {
        List<Long> collect = randomNumber(1, a, c, m)
                .limit(3)
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}
