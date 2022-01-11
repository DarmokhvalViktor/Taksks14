package org.darmokhval.tasks14;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {

    public static List<String> firstAndLastChar(List<String> stringList) {
        return stringList.stream()
                //.map(n -> String.valueOf(n.charAt(0)) + String.valueOf(n.charAt(n.length() -1)))
                .map(n -> {
                    char first = n.charAt(0);
                    char last = n.charAt(n.length() - 1);
                    return first + "" + last;
                } )
                .collect(Collectors.toList());
    }

    public static List<String> firstAndLastCharacter (List<String> stringList) {
        return stringList.stream()
                .map(Task3::returnFirstAndLastChar)
                .collect(Collectors.toList());
    }

    private static String returnFirstAndLastChar(String string) {
        return String.valueOf(string.charAt(0)) + string.charAt(string.length()-1);
    }
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("cccq", "vhrad", "ceww2", "j", "iyyywqCqb", "vcC", "CdsC");
        System.out.println(firstAndLastCharacter(stringList));
        List<String> stringList2 = Arrays.asList("asd", "a", "basdw");
        System.out.println(firstAndLastChar(stringList2));
    }
}
