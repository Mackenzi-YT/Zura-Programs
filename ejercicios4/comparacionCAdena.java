package ejercicios4;

import java.util.Scanner;

public class comparacionCAdena {
    public static void main(String[] args) {
        String MiFruta;
        Scanner Teclado = new Scanner(System.in);

        System.out.println("Ingrese la fruta de su preferencia!1");
        MiFruta = Teclado.nextLine();

        if ("manzana".equals(MiFruta)) {
            System.out.println("Iguales");
        } else {
            System.out.println("Distintas");
        }
    }
}
