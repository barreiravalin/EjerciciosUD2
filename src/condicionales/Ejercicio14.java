package condicionales;

import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        byte dia;
        boolean clienteFrecuente;
        String frecuente;
        double precio;
        
        System.out.print("Indique el d�a de la semana: ");
        dia = in.nextByte();
        
        System.out.print("�Es un cliente frecuente? (S/N): ");
        frecuente = in.next(); // Lee el siguiente texto. Tiene que estar delimitado por un espacio o un Enter.
        clienteFrecuente = frecuente.toUpperCase().charAt(0) == 'S';

        precio = switch (dia) {
            case 1, 2, 3, 4, 5 -> 12;
            default -> 15;
        };
        /*
        if (dia < 6)
            precio = 12;
        else
            precio = 15;
        
        precio = (dia < 6) ? 12 : 15;
        */
        
        if (clienteFrecuente)
            precio *= 0.85; // Rebaja 15%
        
        //precio = (clienteFrecuente) ? precio * 0.85 : precio;
        
        
        System.out.println("Precio: " + precio + "�");
        
    }

}