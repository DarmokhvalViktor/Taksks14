package org.darmokhval.tasks14;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Task4 {

    public static List<String> stringWithSpecifiedLengthAndEndsWithDigit(int integer, List<String> stringList) {
        return stringList.stream()
                .filter(n -> n.length() == integer && Character.isDigit(n.charAt(n.length()-1)))
                .sorted()
                .collect(Collectors.toList());
    }
////////////////////////////////////////////////////////////////////////
    public static List<String> filterAndSortByLastDigit(int number, List<String> stringList) {
        return stringList.stream()
                .filter(filterString(number))
                .filter(Task4::validator)
                .sorted()
                .collect(Collectors.toList());
    }

    private static Predicate<String> filterString(int number) {
        return str -> str.length() == number;
    }

    private static boolean validator(String str) {
        char data = str.charAt(str.length() - 1);
        return validateNumber(String.valueOf(data));
    }

    private static boolean validateNumber(String data) {
        try {
            Integer.valueOf(data);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("8DC3", "4F", "B", "3S", "S3", "A1", "2A3G", "1B", "J7", "3SV");
        int K = 2;
        System.out.println(stringWithSpecifiedLengthAndEndsWithDigit(K, stringList));
        System.out.println(filterAndSortByLastDigit(K, stringList));
    }
}
