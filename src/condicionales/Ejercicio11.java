package condicionales;

import java.time.Year;
import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a�o;
              
        System.out.print("A�o: ");
        a�o = in.nextInt();
        
        if (Year.isLeap(a�o))
            System.out.println("Bisiesto");
        else
            System.out.println("No bisiesto");
        
        System.out.println((Year.isLeap(a�o))? "Bisiesto" : "No bisiesto");
    }

}