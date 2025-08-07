package ejercicios9;

import java.util.Scanner;

public class MovimientoAlfil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la posición del alfil (ejemplo d5): ");
        String entrada = sc.nextLine();

        char letraColumna = entrada.charAt(0);
        int fila = Character.getNumericValue(entrada.charAt(1));

        int columna = letraColumna - 'a' + 1;

        System.out.print("El alfil puede moverse a las siguientes posiciones: ");

        int i = 1;
        while (columna + i <= 8 && fila + i <= 8) {
            char c = (char) ('a' + columna + i - 1);
            System.out.print(c + "" + (fila + i) + " ");
            i++;
        }

        i = 1;
        while (columna - i >= 1 && fila + i <= 8) {
            char c = (char) ('a' + columna - i - 1);
            System.out.print(c + "" + (fila + i) + " ");
            i++;
        }

        i = 1;
        while (columna + i <= 8 && fila - i >= 1) {
            char c = (char) ('a' + columna + i - 1);
            System.out.print(c + "" + (fila - i) + " ");
            i++;
        }

        i = 1;
        while (columna - i >= 1 && fila - i >= 1) {
            char c = (char) ('a' + columna - i - 1);
            System.out.print(c + "" + (fila - i) + " ");
            i++;
        }

        sc.close();
    }
}
