package ejercicios4;

import java.util.Scanner;

public class NumeroPositivo {
    public static void main(String[] args) {
        double respuesta;
        Scanner Teclado = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        respuesta = Teclado.nextDouble();

        if (respuesta > 0) {
            System.out.println("El numero es positivo!!");
        } else {
            System.out.println("El numero es negativo!!");
        }
    }
}
