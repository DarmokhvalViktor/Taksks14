package org.darmokhval.tasks14;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Task12 {

//    static class NumberPair {
//        private int value1;
//        private int value2;
//
//        public int getValue1() {
//            return value1;
//        }
//        public int getValue2() {
//            return value2;
//        }
//        public void setValue1(int value1) {
//            this.value1 = value1;
//        }
//        public void setValue2(int value2) {
//            this.value2 = value2;
//        }
//
//        public NumberPair(int value1, int value2) {
//            this.value1 = value1;
//            this.value2 = value2;
//        }
//        @Override
//        public String toString() {
//            return "{NumberPair{" + value1 + ", " + value2 + "}";
//        }
//    }
    public static List<NumberPair> numberPairsFromTwoLists(List<Integer> intList1, List<Integer> intList2) {
        return intList1.stream().
                map(n -> {
                    int value1 = n % 10;
                    Integer value2 = intList2.stream().filter(k -> k % 10 == value1).findFirst().orElse(0);
                    return new NumberPair(value1, value2);
                }).filter(j -> j.getValue2() != 0).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> intList1 = new ArrayList<>();
        List<Integer> intList2 = new ArrayList<>();
        Collections.addAll(intList1, 1, 2, 33, 44);
        Collections.addAll(intList2, 11, 22, 13);
        System.out.println(intList1 + " " + intList2);
        System.out.println(numberPairsFromTwoLists(intList1, intList2)); // як прибрати квадратні дужки при виводі? []
    }
}
