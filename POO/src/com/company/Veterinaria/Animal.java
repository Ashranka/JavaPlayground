package com.company.Veterinaria;

public class Animal {

    String nombre;
    int cantPatas;
    int edad;
    //
    static int contadorAnimales = 0;


    public Animal(String nombre, int cantPatas, int edad)
    {
        this.nombre = nombre;
        this.cantPatas = cantPatas;
        this.edad = edad;
        contadorAnimales++;
    }

    public String hacerSonido ()
    {
        return "Hacer sonido Generico";
    }

    public static int getCantidadAnimales()
    {
        return contadorAnimales;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantPatas() {
        return cantPatas;
    }

    public void setCantPatas(int cantPatas) {
        this.cantPatas = cantPatas;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
