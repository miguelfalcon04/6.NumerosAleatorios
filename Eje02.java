/*Ejercicio 2
Realiza un programa que muestre al azar el nombre de una carta de la baraja
francesa. Esta baraja está dividida en cuatro palos: picas, corazones, diamantes
y tréboles. Cada palo está formado por 13 cartas, de las cuales 9 cartas son
numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que sería el
1). Para convertir un número en una cadena de caracteres podemos usar String.valueOf(n)
*/

public class Eje02 {
    public static void main(String[] args) {

        String carta="";

        int figura = (int)((Math.random()*13)+1);

        switch (figura) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                carta=figura+" de ";
                break;

            case 1:
                carta="A de ";
                break;

            case 11:
                carta="J de ";

            case 12:
                carta="Q de ";
                break;

            case 13:
                carta="K de ";
                break;
        
            default:
                System.out.println("Fuera de rango");
                break;
        }

        int palo = (int)(Math.random()*4);

        switch (palo) {
            case 0:
                carta+="Picas";
                break;

            case 1:
                carta+="Corazones";
                break;

            case 2:
                carta+="Diamantes";
                break;

            case 3:
                carta+="Tréboles";
                break;
        
            default:
                System.out.println("Carta fuera de rango");
                break;
        }
        System.out.println(carta);
    }
}
