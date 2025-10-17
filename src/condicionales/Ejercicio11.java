package condicionales;

import java.time.Year;
import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a�o;
        boolean esBisiesto;
        
        System.out.print("A�o: ");
        a�o = in.nextInt();
        
        // Primera alternativa
        if (Year.isLeap(a�o))
            System.out.println("Bisiesto");
        else
            System.out.println("No bisiesto");
        
        // Segunda alternativa
        System.out.println((Year.isLeap(a�o))? "Bisiesto" : "No bisiesto");
        
        // Tercera alternativa (es la que pide el ejercicio)
        esBisiesto = (a�o % 4 == 0) &&
                     (a�o % 100 != 0 || a�o % 400 == 0);
        if (esBisiesto)
            System.out.println("Bisiesto");
        else
            System.out.println("No bisiesto");
        
        // Cuarta alternativa
        if (a�o % 4 == 0) {
            if (a�o % 100 != 0 || a�o % 400 == 0)
                System.out.println("Bisiesto");
            else
                System.out.println("No bisiesto");
        } else
            System.out.println("No bisiesto");
    }
}