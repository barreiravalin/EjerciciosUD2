package condicionales;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        
        System.out.print("Teclee un número: ");
        n = in.nextInt();
        
        if (n != 0)
            //if (n % 2 == 0)
            // Los nº pares tienen el bit menos significativo a cero.
            if ((n & 1) == 0) 
                System.out.println(n + " es par");
            else 
                System.out.println(n + " es impar");
    }
}