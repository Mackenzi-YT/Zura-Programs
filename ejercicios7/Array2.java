package ejercicios7;

public class Array2 {

    public static void main(String[] args) {
        int[] numeros = new int[5];

        System.out.println("almacena 5 datos wiii");

        //lee y guarda en el array
        for (int i = 0; i <= 4; i++) {
            System.out.println("Ingrese el numero del espacio: "+i);
            numeros[i] = Integer.parseInt(System.console().readLine());
        }

        //mostrar los datos del array
        for (int i = 0; i <= 4; i++) {
            System.out.println(numeros[i]);
        }
    
    }
}