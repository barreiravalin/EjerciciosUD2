package condicionales;

public class Ejercicio4 {

    public static void main(String[] args) {
        // Se asume que los nº son distintos
        int n1 = 8;
        int n2 = 10;
        int n3 = 15;
        int n4 = 5;
        int menor;

        // Primera alternativa
        if (n1 < n2 && n1 < n3 && n1 < n4)
            System.out.println(n1);
        else if (n2 < n3 && n2 < n4)
            System.out.println(n2);
        else if (n3 < n4)
            System.out.println(n3);
        else
            System.out.println(n4);
        
        // Segunda alternativa
        if (n1 < n2)
            menor = n1;
        else
            menor = n2;
        if (n3 < menor)
            menor = n3;
        if (n4 < menor)
            menor = n4;
        
        System.out.println(menor);
        
        // Tercera alternativa
        menor = Math.min(n1, n2);
        menor = Math.min(menor, n3);
        menor = Math.min(menor, n4);
        System.out.println(menor);
        
        // Cuarta alternativa
        menor = Math.min(Math.min(n1, n2), Math.min(n3, n4));
        System.out.println(menor);
        
        // Quinta alternativa
        menor = Math.min(n1, Math.min(n2, Math.min(n3,n4)));
        System.out.println(menor);
    }

}