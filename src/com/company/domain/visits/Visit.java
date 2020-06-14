package com.company.domain.visits;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import java.util.stream.Collectors;

/*
esta clase incluye informacion sobre la hora, fecha y mascotas de la visita.

Acciones:
-Devuelve  el nombre del dueño de la primera mascota de la lista
(se supone que todas las mascotas de la visita tienen el mismo dueño).

-Cambia el estado de la fecha y hora al momento actual.

-Devuelve una lista de nombres de las mascotas de la lista

-Devuelve boolean si la visita coincide con la fecha que se le pase
*/
public class Visit {

    //atributos
    private LocalDateTime dateTime;     //hora y fecha, en formato yyyy-mm-ddThh:mm:ss
    private List<Pet> pets;             //una lista de mascotas

    //constructor
    public Visit(LocalDateTime dateTime, List<Pet> pets) {
        this.dateTime = dateTime;
        this.pets = pets;
    }

    //metodos

    //cambia el estado de dateTime al momento actual
    public LocalTime getTime() {
        return dateTime.toLocalTime();
    }

    //devuelve el nombre del dueño de la primera mascota en la lista pets
    public String getOwnerName() {
        return pets.get(0).getOwnerName();
    }

    //devuelve una lista de Strings de nombres de mascotas desde la lista pets
    public List<String> getPetNames() {
        return pets.stream().map(Pet::getName).collect(Collectors.toList());
    }

    //devuelve true si la fecha LocalDate que se pasa por parametro coincide con
    //la parte de la fecha de dateTime
    public boolean isOn(LocalDate date) {
        return dateTime.toLocalDate().equals(date);
    }
}
