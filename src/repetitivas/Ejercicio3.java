package repetitivas;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int max;
        int n;
        int suma = 0;
        double media;
        
        System.out.print("�Cu�ntos n�meros va a teclear? ");
        max = in.nextInt();
        
        for (int i = 1; i <= max; i++) {
            System.out.print("Teclee el n�mero " + i + ": ");
            n = in.nextInt();
            suma += n;
        }
        
        media = (double)suma / max;
        System.out.println("Media: " + media);
    }

}