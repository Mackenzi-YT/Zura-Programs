package ejercicios7;

import java.util.Scanner;

public class ArraysTxTcopy {
    public static void main(String[] args) {
        String[] colorName = { "rojo", "azul", "celeste", "marron", "blanco" };
        String[] colorCode = { "\u001B[41m", "\u001B[44m", "\u001B[106m", "\u001B[45m", "\u001B[47m" };

        System.out.println("Generador aleatorio de banderas");
        Scanner s = new Scanner(System.in);

        System.out.print("¿Cuántas franjas quiere para la bandera?: ");
        int franjas = Integer.parseInt(s.nextLine());
        final String RESET = "\u001B[0m";

        for (int i = 0; i < franjas; i++) {
            int aleatorio = (int) (Math.random() * 5);
            String color = colorName[aleatorio];
            String code = colorCode[aleatorio];

            System.out.println(code + "          " + RESET + " " + color);
        }
    }
    
}
