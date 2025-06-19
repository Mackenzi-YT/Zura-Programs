package ejercicios4;

import java.util.Scanner;

public class Segu3erndo {
    public static void main(String[] args) {
        double num1, num2, num3, resultado;
        Scanner Teclado = new Scanner(System.in);

        System.out.println("Ingrese la nota 1");
        num1 = Teclado.nextDouble();
        System.out.println("Ingrese la nota 2");
        num2 = Teclado.nextDouble();
        System.out.println("Ingrese la nota 2");
        num3 = Teclado.nextDouble();

        resultado = (num1 + num2 + num3) / 3;
        
        if (resultado <= 10) {
                System.out.println("Insuficiente.");
        }else {
                if (resultado >= 11 && resultado  < 13 ) {
                System.out.println("Suficiente");
        } else {
                if (resultado >= 13 &&  resultado <= 15) {
                    System.out.println("Bien");
        } else {
                if (resultado > 15) {
                    System.out.println("Sobresaliente");
        }
        }
        }
        }
}
}