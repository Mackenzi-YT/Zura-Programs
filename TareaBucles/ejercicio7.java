package TareaBucles;

import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        int intentos = 4;
        int combinacion = 3003;
        int entrada;

        while (intentos > 0) {
            System.out.println("Introduce la combinacion de 4 cifras");
            entrada = Teclado.nextInt();

            if (entrada == combinacion) {
                System.out.println("la caja fuerte se ha abierto");
            }
            else {
                intentos--;
                System.out.println("Esa no es la combinacion");
            }

            if(intentos == 0){
                System.out.println("Se ha quedado sin intentos");
            }
        }
    }
}
