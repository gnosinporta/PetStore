package com.company.domain.visits;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Visits {

    private List<Visit> visits = new ArrayList<>();     //un arrayList de Visit

    //metodos

    //agrega la Visit que se pasa por parametro a la lista - COMPLETAMENTE REDUNDANTE
    public void add(Visit visit) {
        this.visits.add(visit);
    }

    //filtra la lista visits y devuelve una lista con todas las Visit que
    //sean de la fecha LocalDate que se pasa por parámetro
    public List<Visit> on(LocalDate date) {
        return visits.stream().filter(visit -> visit.isOn(date)).collect(Collectors.toList());
    }
}
