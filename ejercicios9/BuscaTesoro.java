package ejercicios9;

import java.util.Scanner;

public class BuscaTesoro {
    public static void main(String[] args) {
        int[][] mapa = new int[5][4];
        final int MINA = 1;
        final int TESORO = 2;
        final int INTENTO = 3;

        int minaX = (int)(Math.random() * 5);
        int minaY = (int)(Math.random() * 4);

        int tesoroX, tesoroY;

        do {
            tesoroX = (int)(Math.random() * 5);
            tesoroY = (int)(Math.random() * 4);
        } while ((minaX == tesoroX) && (minaY == tesoroY));

        mapa[minaX][minaY] = MINA;
        mapa[tesoroX][tesoroY] = TESORO;

        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            for (int y = 3; y >= 0; y--) {
                for (int x = 0; x < 5; x++) {
                    if (mapa[x][y] == INTENTO) {
                        System.out.print("X ");
                    } else {
                        System.out.print(". ");
                    }
                }
                System.out.println();
            }

            System.out.print("Coordenada x: ");
            int x = sc.nextInt();
            System.out.print("Coordenada y: ");
            int y = sc.nextInt();

            if (mapa[x][y] == MINA) {
                System.out.println("¡Boom! ¡Has perdido!");
                salir = true;
            } else if (mapa[x][y] == TESORO) {
                System.out.println("¡Felicidades! ¡Has encontrado el tesoro!");
                salir = true;
            } else {
                mapa[x][y] = INTENTO;
                boolean minaCerca = false;

                for (int i = x - 1; i <= x + 1; i++) {
                    for (int j = y - 1; j <= y + 1; j++) {
                        if (i >= 0 && i < 5 && j >= 0 && j < 4) {
                            if (mapa[i][j] == MINA) {
                                minaCerca = true;
                            }
                        }
                    }
                }

                if (minaCerca) {
                    System.out.println("¡Cuidado! ¡Hay una mina cerca!");
                }
            }
        }

        for (int y = 3; y >= 0; y--) {
            for (int x = 0; x < 5; x++) {
                switch (mapa[x][y]) {
                    case MINA:
                        System.out.print("* ");
                        break;
                    case TESORO:
                        System.out.print("€ ");
                        break;
                    case INTENTO:
                        System.out.print("X ");
                        break;
                    default:
                        System.out.print(". ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
