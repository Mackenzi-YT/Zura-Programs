package ejercicios3;
import java.util.*;
public class NumerosMulti {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        int num1 , num2, resultado;

        System.out.println("Ingrese el 1er numero");
        num1 = Teclado.nextInt();
        System.out.println("Ingrese el 1er numero");
        num2 = Teclado.nextInt();
        resultado = num1 * num2;
        System.out.println("El resultaddo de la nultiplicacion de ambos es: "+resultado);
    }
}
