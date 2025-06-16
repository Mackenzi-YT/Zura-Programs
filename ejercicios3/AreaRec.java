package ejercicios3;
import java.util.*;
public class AreaRec {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        int base, altura, area;
        System.out.println("Ingrese la base del rectangulo");
        base = Teclado.nextInt();
        System.out.println("Ingrese la altura del rectangulo");
        altura = Teclado.nextInt();
        area = base * altura;
        System.out.println("La area de este rectangulo es:"+area);
    }
}
