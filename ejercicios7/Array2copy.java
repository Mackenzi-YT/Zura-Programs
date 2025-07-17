package ejercicios7;

public class Array2copy {

    public static void main(String[] args) {
        double[] notas = new double[5];

        System.out.println("almacena 5 notas y promedia wiii");

        //lee y guarda en el array
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Ingrese la nota: "+(i+1));
            notas[i] = Double.parseDouble(System.console().readLine());
        }

        double suma = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.print(notas[i] +" - ");
            suma = suma + notas [i];
         }

    System.out.println("El promedio es: " + (suma / 5));


    }
}