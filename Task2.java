package org.darmokhval.tasks14;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {

    public static List<Integer> sortedByLength(List<String> stringList) {
        return stringList.stream()
                .map(String::length)
                .sorted()
                .collect(Collectors.toList());
    }

    public static List<Integer> sortedByIndexLength(List<String> stringList) {
        return stringList.stream()
                .map(String::length)
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("cccc", "chrad", "cec", "j", "cyyywqCc", "ccC", "CdsC");
        System.out.println(sortedByIndexLength(stringList));
        List<String> stringList2 = Arrays.asList("Hello", "world", "!", "Good", "morning", "!");
        System.out.println(sortedByLength(stringList2));
    }
}
