import java.util.*;
public class Pregunta5 {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        int num1, num2;

        System.out.println("Ingrese el 1er numero");
        num1 = Teclado.nextInt();

        System.out.println("Ingrese el 2do numero");
        num2 = Teclado.nextInt();

        if (num1 == num2) {
            System.out.println("Los numeros ingresados son iguales.");
        } else {
            if(num1 > num2) {
            System.out.println("El mayor es: "+num1+" El menor es: "+num2);
        }
        else {
            System.out.println("El mayor es:" +num2 +" El menor es: " +num1);
        }
        }
    }
}