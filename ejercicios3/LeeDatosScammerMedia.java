package ejercicios3;
import java.util.*;
public class LeeDatosScammerMedia {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);

        double num1, num2, num3, promedio;

        System.out.println("Ingrese 3 numeros con decimmales separados por un espacio");
        num1 = Teclado.nextDouble();
        num2 = Teclado.nextDouble();
        num3 = Teclado.nextDouble();

        promedio = num1 + num2 + num3 / 3 ;

        System.out.println("El promedio es: "+promedio);
    }
}
