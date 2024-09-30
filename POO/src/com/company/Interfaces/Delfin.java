package com.company.Interfaces;

public class Delfin extends CriaturasMarinas implements Comunicacion
{


    public Delfin(String nombre) {
        super(nombre);
    }

    @Override
    public void nadar() {
        System.out.println(nombre + " Esta nadando");
    }

    @Override
    public void comuniacion() {
        System.out.println(nombre + " Emite sonidos de delfin ");
    }
}
