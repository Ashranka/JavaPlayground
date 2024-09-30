package com.company.Veterinaria;
//Aqui especificamos que el gato herada de animal
public class Gato extends Animal
{


    public Gato(String nombre, int cantPatas, int edad)
    {
        super(nombre, cantPatas, edad);
    }

    //Con este operador o decorador hacemos uso del polimorfismo,

    @Override
    public String hacerSonido ()
    {
        return "Miau";
    }
}
