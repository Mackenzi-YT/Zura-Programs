package ejercicios3;
import java.util.*;
public class ExamenMiedo {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        double nota1, nota2, necesario, deseo;

        System.out.println("Ingrese la 1ra nota");
        nota1 = Teclado.nextDouble();

        System.out.println("Que nota desea sacar en el examen??");
        deseo = Teclado.nextDouble();

        nota2 = (deseo - (nota1 * 0.4)) / 0.6;
        System.out.println("Para tener "+deseo+"en el examen debes sacar: "+nota2);
    }
}
