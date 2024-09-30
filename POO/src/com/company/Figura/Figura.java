package com.company.Figura;

public abstract class Figura
{
    //Este comportamiento sera obligatorio en las clases que hereden de com.company.Figura
    abstract double calcularArea();

    void ImprimirInformacion()
    {
        System.out.println("Esta Es un mensaje de la clase abstracta");
    }
}
