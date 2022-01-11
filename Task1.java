package org.darmokhval.tasks14;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Task1 {

    public static List<String> startsEndsWithChar(char character, List<String> stringList) {
        return stringList.stream()
                .filter(n -> n.charAt(0) == character && n.charAt(n.length()-1) == character && n.length() > 1)
                .collect(Collectors.toList());
    }
    //////////////////////////////////////////////////////////////////

    public static List<String> filterByFirstAndLastCharacter (char character, List<String> stringList) {
        return stringList.stream()
                .filter(Task1::stringLength)
                .filter(validate(character))
                .collect(Collectors.toList());
    }

    private static boolean stringLength(String str) {
        return str.length() > 1;
    }

    private static Predicate<String> validate(char character) {
        return string -> {
            char first = string.charAt(0);
            char last = string.charAt(string.length()-1);
            return first == character && last == character;
        };
    }

    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("cccc", "chrad", "cerwuc", "jjja", "cyyywqCc", "ccC", "CdsC");
        char character = 'c';
        char character2 = 'a';
        List<String> stringList2 = Arrays.asList("Hello", "qwerty", "asda", "asdfa", "as", "a");
        System.out.println(filterByFirstAndLastCharacter(character, stringList));
        System.out.println(startsEndsWithChar(character2, stringList2));
    }
}
