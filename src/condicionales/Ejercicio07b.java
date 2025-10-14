package condicionales;

import java.time.Year;
import java.util.Scanner;

public class Ejercicio07b {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        byte hora;
        byte minutos;
        String franjaHoraria; // PM o AM
        
        System.out.print("Hora: ");
        hora = in.nextByte();
     
        System.out.print("Minutos: ");
        minutos = in.nextByte();
        
        franjaHoraria = (hora >= 12)? "PM" : "AM";
        
        if (hora > 12) 
            hora -= 12;
        
        System.out.printf("%02d:%02d %s\n", hora, minutos, franjaHoraria);
    }
}