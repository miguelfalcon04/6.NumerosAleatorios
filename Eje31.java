/*Ejercicio 31
Realiza el juego del “Craps”. Las reglas son las siguientes: Al comenzar la
partida, el jugador introduce la cantidad de dinero que quiere apostar. Se
muestra la tirada aleatoria de dos dados. Si entre los dos dados suman 7 u
11, el jugador gana la misma cantidad que apostó y termina la partida. Por ej.
si apostó 1000 €, gana otros 1000 € y acaba con 2000 €. Si entre los dos dados
suman 2, 3 o 12, el jugador pierde todo su dinero y termina la partida. Si no se
da ninguno de los casos anteriores, es decir si sale 4, 5, 6, 8, 9 o 10, el juego
entra en una segunda etapa. En esta etapa, el jugador buscará volver a obtener
ese número en los dados. Si consigue repetir ese número, gana. Si sale un 7,
pierde. Si sale otro número, tiene que seguir tirando.
*/

public class Eje31 {
    public static void main(String[] args) {

        System.out.print("Cantidad de dinero que desea apostar: ");
        int dinero = Integer.parseInt(System.console().readLine());

        boolean salir = false;

        do {
            salir = false;
            int suma = 0;

            int dado1 = (int)(Math.random()*6+1);
            int dado2 = (int)(Math.random()*6+1);
            System.out.println("Dado 1: "+dado1);
            System.out.println("Dado 2: "+dado2);
            suma = dado1+dado2;
            System.out.println("Suma: "+suma);
            System.out.println();

            switch (suma) {
                case 7:
                case 11:
                    System.out.print("Gana otros "+dinero+"$ y acaba con ");
                    dinero+=dinero;
                    System.out.print(dinero+"$");
                    salir=true;
                    break;

                case 2:
                case 3:
                case 12:
                    System.out.print("Pierde todo su dinero");
                    salir = true;
                    break; 

                default:
                    do { 
                        dado1 = (int)(Math.random()*6+1);
                        dado2 = (int)(Math.random()*6+1);
                        System.out.println("Dado 1: "+dado1);
                        System.out.println("Dado 2: "+dado2);
                        int suma2 = dado1+dado2;
                        System.out.println("Suma: "+suma2);

                        if(suma==suma2){
                            System.out.print("Gana otros "+dinero+"$ y acaba con ");
                            dinero+=dinero;
                            System.out.print(dinero+"$");
                            salir=true;
                        }else if(suma2==7){
                            System.out.print("Pierde todo su dinero");
                            salir = true;
                        }
                        System.out.println();
                    } while (salir==false);
                    break;
            }
        } while (salir==false);

    }
}
