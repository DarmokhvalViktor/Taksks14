package org.darmokhval.tasks14;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task11 {

    public static List<YearSchoolStat> getYearSchoolStat(List<Entrant> entrantList) {
        List<Integer> yearsOfEnteringList = entrantList.stream()
                .map(Entrant::getYearOfEntering)
                .distinct()
                .collect(Collectors.toList());

        return yearsOfEnteringList.stream()
                .map(n -> {
                    int numberOfSchools = (int) entrantList.stream()
                            .filter(i -> i.getYearOfEntering() == n)
                            .map(Entrant::getSchoolNumber)
                            .distinct()
                            .count();
                    return new YearSchoolStat(n, numberOfSchools);
                }).sorted(Comparator.comparing(YearSchoolStat::getNumberOfSchools).thenComparing(YearSchoolStat::getYearOfEntering))
                .collect(Collectors.toList());
    }

    public static List<YearSchoolStat> getYearSchoolStats(List<Entrant> entrantList) {
        return entrantList.stream().collect(Collectors.groupingBy(Entrant::getYearOfEntering))
                .entrySet()
                .stream().map(Task11::fromMap)
                .sorted(Comparator.comparing(YearSchoolStat::getNumberOfSchools)
                        .thenComparing(YearSchoolStat::getYearOfEntering))
                .collect(Collectors.toList());

    }

    private static YearSchoolStat fromMap(Map.Entry<Integer, List<Entrant>> entry) {
        return new YearSchoolStat(entry.getKey(), (int) countOfSchool(entry.getValue()));
    }

    private static long countOfSchool(List<Entrant> list) {
        return list.stream().map(Entrant::getSchoolNumber).distinct().count();
    }


    public static void main(String[] args) {
        List<Entrant> entrantList = new ArrayList<>();
        entrantList.add(new Entrant(1, 1993, "Ivanov"));
        entrantList.add(new Entrant(2, 1992, "Petrov"));
        entrantList.add(new Entrant(3, 1993, "Pupkin"));
        entrantList.add(new Entrant(3, 2000, "Zobkin"));
        entrantList.add(new Entrant(3, 2000, "Zabkin"));
        System.out.println(getYearSchoolStat(entrantList));
        System.out.println(getYearSchoolStats(entrantList));
    }
}
