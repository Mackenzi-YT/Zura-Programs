import java.util.*;
public class Pregunta4 {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        int num1, num2, num3;
        int mayor, menor, medio;
        mayor = 0;
        menor = 0;
        medio = 0;

        System.out.println("Ingrese el 1er numero");
        num1 = Teclado.nextInt();

        System.out.println("Ingrese el 2do numero");
        num2 = Teclado.nextInt();

        System.out.println("Ingrese el 3er numero");
        num3 = Teclado.nextInt();

        if (num1 >= num2 && num1 >= num3){
            mayor = num1;
            if (num2 >= num3) {
            medio = num2;
            menor = num3;
        }
        else {
            medio = num3;
            menor = num2;
        }
        }
        
        if (num2 >= num1 && num2 >= num3) {
            mayor = num2;
            if (num1 >= num3) {
            medio = num1;
            menor = num3;
        }
        else {
            medio = num3;
            menor = num1;
        }
        }

        if (num3 >= num1 && num3 >= num2) {
            mayor = num3;
            if (num2 >= num1) {
            medio = num2;
            menor = num1; 
        }
        else {
            medio = num1;
            menor = num2;
        }
        }

        System.out.println("Los numeros de mayor a menor son: ");
        System.out.println(mayor+","+medio+","+menor);

                
            
       
    }
}