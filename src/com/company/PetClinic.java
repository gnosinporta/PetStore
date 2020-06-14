package com.company;

import com.company.application.VisitCalendar;
import com.company.application.VisitCalendarController;
import com.company.application.VisitCalendarView;
import com.company.domain.time.Week;
import com.company.domain.visits.Visits;

import java.time.LocalDate;

import static java.time.DayOfWeek.MONDAY;

public class PetClinic {
    public static void main(String[] args) {
        Week currentWeek = Week.since(LocalDate.now().with(MONDAY));
        Visits visits = new Visits();
        VisitCalendar visitCalendar = new VisitCalendar(currentWeek, visits);
        VisitCalendarController visitCalendarController = new VisitCalendarController(visitCalendar);
        VisitCalendarView visitCalendarView = new VisitCalendarView(visitCalendar, visitCalendarController);
        visitCalendarView.show();
    }
}
