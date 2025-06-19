package ejercicios4;

import java.util.Scanner;

public class Ordenacion {
    public static void main(String[] args) {
    int num1,num2,num3,resultado;
        int menor,medio, mayor;

        Scanner Teclado = new Scanner(System.in);

        System.out.println("Introduce el numero 1: ");
        num1 = Teclado.nextInt();

        System.out.println("Introduce el numero 2: ");
        num2 = Teclado.nextInt();

        System.out.println("Introduce el numero 3: ");
        num3 = Teclado.nextInt();

        if (num1 <= num2 && num1 <= num3) {
            menor = num1;
            if (num2 <= num3) {
                medio = num2;
                mayor = num3;
            } else {
                medio = num3;
                mayor = num2;
            }
        } else if (num2 <= num1 && num2 <= num3) {
            menor = num2;
            if (num1 <= num3) {
                medio = num1;
                mayor = num3;
            } else {
                medio = num3;
                mayor = num1;
            }
        } else {
            menor = num3;
            if (num1 <= num2) {
                medio = num1;
                mayor = num2;
            } else {
                medio = num2;
                mayor = num1;
            }
        }

        System.out.println("Números ordenados de menor a mayor: " + menor + ", " + medio + ", " + mayor);

    }
}
