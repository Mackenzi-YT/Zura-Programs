public class RNGvivecopycopy {

    public static void main(String[] args) {
        System.out.println("Baraja francesa al azar");
        int tipo = (int) (Math.random()*3);
        int num = (int) (Math.random()*12);

        switch (tipo) {
            case 0:
                System.out.println("Picas");
                break;
            
            case 1:
                System.out.println("Corazones");
                break;

            case 2: 
                System.out.println("Diamonts");
                break;

            case 3:
                System.out.println("Treboles");

            default:
                System.out.println("el sistema se murio");
                break;
        }

        switch (num) {
            case 0:
                System.out.println("A");
                break;

            case 1:
                System.out.println("02");
                break;

            case 2:
                System.out.println("03");
                break;

            case 3:
                System.out.println("04");
                break;

            case 4:
                System.out.println("05");
                break;

            case 5:
                System.out.println("06");
                break;

            case 6:
                System.out.println("07");
                break;

            case 7:
                System.out.println("08");
                break;

            case 8:
                System.out.println("09");
                break;

            case 9:
                System.out.println("10");
                break;

            case 10:
                System.out.println("J");
                break;

            case 11:
                System.out.println("Q");
                break;

            case 12:
                System.out.println("K");
                break;
        
            default:
                break;
        }
    }
}