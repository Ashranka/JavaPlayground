package com.company.Interfaces;

public interface Comunicacion
{
    //Solo se declaran los metodos pero no su implementacion , este lo hace la clase
    void comuniacion();

    //Se pueden tener constantes

    final String GRITO = "ahhh";

    //Y solo pueden ser public, los otros modificadores de accesso private, protected no,
    //ya que las interfaces pueden ser publicas
    public  String Grito2 = "Ehhhh";

}