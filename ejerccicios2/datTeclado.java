package ejerccicios2;
import java.util.*;
public class datTeclado {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        System.out.println("Ingrese nombre y edad");

        String nombre = Teclado.next();
        int edad = Teclado.nextInt();

        System.out.println("nombre: "+nombre+" edad: "+edad);

    }
}
