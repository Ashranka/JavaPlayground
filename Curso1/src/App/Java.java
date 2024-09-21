package App;

import java.util.Arrays;
import java.util.Scanner;

public class Java
{

    public static  void main(String[] args) throws Exception
    {
        Scanner scanner = new Scanner(System.in);

        String palabraSecreta = "inteligencia";
        int intentosMaximos = 10;
        int intetos= 0;
        boolean palabraAdivinada = false;

        //arreglos
        char[] letrasAdivinadas = new char[palabraSecreta.length()];

       /* Arrays.fill(letrasAdivinadas, '_');
        System.out.println(letrasAdivinadas); */

        Arrays.fill(letrasAdivinadas, '_');
        System.out.println(letrasAdivinadas);

        while (!palabraAdivinada && intetos < intentosMaximos)
        {
            System.out.println("Palabras a Adivinar" + String.valueOf(letrasAdivinadas));

            System.out.println("Introduce una letra, porfavor");

            char letra = scanner.next().charAt(0);

            boolean letraCorrecta = false;
            for (int i = 0; i < palabraSecreta.length() ; i++)
            {
                if (palabraSecreta.charAt(i) == letra)
                {
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                }
            }

            if (!letraCorrecta){
                intetos++;
                System.out.println("Incorrecto, te quedan "+(intentosMaximos - intetos) + " intentos.");
            }

            if (String.valueOf(letrasAdivinadas).equals(palabraSecreta))
            {
                palabraAdivinada = true;
                System.out.println("Felicitaciones has adivinado la plabra secreta: " + palabraSecreta);
            }
        }
        if (!palabraAdivinada)
        {
            System.out.println("te has quedado sin intentos, has perdido");
        }

    }

}
