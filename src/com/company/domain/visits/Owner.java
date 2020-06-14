package com.company.domain.visits;

//dueño de la mascota, solo un nombre
public class Owner {

    private String name;

    public Owner(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
