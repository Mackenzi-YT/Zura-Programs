package ejercicios3;
import java.util.*;
public class SumaRestaAlgo {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        int num1, num2, suma, resta , multi;
        double div;
        System.out.println("Ingresa el 1er numero");
        num1 = Teclado.nextInt();
        System.out.println("Ingrese el 2do numero");
        num2 = Teclado.nextInt();


    suma = num1 + num2;
    resta = num1 - num2;
    multi = num1 * num2;
    div = num1 / num2;

    System.out.println("Los desultaddos de las operaciones son:");
    System.out.println("Suma:"+suma);
    System.out.println("Resta:"+resta);
    System.out.println("Multiplicacion:"+multi);
    System.out.println("Division:"+div);

    }
}
