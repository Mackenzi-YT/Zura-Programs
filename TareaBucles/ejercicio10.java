package TareaBucles;

import java.util.Scanner;

import ejerccicios2.teclado;

public class ejercicio10 {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        int positivo = 0 , negativo = 0;
        int num;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Introduce el numero: "+i+":");
            num = Teclado.nextInt();
            
            if (num > 0) positivo++;
            else if(num < 0) negativo++;

        }

        System.out.println("Positivos: "+ positivo);
        System.out.println("Negativo: "+negativo);
    }
}
