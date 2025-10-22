package repetitivas;

public class Ejercicio9b {

    public static void main(String[] args) {
        long factorial;
        // Vamos a calcular el n�mero de multiplicaciones que se 
        // hacen en total.
        int contador = 0;
        
        // n representa el n�mero del que se quiere calcular el factorial.
        for (int n = 1; n <= 20; n++) {
            factorial = 1;
            
            for (int i = n; i > 1; i--) {
                factorial *= i;
                // Para cada multiplicaci�n incremento el contador en una unidad.
                contador++;
            }
            
            System.out.println(n + "! = "+ factorial);
        }
        
        System.out.println("N� de multiplicaciones: " + contador);
    }

}