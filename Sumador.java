import java.util.Scanner;

public class Sumador {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
    int dat01, dat2, resultado;

    System.out.println("Entre el 1er numero");
    dat01 = teclado.nextInt();
    
    System.out.println("Ingrese el 2do numero");
    dat2 = teclado.nextInt();

    resultado = dat01 + dat2;

    System.out.println("La suma de ambos numeros es: " +resultado);

    }
}