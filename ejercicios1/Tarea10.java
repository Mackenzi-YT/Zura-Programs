package ejercicios1;
            import java.util.*;

public class Tarea10 {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        double soles, euros;

        System.out.println("Ingrese la cantidad de soles a convertir");
        soles = Teclado.nextDouble();

        euros = soles / 4.20;

        System.out.println("La cantidad de Euros seria de: " +euros);
    }
}
