package expresiones;

public class Ejercicio6 {

    public static void main(String[] args) {
        //apartado a
//         int nota1 = 1;
//         int nota2 = 8;
//         int nota3 = 5;
//         double notamedia = (double) (nota1 + nota2 + nota3) / 3;
//         boolean aprueba = notamedia >= 5;
//         System.out.println(notamedia);
//         System.out.println(aprueba);
//        
//          apartado b
//        final int NOTA_MIN = 4;
//        int nota1 = 4;
//        int nota2 = 4;
//        int nota3 = 5;
//        
//        double notamedia = (double) (nota1 + nota2 + nota3) / 3;
//        boolean conMin = nota1 >= NOTA_MIN && nota2 >= NOTA_MIN && nota3 >=NOTA_MIN;
//        boolean aprueba = notamedia >= 4.5 && conMin;
//        System.out.println(notamedia);
//        System.out.println(aprueba);
        //  apartado c
//        final int NOTA_MIN = 4;
//        int nota1 = 10;
//        int nota2 = 10;
//        int nota3 = 10;
//        boolean practEntre = false;
//        
//        double notamedia = (double) (nota1 + nota2 + nota3) / 3;
//        boolean conMin = nota1 >= NOTA_MIN && nota2 >= NOTA_MIN && nota3 >= NOTA_MIN;
//        boolean aprueba = notamedia >= 4.5 && conMin && practEntre;
//        
//        System.out.println(notamedia);
//        System.out.println(aprueba);

        // D)
        final int NOTA_MIN = 4; // Nota mínima exigida para aprobar.
        final int NOTA_MIN_PRACTICA = 4;
        
        int nota1 = 5;
        int nota2 = 6;
        int nota3 = 7;
        boolean practEntre = true;
        int notaPractica = 4;
        double notaFinal;
        
        double notaMedia = (double) (nota1 + nota2 + nota3) / 3;
        boolean contenidoMinimo = 
            nota1 >= NOTA_MIN && 
            nota2 >= NOTA_MIN && 
            nota3 >= NOTA_MIN;
        boolean aprueba = 
            notaMedia >= 4.5    && 
            contenidoMinimo     && 
            practEntre          &&
            notaPractica >= NOTA_MIN_PRACTICA;
        
        notaFinal = notaMedia * 0.8 + notaPractica * 0.2;
        
        System.out.println("Nota media: " + notaMedia);
        System.out.println("Nota final: " + notaFinal);
        System.out.println(aprueba);
    }

}
