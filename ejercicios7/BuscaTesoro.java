package ejercicios7;
public class BuscaTesoro {

  public static void main(String[] args) {
        //
 //* Minijuego "Busca el tesoro"
 //*
 //* Se colocan una mina y un tesoro de forma aleatoria en un cuadrante de
 //* cuatro filas por cinco columnas. El usuario intentará averiguar dónde
 //* está el tesoro.
 //*
 //* @author Luis José Sánchez
 //*/


    final int VACIO = 0;
    final int MINA = 1;
    final int TESORO = 2;
    final int INTENTO = 3;

    int x, y;
    int[][] cuadrante = new int[5][4];

    // Inicializa el array
    for (x = 0; x < 5; x++) {
      for (y = 0; y < 4; y++) {
        cuadrante[x][y] = VACIO;
      }
    }

    // Coloca la mina
    int minaX = (int)(Math.random() * 5);
    int minaY = (int)(Math.random() * 4);
    cuadrante[minaX][minaY] = MINA;

    // Coloca el tesoro en una posición diferente a la de la mina
    int tesoroX, tesoroY;
    do {
      tesoroX = (int)(Math.random() * 5);
      tesoroY = (int)(Math.random() * 4);
    } while (minaX == tesoroX && minaY == tesoroY);
    cuadrante[tesoroX][tesoroY] = TESORO;

    // Juego
    System.out.println("¡BUSCA EL TESORO!");
    boolean salir = false;
    String c = "";

    do {
      // Muestra el cuadrante
      for (y = 3; y >= 0; y--) {
        System.out.print(y + "|");
        for (x = 0; x < 5; x++) {
          if (cuadrante[x][y] == INTENTO) {
            System.out.print("X ");
          } else {
            System.out.print("  ");
          }
        }
        System.out.println();
      }
      System.out.println("  ----------\n   0 1 2 3 4\n");

      // Pide las coordenadas al usuario
      System.out.print("Coordenada x: ");
      x = Integer.parseInt(System.console().readLine());
      System.out.print("Coordenada y: ");
      y = Integer.parseInt(System.console().readLine());

      // Evalúa la posición elegida
      switch (cuadrante[x][y]) {
        case VACIO:
          cuadrante[x][y] = INTENTO;
          break;
        case MINA:
          System.out.println("Lo siento, has perdido.");
          salir = true;
          break;
        case TESORO:
          System.out.println("¡Enhorabuena! ¡Has encontrado el tesoro!");
          salir = true;
          break;
        default:
      }
    } while (!salir);

    // Muestra el resultado final del cuadrante
    for (y = 3; y >= 0; y--) {
      System.out.print(y + " ");
      for (x = 0; x < 5; x++) {
        switch (cuadrante[x][y]) {
          case VACIO:
            c = "  ";
            break;
          case MINA:
            c = "* ";
            break;
          case TESORO:
            c = "€ ";
            break;
          case INTENTO:
            c = "X ";
            break;
          default:
        }
        System.out.print(c);
      }
      System.out.println();
    }
    System.out.println("  ----------\n   0 1 2 3 4\n");
  }
}