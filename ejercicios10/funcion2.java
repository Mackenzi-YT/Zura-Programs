package ejercicios10;

import java.util.Scanner;
import Biblioteca.Matematicas;

public class funcion2 {

    public static void main(String[] args) {


        Scanner Teclado = new Scanner(System.in);

        System.out.println("Sumador de 2 numeros enteros");
        System.out.println("Ingrese 1er numero:");

        int num1 = Teclado.nextInt();

        System.out.println("Ingrese 2do numero:");
        int num2 = Teclado.nextInt();

        System.out.println("la suma es: "+ Matematicas.miSuma(num1, num2));
        System.out.println("la resta es: "+ Matematicas.miResta(num1, num2));
        System.out.println("la multiplicacion es: "+ Matematicas.miMulti(num1, num2));
        System.out.println("la division es: "+ Matematicas.miDivision(num1, num2));

    }
}