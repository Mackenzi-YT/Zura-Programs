import java.util.*;
public class Pregunta2 {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        int edad;
        System.out.println("Ingrese su edad");
        edad = Teclado.nextInt();

        if (edad >= 30) {
            System.out.println("Nunca es tarde para aprender ¿Que curos tomaremos?");
        }

        if (edad >= 18 && edad <= 29) {
            System.out.println("Es un momento excelente para impulsar tu carrera.");
            }

        if (edad < 18) {
            System.out.println("¿Sabes hacia dónde dirigir tu futuro? Seguro puedo ayudarte");
        }
    }
}