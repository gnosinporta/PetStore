package com.company.application;

import com.company.domain.time.Week;
import com.company.domain.visits.Owner;
import com.company.domain.visits.Pet;
import com.company.domain.visits.Visit;
import com.company.domain.visits.Visits;
import com.company.mvc.Model;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import static java.time.DayOfWeek.*;

public class VisitCalendar extends Model {
    static final DayOfWeek[] OPEN_DAYS = {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY};

    private Week currentWeek;
    private Visits visits;

    public VisitCalendar(Week currentWeek, Visits visits) {
        this.currentWeek = currentWeek;
        this.visits = visits;
    }

    Week getCurrentWeek() {
        return currentWeek;
    }

    void nextWeek() {
        this.currentWeek = currentWeek.next();
        changed();
    }

    void previousWeek() {
        this.currentWeek = currentWeek.previous();
        changed();
    }

    List<Visit> visitsOn(DayOfWeek day) {
        return visits.on(currentWeek.get(day));
    }

    void addVisit(DayOfWeek dayOfWeek, LocalTime time, String ownerName, String[] petNames) {
        LocalDateTime dateTime = currentWeek.get(dayOfWeek).atTime(time);
        Owner owner = new Owner(ownerName);
        List<Pet> pets = toPets(petNames, owner);
        visits.add(new Visit(dateTime, pets));
        changed();
    }

    private List<Pet> toPets(String[] petNames, Owner owner) {
        List<Pet> pets = new ArrayList<>();
        for (String petName : petNames) {
            Pet pet = new Pet(petName, owner);
            pets.add(pet);
        }
        return pets;
    }
}
