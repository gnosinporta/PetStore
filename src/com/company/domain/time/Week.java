package com.company.domain.time;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Week {

    //atributos
    private final LocalDate start;

    //constructor
    private Week(LocalDate start) {
        this.start = start;
    }

    //metodos
    public static Week since(LocalDate start) {
        return new Week(start);
    }

    public Week next() {
        return new Week(start.plusDays(7));
    }

    public Week previous() {
        return new Week(start.minusDays(7));
    }

    public LocalDate get(DayOfWeek day) {
        return start.with(day);
    }

    public LocalDate getEnd() {
        return start.plusDays(6);
    }

    //g y s
    public LocalDate getStart() {
        return start;
    }




}
