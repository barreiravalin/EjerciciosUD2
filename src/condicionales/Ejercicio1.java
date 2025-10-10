package condicionales;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        byte nota;
        boolean notaValida;
        
        System.out.printf("Indique una nota: ");
        nota = in.nextByte();
        
        notaValida = nota >= 0 && nota <= 10;
        
        if (notaValida)
            System.out.println("Nota correcta");
        else
            System.out.println("Nota incorrecta");
    }

}