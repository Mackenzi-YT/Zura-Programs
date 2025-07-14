public class numRNGcopycopy {

    public static void main(String[] args) {
        System.out.println("Genera 10 numeros RNG, del 20 al 45");

        for (int i = 1; i <= 10; i++) {
            System.out.println((int) (Math.random()* 10 + 1) + 20);
        }
    }
}