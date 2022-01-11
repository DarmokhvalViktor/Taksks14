package org.darmokhval.tasks14;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task9 {

    //not quite desirable result
//    public static List<String> fff(List<String> strList){
//        return strList.stream()
//                .map(n-> {
//                    char character = n.charAt(0);
//                    int length = n.length();
//                    return length + "-" + character;
//                })
//                .collect(Collectors.toList());
//    }

    public static List<String> stringLengthWithFirtsLetter(List<String> stringList) {
        return stringList.stream()
                .collect(Collectors.groupingBy(n -> String.valueOf(n.charAt(0))))
                .entrySet()
                .stream()
                .map(n -> value(n.getValue()) + "-" + n.getKey())
                .sorted(Comparator.reverseOrder()) //not working
                .collect(Collectors.toList());
    }
    private static Integer value(List<String> list) {
        return list.stream().map(String::length).reduce(0, Integer::sum);
    }

    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("YEER", "ZARBV", "VKIO", "BNMH", "QQ", "QQ","VEVTGF", "FAC", "VCC");
        System.out.println(stringLengthWithFirtsLetter(stringList));
    }
}
