import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre del jugador 1: ");
        String jugador1 = sc.next();

        System.out.println("Ingrese el nombre del jugador 2: ");
        String jugador2 = sc.next();

        System.out.print("Indique su seleccion [1=Piedra, 2=Papel, 3=Tijera]: ");

        String strjugada1 ="";
        String strjugada2 ="";

        int puntajeJugador1 = 0;
        int puntajeJugador2 = 0;
        int resultado =0;


        do  {
            System.out.println("Ingrese la jugada del jugador 1: ");
            strjugada1 = sc.next();

            if (!strjugada1.equals("*"))  {
                System.out.println("Ingrese la jugada del jugador 2: ");
                strjugada2 = sc.next();

                resultado = cualGana( Integer.parseInt(strjugada1),Integer.parseInt(strjugada2));
            }

            if (resultado == 1) {
                puntajeJugador1 += 1;
            }
            else if (resultado == 2) {
                puntajeJugador2 += 1;
            }

        }
        while  (!strjugada1.equals("*")) ;


        if (puntajeJugador1>puntajeJugador2) {
            System.out.println("El ganador es: " + jugador1 + " con " + puntajeJugador1 + " puntos");
        }
            else if (puntajeJugador1<puntajeJugador2) {
            System.out.println("El ganador es: " + jugador2 + " con " + puntajeJugador2 + " puntos");
        }
            else {
            System.out.println("No hubo ganador.");
        }



    }

    public static Integer cualGana(int jugada1, int jugada2) {

        int resultado = 0;
        switch ( jugada1 ) {
            case 1:
                switch (jugada2) {
                    case 1:
                        resultado = 0;
                        break;/* piedra vs piedra */
                    case 2:
                        resultado = 2;
                        break;/* piedra vs papel */
                    case 3:
                        resultado = 1;
                        break;/* piedra vs tijera */

                }
                break;
            case 2:

                switch (jugada2) {
                    case 1:
                        resultado = 1;
                        break; /* papel vs piedra */
                    case 2:
                        resultado = 0;
                        break; /* papel vs papel */
                    case 3:
                        resultado = 2;
                        break; /* papel vs tijera */
                }
                break;
            case 3:

                switch (jugada2) {
                    case 1:
                        resultado = 2;
                        break; /* tijera vs piedra */
                    case 2:
                        resultado = 1;
                        break;/* tijera vs papel */
                    case 3:
                        resultado = 0;
                        break;/* tijera vs tijera */
                }
                break;

        };

        return resultado;
    }
}




/*
(jugada1 == "piedra" && jugada2 == "papel")


Hacé un programa que te permita jugar a “Piedra, papel o tijera”. En primer lugar, la
aplicación solicita el nombre de cada gamer, después empieza el juego. El juego consiste
en pedir qué opción elije cada uno y sumar puntos al winner —si lo hay—. Definí y utilizá
una función llamada cualGana con dos parámetros con las jugadas de cada uno, que
devuelve 0 en caso de empate, 1 si gana el primero, 2 si gana el segundo. El juego termina
cuando el primero elije “*” como indicador de final.
 */