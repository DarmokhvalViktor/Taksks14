package org.darmokhval.tasks14;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task7 {

//    Not working properly:
//    if there is the same number more than once, it will be skipped as well:
//    for example, if we add 9, result will be: 7, 4, 2, not 9, 9, 7, 4, 2.

    public static List<Integer> getSortedDifferenceBetweenSubsets(int number, List<Integer> integerList) {

        Stream<Integer> skipElements = integerList.stream().skip(number);
        Stream<Integer> list = integerList.stream().filter(f -> f % 2 == 0);

        return Stream.concat(skipElements, list).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream().filter(f -> f.getValue() == 1)
                .map(Map.Entry::getKey).sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        int K = 5;
        System.out.println(getSortedDifferenceBetweenSubsets(K, integerList));

    }
}
