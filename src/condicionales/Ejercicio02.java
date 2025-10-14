package condicionales;

import java.util.Scanner;

public class Ejercicio02 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        byte nota;
        boolean notaValida;
        
        System.out.printf("Indique una nota: ");
        nota = in.nextByte();
        
        notaValida = nota >= 0 && nota <= 10;
        
//        if (notaValida) {
//            System.out.println("Nota correcta");
//            if (nota >= 5)
//                System.out.println("Aprobado");
//            else
//                System.out.println("Suspenso");
//        } else 
//            System.out.println("Nota incorrecta");
        if (nota < 0 || nota > 10)
            System.out.println("Nota incorrecta");
        else {
            System.out.println("Nota correcta");
            if (nota >= 5) 
                System.out.println("Aprobado");
            else 
                System.out.println("Suspenso");
        }
    }

}