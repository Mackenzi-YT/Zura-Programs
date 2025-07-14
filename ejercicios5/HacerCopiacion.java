import java.util.*;
public class HacerCopiacion {

    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);

        int numero;
        String seguir = "s";

        while (seguir.equals("s")) {
            System.out.println("Ingrese todo tipo de numero");
            numero = Teclado.nextInt();
            System.out.println("Desea seguir?");
            System.out.println("s / n");
            seguir = Teclado.nextLine();
        }

        
    }
}