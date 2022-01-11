package org.darmokhval.tasks14;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task8 {

    public static List<Integer> unionOfTwoSubsets(int intK, int intD, List<Integer> integerList) {
        Stream<Integer> greaterThan = integerList.stream().filter(n->n > intD);
        Stream<Integer> skipElements = integerList.stream().skip(intK);
        return Stream.concat(greaterThan, skipElements)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }

    public static List<Integer> getSortedUnionTwoSubsetsIntegers(int d, int k, List<Integer> intList) {
        Stream<Integer> integerStream = intList.stream().filter(f -> f > d);
        Stream<Integer> skip = intList.stream().skip(k + 1L);
        return Stream.concat(integerStream, skip)
                .collect(Collectors.toSet())
                .stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }


    public static void main(String[] args) {
        int K = 4;
        int D = 3;
        List<Integer> integerList = Arrays.asList(3, 1, 5, 3, 2, 10);
        System.out.println(unionOfTwoSubsets(K, D, integerList));
        System.out.println(getSortedUnionTwoSubsetsIntegers(K, D, integerList));

    }
}
