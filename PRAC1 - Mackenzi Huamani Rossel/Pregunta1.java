import java.util.*;
public class Pregunta1 {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un numero entre el 1 y el 7");
        num = Teclado.nextInt();

        switch (num) {
            case 1:
                System.out.println("Es lunes");
                break;
            case 2:
                System.out.println("Es martes");
                break;

            case 3:
                System.out.println("Es mierccoles");
                break;
            
            case 4:
                System.out.println("Es jueves");
                break;

            case 5:
                System.out.println("Es viernes");
                break;

            case 6:
                System.out.println("Es sabado");
                break;

            case 7:
                System.out.println("Es domingo");
                break;
            default:
                System.out.println("El numero ingresado no es valido");
                break;
        }

    }
}