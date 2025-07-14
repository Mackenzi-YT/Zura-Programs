public class numRNG {

    public static void main(String[] args) {
        System.out.println("Genera 10 numeros RNG");

        for (int i = 1; i <= 10; i++) {
            System.out.println((int) (Math.random()* 10 + 1));
        }
    }
}