package ejercicios10;
import Biblioteca.Geometria;
import java.util.Scanner;

public class funcion4 {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);

        System.out.println("ingrese el radio del cilindro");
        double radio = Teclado.nextDouble();

        System.out.println("Ingrese la altura del cilindro");
        double altura = Teclado.nextDouble();

        System.out.println("El volumen del cilindro es: "+Geometria.VolCilindro(radio, altura));

        System.out.println("Ingrese el radio para la Longitud de Circunferencia");
        double radio2 = Teclado.nextDouble();

        System.out.println("La longitud de circunferencia es: "+Geometria.LingCircunferencia(radio2));
    }
}
