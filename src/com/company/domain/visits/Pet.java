package com.company.domain.visits;

//la mascota tiene un nombre y un Owner
public class Pet {

    private String name;
    private Owner owner;

    public Pet(String name, Owner owner) {
        this.name = name;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    //metodos

    //devuelve una String con el nombre del dueño
    public String getOwnerName() {
        return owner.getName();
    }
}
