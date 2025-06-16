package ejercicios3;
import java.util.*;
public class Salariado {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        int Salariado, horas;

        System.out.println("Ingrese las horas traajadas");
        horas = Teclado.nextInt();
        Salariado = horas * 12;
        System.out.println("Su salario es de: "+Salariado);
    }
}
