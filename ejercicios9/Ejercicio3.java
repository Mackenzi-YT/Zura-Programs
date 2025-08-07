package ejercicios9;

public class Ejercicio3 {
    public static void main(String[] args) {
        int num[][] = new int[5][6];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                num[i][j] = 100 + (int)(Math.random() * 900);
            }
        }

        int sumaFila0 = num[0][0] + num[0][1] + num[0][2] + num[0][3] + num[0][4];
        int sumaFila1 = num[1][0] + num[1][1] + num[1][2] + num[1][3] + num[1][4];
        int sumaFila2 = num[2][0] + num[2][1] + num[2][2] + num[2][3] + num[2][4];
        int sumaFila3 = num[3][0] + num[3][1] + num[3][2] + num[3][3] + num[3][4];

        int sumaCol0 = num[0][0] + num[1][0] + num[2][0] + num[3][0];
        int sumaCol1 = num[0][1] + num[1][1] + num[2][1] + num[3][1];
        int sumaCol2 = num[0][2] + num[1][2] + num[2][2] + num[3][2];
        int sumaCol3 = num[0][3] + num[1][3] + num[2][3] + num[3][3];
        int sumaCol4 = num[0][4] + num[1][4] + num[2][4] + num[3][4];

        int sumaTotal = sumaFila0 + sumaFila1 + sumaFila2 + sumaFila3;

        num[0][5] = sumaFila0;
        num[1][5] = sumaFila1;
        num[2][5] = sumaFila2;
        num[3][5] = sumaFila3;

        num[4][0] = sumaCol0;
        num[4][1] = sumaCol1;
        num[4][2] = sumaCol2;
        num[4][3] = sumaCol3;
        num[4][4] = sumaCol4;
        num[4][5] = sumaTotal;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.printf("%10d", num[i][j]); 
            }
            System.out.println();
        }
    }
}
