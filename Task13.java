package org.darmokhval.tasks14;

import java.util.*;
import java.util.stream.Collectors;

public class Task13 {

    public static List<YearSchoolStat> getData(List<Integer> yearList, List<Entrant> nameList) {
        Comparator<YearSchoolStat> compareSchools = Comparator.comparing(YearSchoolStat::getNumberOfSchools)
                .thenComparing(YearSchoolStat::getYearOfEntering);
        return yearList.stream()
                .map(n -> {
                    int int1 = (int) nameList.stream()
                            .filter(i -> i.getYearOfEntering() == n)
                            .map(Entrant::getSchoolNumber).distinct()
                            .count();
                    return new YearSchoolStat(n, int1);
                }).sorted(compareSchools)
                .collect(Collectors.toList());
    }
//////////////////////////////////
    public static List<YearSchoolStat> getYearSchoolStatList(List<Entrant> nameList, List<Integer> yearList) {

        Map<Integer, List<Entrant>> data = nameList.stream().collect(Collectors.groupingBy(Entrant::getYearOfEntering));

        return yearList.stream()
                .map(i -> {
                    List<Entrant> value = Optional.ofNullable(data.get(i)).orElse(Collections.emptyList());
                    long count = value.stream().map(Entrant::getSchoolNumber).distinct().count();
                    return new YearSchoolStat(i, Math.toIntExact(count));
                })
                .sorted(Comparator.comparing(YearSchoolStat::getNumberOfSchools)
                        .thenComparing(YearSchoolStat::getYearOfEntering))
                .collect(Collectors.toList());

    }

    public static void main(String[] args) {
        List<Integer> yearList = Arrays.asList(2001, 1999, 2000, 2002, 2003);
        List<Entrant> nameList = new ArrayList<>(); //чи є можливість оголосити в одну стрічку, як list Integer'ів?
        nameList.add(new Entrant(11, 2003, "Ivanov"));
        nameList.add(new Entrant(11, 2001, "Petrov"));
        nameList.add(new Entrant(11, 2001, "Pupkin"));
        nameList.add(new Entrant(10, 1999, "Zobkin"));
        nameList.add(new Entrant(10, 1999, "Zabkin"));
        nameList.add(new Entrant(10, 1999, "Ivanov"));
        nameList.add(new Entrant(10, 2000, "Petrov"));
        nameList.add(new Entrant(14, 2001, "Pupkin"));
        nameList.add(new Entrant(15, 2000, "Zobkin"));
        nameList.add(new Entrant(10, 2000, "Ivanov"));
        nameList.add(new Entrant(12, 2003, "Petrov"));
        nameList.add(new Entrant(11, 2003, "Pupkin"));
        nameList.add(new Entrant(10, 2003, "Zobkin"));
        System.out.println(getData(yearList, nameList));
        System.out.println(getYearSchoolStatList(nameList, yearList));
    }
}
