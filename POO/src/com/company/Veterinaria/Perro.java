package com.company.Veterinaria;

public class Perro extends Animal
{

    public Perro(String nombre, int cantPatas, int edad)
    {
        super(nombre, cantPatas, edad);
    }

    @Override
    public String hacerSonido ()
    {
        return "Guau";
    }
}
