package repetitivas;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        final int MAX = 5;
        Scanner in = new Scanner(System.in);
        int n;
        int suma = 0;
        double media;
        
        for (int i = 1; i <= MAX; i++) {
            System.out.print("Teclee el n�mero " + i + ": ");
            n = in.nextInt();
            suma += n;
        }
        
        media = (double)suma / MAX;
        System.out.println("Media: " + media);
    }

}