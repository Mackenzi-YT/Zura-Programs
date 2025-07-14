public class RNGvive {

    public static void main(String[] args) {
        System.out.println("Genera entre piedra, papel o tijeras");
        int mano = (int) (Math.random()*3);

        switch (mano) {
            case 0:
                System.out.println("piedra");
                break;
                
            case 1:
                System.out.println("papel");
                break;

            case 2:
                System.out.println("tijeras");
                break;

            default:
                System.out.println("error del system");
                break;
        }
    }
}