package com.company.Interfaces;

public abstract class CriaturasMarinas {

    String nombre;

    public CriaturasMarinas(String nombre)
    {
        this.nombre = nombre;
    }

    //Aqui estamos obligando a sobre escribir, en clases que hereden de criaturas marinas
    abstract void  nadar();
}
