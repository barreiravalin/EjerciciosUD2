package condicionales;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("A�o: ");
        int a�o = in.nextInt();
        
        int a, b, c, d, e, f;
        
        a = a�o % 19;
        b = a�o % 4;
        c = a�o % 7;
        d = (19 * a + 24) % 30;
        e = (2 * b + 4 * c + 6 * d + 5) % 7;
        f = 22 + d + e;
        
        if (f <= 31)
            System.out.println(f + " de marzo");
        else
            System.out.println(f - 31 + " de abril");
        
    }

}