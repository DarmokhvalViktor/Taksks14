package org.darmokhval.tasks14;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;

public class Task5 {

    public static List<String> sortedOddNumbers(List<Integer> integerList) {
        return integerList.stream()
                .filter(i -> i % 2 != 0)
                .sorted()
                .map(Object::toString) // map(String::valueOf)?
                .collect(Collectors.toList());
    }
    public static List<String> oddIntegersList(List<Integer> integerList) {
        return integerList.stream()
                .filter(n -> n % 2 != 0)
                .sorted()
                .map(String::valueOf) //n -> String.valueOf(n)
                .collect(Collectors.toList());
    }
    public static List<String> getSortedAscOddValues(List<Integer> intList) {
        return intList.stream().filter(Task5::isOdd)
                .sorted()
                .map(String::valueOf)
                .collect(Collectors.toList());
    }

    private static boolean isOdd(Integer value) {
        return value % 2 != 0;
    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(99, 1, 3, 2, 43, 5, 6, 7, 8, 9, 11, 32, 432, 13, 42);
        System.out.println(sortedOddNumbers(integerList));
        System.out.println(oddIntegersList(integerList));
        System.out.println(getSortedAscOddValues(integerList));
        JOptionPane.showMessageDialog(null, "Testing...");

    }
}
