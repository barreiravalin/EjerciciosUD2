package ejerciciosud2;

public class Ejercicio1 {

    public static void main(String[] args) {
        // a)
        System.out.println((true && true) || false == true);
        // b)
        System.out.println((false || false) && false == true);
        // c) 
        System.out.println((!(true && false)) == false);
        
        // d)
        int i = 1;
        int j = 0;
        int k = -1;
        System.out.println(i + k <= j - k * 3 && k >= 2);
        
        // e)
        i = 3;
        j = 2;
        k = -1;
        System.out.println(i == 3 || j <= 2 && k > 0);
        
        // f)
        i = 1;
        System.out.println(3 == 2 || 5 > i + i);
        
        // g)
        int x = 1;
        int y = 4;
        int z = 10;
        final double PI = 3.1416;
        //      1)
        System.out.println(PI * x * x > y || 2 * PI * x <= z);
        //      2)
        System.out.println(x > 3 && (y == 4 || x + y <= z));
    }

}