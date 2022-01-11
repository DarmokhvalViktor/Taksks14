package org.darmokhval.tasks14;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Map; //
import java.util.function.Function; //

public class Task10 {

    public static List<String> lastCharOfString(List<String> stringList) {
        Comparator<String> compByLength = (string1, string2) -> string2.length() - string1.length();
        return stringList.stream()
                .sorted(compByLength)
                .map(n -> String.valueOf(n.charAt(n.length()-1)).toUpperCase())
                .collect(Collectors.toList());
    }

    public static List<String> getSortedLastLettersInUpperCase(List<String> stringList) {
        return stringList.stream().collect(Collectors.toMap(Function.identity(), String::length))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .map(u -> u.getKey().substring(u.getKey().length() - 1))
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }


    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("asnsbiu", "asdsad", "asnsb", "asdf", "asdfb", "as", "a", "aop");
        System.out.println(lastCharOfString(stringList));
        System.out.println(getSortedLastLettersInUpperCase(stringList));
    }
}
