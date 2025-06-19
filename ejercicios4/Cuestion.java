package ejercicios4;

import java.util.Scanner;

public class Cuestion {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        String respuesta1, respuesta2, respuesta3, respuesta4, respuesta5, respuesta6, respuesta7, respuesta8, respuesta9, respuesta10;
        int puntaje = 0;

        System.out.println("Este es el cuestionario hagalo plis");
        System.out.println("Pregunta 01:");
        System.out.println("Cual es el lenguaje de programacion que aprendemos en la UTEA?");
        System.out.println("a) Java     b) Python       c) C++      d) C#");
        respuesta1 = Teclado.nextLine();

        if (respuesta1.equals("a")) {
            puntaje = puntaje + 1;
        }

        System.out.println("Pregunta 02:");
        System.out.println("Que es la sentencia if?");
        System.out.println("a) Es estructura de repeticion      b) Es un tipo de variable       c) Es una estructura de control     d) Es un lenguaje de programacion");
        respuesta2 = Teclado.nextLine();

        if (respuesta2.equals("c")) {
            puntaje = puntaje +1;
        }

        System.out.println("Pregunta 03:");
        System.out.println("Que es la sentencia while?");
        System.out.println("a) Es estructura de repeticion      b) Es un tipo de variable       c) Es una estructura de control     d) Es un lenguaje de programacion");
        respuesta3 = Teclado.nextLine();

        if (respuesta3.equals("a")) {
            puntaje = puntaje +1;
        }

          System.out.println("Pregunta 04:");
        System.out.println("Que accion ejecuta un 'System.out.print'?");
        System.out.println("a) Imprime texto      b) Muestra datos matematicos       c) Crea un dialogo de error     d) Cierra el Scanner");
        respuesta4 = Teclado.nextLine();

        if (respuesta4.equals("a")) {
            puntaje = puntaje +1;
        }

        System.out.println("Pregunta 05:");
        System.out.println("Que es Eclipse?");
        System.out.println("a) Cuando el sol superpone la luna      b) Cuando la luna superpone al sol       c) Una plataforma de programacion para java     d) Un fenomeno natural");
        respuesta5 = Teclado.nextLine();

        if (respuesta5.equals("c")) {
            puntaje = puntaje +1;
        }

        System.out.println("Pregunta 06:");
        System.out.println("Que es 'SQL'?");
        System.out.println("a) Una base de datos      b) Lenguaje de programacion de base de datos       c) Crea una base de datos     d) Trabaja una base de datos");
        respuesta6 = Teclado.nextLine();

        if (respuesta6.equals("b")) {
            puntaje = puntaje +1;
        }

        System.out.println("Pregunta 07:");
        System.out.println("Que es lo primero que se realiza al programar?");
        System.out.println("a)Se definen variables      b) Se seleccciona la clase       c) Escribes los codigos y funcciones     d) Importas el Scanner");
        respuesta7 = Teclado.nextLine();

        if (respuesta7.equals("b")) {
            puntaje = puntaje +1;
        }

        System.out.println("Pregunta 08:");
        System.out.println("Que es una hoja de CSS?");
        System.out.println("a) Una hoja de diseños hecha con lenguaje de JavaScript      b) Lenguaje javaScript       c) Un diseño aplicable en todo     d) Un recurso JavaScript aplicable en Sitios Web");
        respuesta8 = Teclado.nextLine();

        if (respuesta8.equals("a")) {
            puntaje = puntaje +1;
        }

        System.out.println("Pregunta 09:");
        System.out.println("Que es JavaScript??");
        System.out.println("a) Un lenguaje de programacion      b) Una copia de Java       c) Un sitio web     d) Un lenguaje de etiquetas");
        respuesta9 = Teclado.nextLine();

        if (respuesta9.equals("d")) {
            puntaje = puntaje +1;
        }

        System.out.println("Pregunta 10:");
        System.out.println("Que hace la estructura switch?");
        System.out.println("a) Una estructura de control      b) Una estructura que permite colocar diferentes situaciones       c) Una estructura de bucle    d) Una estructura de repeticion con diferentes comandos");
        respuesta10 = Teclado.nextLine();

        if (respuesta10.equals("b")) {
            puntaje = puntaje +1;
        }

        System.out.println("Su puntaje final es: "+puntaje);
    }
}
