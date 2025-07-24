package ejercicios7;
import java.util.*;
public class arraysChamba {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);

        int[] numeros = new int [10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Ingresse el numero:"+(i+1));
            numeros[i] = Teclado.nextInt();
        }

        for (int i = numeros.length -1; i >= 0; i--) {
            System.out.println(numeros[(i)]);
        }
    }
}
