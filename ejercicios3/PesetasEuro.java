package ejercicios3;
import java.util.*;
public class PesetasEuro {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        double euro, peseta;

        System.out.println("Ingrese la cantidad de pesetas a convertir");
        peseta = Teclado.nextDouble();
        euro = peseta / 0.000053110;

        System.out.println("La cantidad de euros es: "+euro);
    }
}
