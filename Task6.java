package org.darmokhval.tasks14;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task6 {

    public static List<String> intWithStrings(List<Integer> intList, List<String> stringList) {
        Map<Integer, List<String>> listMap = stringList.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(listMap);

        return intList.stream()
                .map(listMap::get)
                .map(Task6::fromList)
                .collect(Collectors.toList());
    }
    private static String fromList(List<String> list) {
        if(list == null) {
            return "Not found";
        }
        else {
            return list.get(0);
        }
    }
    private static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n-1);
    }
    private static BigInteger bigFactorial(int number) {
        BigInteger factorial = BigInteger.ONE;
        for (int i = number; i > 0; i--) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 5, 3, 2, 10, 43, 5, 6, 7, 8, 9, 11, 32, 432, 13, 42);
        List<String> stringList = Arrays.asList("5SDFq", "5cccq", "vhrad", "4ceww2", "2j", "9iyyywqCqb", "3vcC", "CdsC");
        int K = 50;
        System.out.println(intWithStrings(integerList, stringList));
        System.out.println(factorial(13));
        System.out.println(bigFactorial(K));
    }
}
