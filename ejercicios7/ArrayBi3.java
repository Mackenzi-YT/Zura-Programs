package ejercicios7;

public class ArrayBi3 {
    public static void main(String[] args) {
        double[] notas = new double[4];

        System.out.println("Para calcular su promedio, ingrese sus notas");

        for (int i = 0; i < notas.length; i++) {
            System.out.print("nota del examen nº"+(i+1));
            notas[i] = Double.parseDouble(System.console().readLine());
        }

        System.out.println("tus notas son: ");
        double suma = 0;

        // declara tipo de dato (double) y su variable auxiliar (n)
        //dos puntos (:) iterable el array (notas)

        for (double n : notas) {
            System.out.println(n + "");
            suma = suma + n;
        }

        System.out.println("\n El promedio es: "+ (suma/4));
    }
}
