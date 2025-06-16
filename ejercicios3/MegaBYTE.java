package ejercicios3;
import java.util.*;
public class MegaBYTE {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        double Mb, Kb;
        System.out.println("Ingrese el peso del archivo en Mb");
        Mb = Teclado.nextDouble();
        Kb = Mb * 1000;
        System.out.println("El peso en Kb es de:"+Kb);
    }
}
