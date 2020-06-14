package com.company.domain.time;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Week {

    //atributos
    private final LocalDate start;      //inicio de la semana, en formato dd-mm-aaaa

    //constructor
    private Week(LocalDate start) {
        this.start = start;
    }

    //metodos

    //devuelve un objeto Week con parametro start
    //es static
    public static Week since(LocalDate start) {
        return new Week(start);
    }

    //devuelve un objeto week inicializado una semana más tarde
    public Week next() {
        return new Week(start.plusDays(7));
    }

    //devuelve un objeto Week inicializado una semana antes
    public Week previous() {
        return new Week(start.minusDays(7));
    }

    //cambia el estado de start al DayOfWeek que se pasa por parámetro
    public LocalDate get(DayOfWeek day) {
        return start.with(day);
    }

    //cambia el estado de start seis dias después
    public LocalDate getEnd() {
        return start.plusDays(6);
    }

    //g y s
    public LocalDate getStart() {
        return start;
    }




}
