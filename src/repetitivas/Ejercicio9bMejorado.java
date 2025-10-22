package repetitivas;

public class Ejercicio9bMejorado {

    public static void main(String[] args) {
        long factorial;
        // Vamos a calcular el número de multiplicaciones que se 
        // hacen en total.
        int contador = 0;
        
        // n representa el número del que se quiere calcular el factorial.
        factorial = 1;
        
        for (int n = 1; n <= 20; n++) {
            factorial *= n;
            contador++;
            
            System.out.println(n + "! = "+ factorial);
        }
        
        System.out.println("Nº de multiplicaciones: " + contador);
    }

}