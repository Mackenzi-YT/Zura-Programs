package ejercicios4;

import java.util.Scanner;

public class Primero {
    public static void main(String[] args) {
        double chamba, horas;
        Scanner Teclado = new Scanner(System.in);

        System.out.println("Ingrese las horas trabajadas");
        horas = Teclado.nextDouble();

        if (horas > 40) {
            chamba = 480;
            horas = horas - 40;
            horas = horas * 16;

            chamba = chamba + horas;
            
            System.out.println("Usted chambeo y gano: "+chamba);
        } else {
            chamba = horas * 12;

            System.out.println("Usted chambeo y gano: "+chamba);
        }
    }
}
