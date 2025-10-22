package repetitivas;

import java.util.Scanner;

public class Ejercicio9a {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        byte n;
        
        System.out.print("Número: ");
        n = in.nextByte();
        long factorial = 1;
        
        for (int i = 2; i <= n; i++) 
            factorial *= i;
        System.out.println(n + "! = " + factorial);
        
        factorial = 1;
        for (int i = n; i > 1; i--) 
            factorial *= i;
        System.out.println(n + "! = " + factorial);
    }

}