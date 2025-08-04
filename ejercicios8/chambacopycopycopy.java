package ejercicios8;

import java.util.Random;
import java.util.Scanner;

public class chambacopycopycopy {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[15];

        System.out.println("Introduce 15 números:");
        for (int i = 0; i < 15; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        int ultimo = numeros[14];
        for (int i = 14; i > 0; i--) {
            numeros[i] = numeros[i - 1];
        }
        numeros[0] = ultimo;

        System.out.println("\nArray rotado una posición a la derecha:");
        for (int i = 0; i < 15; i++) {
            System.out.println("Posición " + i + ": " + numeros[i]);
        }
    }
}
