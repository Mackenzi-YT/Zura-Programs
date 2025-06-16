package ejercicios4;

import java.util.Scanner;

public class Promediacion {
    public static void main(String[] args) {
        double respuesta;
        Scanner Teclado = new Scanner(System.in);

        System.out.println("Ingrese su promedio");
        respuesta = Teclado.nextDouble();

        if (respuesta >= 10.5) {
            System.out.println("Usted tiene un promedio aprobatorio!");
        } else {
            System.out.println("Usted tiene un promedio desaprobatorio!");
        }
    }
}
