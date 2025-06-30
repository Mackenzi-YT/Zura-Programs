public class Infinidad3 {
    public static void main(String[] args) {
        int Contador = 0;
        int numero = 0;
        int suma = 0;

        System.out.println("Ingrese numeros y pulse enter");
        System.out.println("Para terminar, coloque un numero negativo");

        while (numero >= 0) {
            numero = Integer.parseInt(System.console().readLine());
            Contador++;
            suma = suma + numero;
        }

        System.out.println("Ingresò: "+(Contador-1)+" numeros");
        System.out.println("Esos numeros suman: "+(suma-numero));
        
    }
}
