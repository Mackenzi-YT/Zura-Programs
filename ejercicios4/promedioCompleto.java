package ejercicios4;

import java.util.Scanner;

public class promedioCompleto {
    public static void main(String[] args) {
        double respuesta, prac, exp, inv, exa, act;
        Scanner Teclado = new Scanner(System.in);

        System.out.println("Ingrese su nota en practicas:");
        prac = Teclado.nextDouble();

          System.out.println("Ingrese su nota en exposicion:");
        exp = Teclado.nextDouble();

          System.out.println("Ingrese su nota en investiacion:");
        inv = Teclado.nextDouble();

          System.out.println("Ingrese su nota en examen:");
        exa = Teclado.nextDouble();

          System.out.println("Ingrese su nota en actitudinal:");
        act = Teclado.nextDouble();

        respuesta = (prac + exp + inv + exa + act) / 5;

        if (respuesta >= 10.5) {
            System.out.println("Usted tiene un promedio aprobatorio! de: "+respuesta);
        } else {
            System.out.println("Usted tiene un promedio desaprobatorio! de: "+respuesta);
        }
    }
}
