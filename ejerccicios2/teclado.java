package ejerccicios2;
import java.util.*;

public class teclado {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);

        double num1, num2, result;
        
        System.out.println("numero 1 aqui");
        num1 = Teclado.nextDouble();
        System.out.println("numero 2 aqui");
        num2 = Teclado.nextDouble();

        result = num1 + num2;
        
        System.out.println("resultado triple aqui: "+result);

    }
}
