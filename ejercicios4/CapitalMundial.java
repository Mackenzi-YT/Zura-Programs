package ejercicios4;

import java.util.Scanner;

public class CapitalMundial {
    public static void main(String[] args) {
        String respuesta;
        Scanner Teclado = new Scanner(System.in);

        System.out.println("Cual es la capital de Italia?");
        respuesta = Teclado.nextLine();

        if ("roma".equals(respuesta)) {
            System.out.println("la respuesta es correcta!!!");
        } else {
            System.out.println("La respuesta es incorrecta!!");
        }
    }
}
