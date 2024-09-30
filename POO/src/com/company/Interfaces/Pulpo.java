package com.company.Interfaces;

public class Pulpo extends CriaturasMarinas implements Comunicacion
{
    int tentaculos;

    public Pulpo(String nombre, int tentaculos) {
        super(nombre);
        this.tentaculos = tentaculos;
    }

    @Override
    public void nadar() {
        System.out.println(nombre + " Nada con sus 8 tentaculos ");
    }

    @Override
    public void comuniacion() {
        System.out.println(nombre + " Tiene " + tentaculos);
    }
}
