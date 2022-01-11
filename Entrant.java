package org.darmokhval.tasks14;

import java.util.Comparator;
import java.util.List;

public class Entrant {
    private int schoolNumber;
    private int yearOfEntering;
    private String lastName;

    Entrant(int schoolNumber, int yearOfEntering, String lastName) {
        this.schoolNumber = schoolNumber;
        this.yearOfEntering = yearOfEntering;
        this.lastName = lastName;
    }
    public int getSchoolNumber(){
        return schoolNumber;
    }
    public int getYearOfEntering() {
        return yearOfEntering;
    }
    public String getLastName() {
        return lastName;
    }
    @Override
    public String toString() {
        return "(" + schoolNumber + "," +
                yearOfEntering + "," +
                lastName + ")";
    }
}

