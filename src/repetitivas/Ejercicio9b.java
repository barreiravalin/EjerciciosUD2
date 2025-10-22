package repetitivas;

public class Ejercicio9b {

    public static void main(String[] args) {
        long factorial;
        // Vamos a calcular el número de multiplicaciones que se 
        // hacen en total.
        int contador = 0;
        
        // n representa el número del que se quiere calcular el factorial.
        for (int n = 1; n <= 20; n++) {
            factorial = 1;
            
            for (int i = n; i > 1; i--) {
                factorial *= i;
                // Para cada multiplicación incremento el contador en una unidad.
                contador++;
            }
            
            System.out.println(n + "! = "+ factorial);
        }
        
        System.out.println("Nº de multiplicaciones: " + contador);
    }

}