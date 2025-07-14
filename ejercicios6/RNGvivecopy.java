public class RNGvivecopy {

    public static void main(String[] args) {
        System.out.println("Genera dia de semana");
        int mano = (int) (Math.random()*6);

        switch (mano) {
            case 0:
                System.out.println("lunes");
                break;
                
            case 1:
                System.out.println("martes");
                break;

            case 2:
                System.out.println("miercoles");
                break;

            case 3:
                System.out.println("jueves");
                break;

            case 4:
                System.out.println("Viernes");
                break;

            case 5:
                System.out.println("Sabado");
                break;

            case 6:
                System.out.println("Domingo");
                break;
                
            default:
                System.out.println("error del system");
                break;
        }
    }
}