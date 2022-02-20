package ThirdTask;

import java.util.*;

public class SortingArray {

    public static String sorting(String[] array){
        List<String> collect = Arrays.stream(array)
                .flatMap((value) -> Arrays.stream(value.split(",")))
                .map(String::trim)
                .sorted().toList();
        return String.valueOf(collect);
    }


    public static void main(String[] args) {
        String[] array = {"1, 2, 0", "4, 5"};
        System.out.println(sorting(array));
    }
}
