package ejerciciosud2;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int MAX = 5;
        int n;
        
        System.out.print("Opci�n del men� (1 - " + MAX + "): ");
        n = in.nextInt();
        
        System.out.println("Opci�n correcta: " + (n > 0 && n <= MAX));
    }

}