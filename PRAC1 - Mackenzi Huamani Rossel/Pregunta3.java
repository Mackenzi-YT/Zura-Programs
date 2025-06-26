import java.util.*;
public class Pregunta3 {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        int num1, num2, num3;

        System.out.println("Ingrese el 1er numero entero");
        num1 = Teclado.nextInt();

        System.out.println("Ingrese el 2do numero entero");
        num2 = Teclado.nextInt();

        System.out.println("Ingrese el 3er numero entero");
        num3 = Teclado.nextInt();

        if (num1 == 1 && num2 == 2 && num3 == 3) {
            System.out.println("Accceso permitido!!");
        }
        else {
            System.out.println("Accceso denegado!!");
        }
    }
}