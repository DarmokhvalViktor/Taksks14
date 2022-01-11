package org.darmokhval.tasks14;

import java.util.Comparator;

public class YearSchoolStat {
    private int yearOfEntering;
    private int numberOfSchools;

    public YearSchoolStat(int yearOfEntering, int numberOfSchools) {
        this.yearOfEntering = yearOfEntering;
        this.numberOfSchools = numberOfSchools;
    }
    public int getYearOfEntering() {
        return yearOfEntering;
    }

    public void setNumberOfSchools(int numberOfSchools) {
        this.numberOfSchools = numberOfSchools;
    }

    public void setYearOfEntering(int yearOfEntering) {
        this.yearOfEntering = yearOfEntering;
    }

    public int getNumberOfSchools() {
        return numberOfSchools;
    }

    @Override
    public String toString() {
        return "{YearSchoolStat{yearOfEntering=" + yearOfEntering + ", numberOfSchools=" + numberOfSchools + "}";
    }

}
