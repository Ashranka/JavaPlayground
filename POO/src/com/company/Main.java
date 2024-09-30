package com.company;

import com.company.Interfaces.Delfin;
import com.company.Interfaces.Pulpo;

public class Main {

    public static void main(String[] args)
    {
        /* //Proyectos de Veterinaria
        Persona persona1 = new Persona("Pedro", "Pascal", 48);

        persona1.setNombre("Ricardo");
        persona1.setApellido("Perez");

        System.out.println(persona1.darNombreCompleto() + " tiene : "+ persona1.getEdad());


        Animal animal = new Animal("Bestia", 5, 20);
        Gato gato = new Gato("Colomba", 4, 16);
        Perro perro = new Perro("Copito", 3, 7);

        System.out.println("El animal llamado " + animal.nombre + " hace: ");
        System.out.println(animal.hacerSonido());

        System.out.println("El Perro llamado " + perro.nombre + " hace: ");
        System.out.println(perro.hacerSonido());

        System.out.println("El Gato llamado " + gato.nombre + " hace: ");
        System.out.println(gato.hacerSonido());

        System.out.println("El total de los animales creados es de :" + Animal.getCantidadAnimales());

        System.out.println("Yo atiendo mis animalitos en " + Veterinaria.nombre);


        Circulo circulo = new Circulo(12);
        Rectangulo rectangulo = new Rectangulo(8,6);

        circulo.ImprimirInformacion();
        System.out.println("El area de un Circulo es: " + circulo.calcularArea());

        rectangulo.ImprimirInformacion();
        System.out.println("El area de un Rectangulo es: " + rectangulo.calcularArea());
         */

        Delfin delfin = new Delfin("Delfina");
        Pulpo pulpo = new Pulpo("Poll", 3);

        pulpo.comuniacion();
        pulpo.nadar();

        delfin.comuniacion();
        delfin.nadar();

        double numero = 2;
        double numero2 = 2;

        try {
            double suma = numero / numero2;
            System.out.println("Esto paso por la excepcion");

        }catch (Exception ex)
        {
                ex.printStackTrace();
        }


    }
}
