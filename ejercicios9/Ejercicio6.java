package ejercicios9;

public class Ejercicio6 {
    public static void main(String[] args) {
        int num[][] = new int[6][10];
        int[] usados = new int[60];
        int cantidad = 0;

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 10; j++) {
                boolean repetido;
                int n;

                do {
                    repetido = false;
                    n = (int)(Math.random() * 1001);
                    for (int k = 0; k < cantidad; k++) {
                        if (usados[k] == n) {
                            repetido = true;
                            break;
                        }
                    }
                } while (repetido);

                num[i][j] = n;
                usados[cantidad] = n;
                cantidad++;
            }
        }

        int max = num[0][0];
        int min = num[0][0];
        int filaMax = 0;
        int colMax = 0;
        int filaMin = 0;
        int colMin = 0;

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 10; j++) {
                if (num[i][j] > max) {
                    max = num[i][j];
                    filaMax = i;
                    colMax = j;
                }
                if (num[i][j] < min) {
                    min = num[i][j];
                    filaMin = i;
                    colMin = j;
                }
            }
        }

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%6d", num[i][j]);
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Máximo: " + max + " en [" + filaMax + "][" + colMax + "]");
        System.out.println("Mínimo: " + min + " en [" + filaMin + "][" + colMin + "]");
    }
}
