package repetitivas;

import java.time.Year;
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int suma = 0;
        
        System.out.print("dime el primer n�mero: ");
        int primero = in.nextInt();
        
        System.out.print("Dime el segundo n�mero: ");
        int segundo = in.nextInt();
        
        if (primero > segundo) {
            int temporal = primero;
            primero = segundo;
            segundo = temporal;
        }
        
        if (primero % 2 != 0) 
            primero++;
        for (int i = primero; i <= segundo; i += 2) 
            suma += i;
        
        System.out.println(suma);
    }
}