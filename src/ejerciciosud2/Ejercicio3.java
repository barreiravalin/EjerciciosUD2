package ejerciciosud2;

public class Ejercicio3 {

    public static void main(String[] args) {
        boolean turnoA = true;

        System.out.println("A tiene turno: " + turnoA);
        for (int i = 0; i < 5; i++) {
            turnoA = !turnoA;
            System.out.println("A tiene turno: " + turnoA);
        }
    }

}