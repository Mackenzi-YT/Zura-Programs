package TareaBucles;
import java.util.*;

import ejerccicios2.teclado;
public class ejercicio8 {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        long numero = Teclado.nextLong();

        int digitos = 0;
        long copia = Math.abs(numero);
        if (copia == 0) {
            digitos = 1;
        }
        else{
            while (copia > 0) {
                copia /= 10;
                digitos++;
            }
        }

        System.out.println("El numero tiene: "+digitos+" digitos");

    }
}
