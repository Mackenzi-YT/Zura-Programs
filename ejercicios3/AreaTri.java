package ejercicios3;
import java.util.*;
public class AreaTri {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        int base, altura;
        double area;
        System.out.println("Ingrese la base del triangulo");
        base = Teclado.nextInt();
        System.out.println("Ingrese la altura");
        altura = Teclado.nextInt();
        area = (base * altura) / 2;
        System.out.println("La base de este triangulo es de:"+area);
    }
}
