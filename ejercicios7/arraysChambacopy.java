package ejercicios7;
import java.util.*;
public class arraysChambacopy {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);

        int[] numeros = new int [20];
        int[] cuadrado = new int [20];
        int[] cubo = new int [20];

        for (int i = 0; i <= 19; i++) {
            numeros[i] = (int)(Math.random()*101);
        }

        for (int i = 0; i <= 19; i++) {
            cuadrado[i] = numeros[i]*numeros[i];
        }

        for (int i = 0; i <= 19; i++) {
            cubo[i] = numeros[i] * numeros[i] * numeros[i];
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("el array de numeros tiene en la posicion: " +(i+1));
            System.out.println(numeros[i]);
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("el array de cuadrado tiene en la posicion: " +(i+1));
            System.out.println(cuadrado[i]);
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("el array de cubo tiene en la posicion: " +(i+1));
            System.out.println(cubo[i]);
        }
       
    }
}
