package ejercicios4;

import java.util.Scanner;

public class Segundo {
    public static void main(String[] args) {
        double a, b, x, discriminante;
        Scanner Teclado = new Scanner(System.in);

        System.out.println("Este programa resuelve ecuaciones: ax+b=0");
        System.out.println("Ingrese el valor de a");
        a = Teclado.nextDouble();
        System.out.println("Ingrese el valor de b");
        b = Teclado.nextDouble();

        x = (b - 0) / -a;
        
        if (x > 0) {
            
            System.out.println("El valor de x es: "+x);
        } else {
            System.out.println("Esta ecuacion no tiene soluciones reales.");
        }
    }
}
