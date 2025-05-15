  import java.util.*;
public class Calculadora {
  
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

                int funcion, dato1, dato2, resultado;

        funcion = 0;
        dato1 = 0;
        dato2 = 0;
        resultado = 0;

        while(funcion != 5){

             System.out.println("Funciones de calculadora:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Cerrar la calcculadora");
        System.out.println("Escriba el numero de función a usar");

        funcion = teclado.nextInt();

        switch(funcion){
            case 1:
            
            System.out.println("Se ha elegido suma");

            System.out.println("Ingrese el 1er numero");
            dato1 = teclado.nextInt();

            System.out.println("Ingrese el 2do numero");
            dato2 = teclado.nextInt();

            resultado = dato1 + dato2;

            System.out.println("El resultado de la suma es: "+resultado);

            break;

            case 2:
            
            System.out.println("Se ha elegido resta");

            System.out.println("Ingrese el 1er numero");
            dato1 = teclado.nextInt();

            System.out.println("Ingrese el 2do numero");
            dato2 = teclado.nextInt();

            resultado = dato1 - dato2;

            System.out.println("El resultado de la resta es: "+resultado);

            break;

            case 3:
            
            System.out.println("Se ha elegido multiplicación");

            System.out.println("Ingrese el 1er numero");
            dato1 = teclado.nextInt();

            System.out.println("Ingrese el 2do numero");
             dato2 = teclado.nextInt();

            resultado = dato1 * dato2;

            System.out.println("El resultado de la multipicación es: "+resultado);

            break;

            case 4:
           
            System.out.println("Se ha elegido división");

             System.out.println("Ingrese el 1er numero");
             dato1 = teclado.nextInt();

               System.out.println("Ingrese el 2do numero");
             dato2 = teclado.nextInt();

             resultado = dato1 / dato2;

            System.out.println("El resultado de la división es: "+resultado);

            break;
            
            case 5:
            System.out.println("SE HA CERRADO LA APP");

            break;
             }
         }


       
    }
}
