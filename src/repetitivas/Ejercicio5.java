package repetitivas;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numeroTerminos;
        double suma = 0;
        
        System.out.print("�Cu�ntos t�rminos quiere sumar?: ");
        numeroTerminos = in.nextInt();
        
        for (int i = 1; i <= numeroTerminos; i++) 
            suma += 1D / i;
        
        System.out.println(suma);
    }

}