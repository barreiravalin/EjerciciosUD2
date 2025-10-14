package condicionales;

import java.time.Year;
import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int año;
              
        System.out.print("Año: ");
        año = in.nextInt();
        
        if (Year.isLeap(año))
            System.out.println("Bisiesto");
        else
            System.out.println("No bisiesto");
        
        System.out.println((Year.isLeap(año))? "Bisiesto" : "No bisiesto");
    }

}