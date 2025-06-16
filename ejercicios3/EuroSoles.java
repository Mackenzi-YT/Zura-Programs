package ejercicios3;
import java.util.*;
public class EuroSoles {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        double euro, soles;

        System.out.println("Ingrese la cantidad de soles a convertir");
        soles = Teclado.nextDouble();
        euro = soles / 4.21;

        System.out.println("La cantidad de euros es: "+euro);
    }
}
