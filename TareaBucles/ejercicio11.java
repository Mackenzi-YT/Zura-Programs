package TareaBucles;

import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);

        int numero;
        int contardivisiores = 0;

        System.out.println("Ingresa un numero");
        numero = Teclado.nextInt();

        if (numero <= 1) {
            System.out.println("El numero no es primo");
        } else {
            for (int i = 1; i <= numero; i++) {
                if (numero % i == 0) {
                    contardivisiores++;
                }
            }

            if (contardivisiores == 2) {
                System.out.println("El numero es primo");
            } else {
                System.out.println("El numero no es primo");
            }
        }
    }
}
