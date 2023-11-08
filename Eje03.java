/*Ejercicio 3
Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja
de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as.
*/

public class Eje03 {
    public static void main(String[] args) {

        String carta="";

        int figura = (int)((Math.random()*10)+1);

        switch (figura) {
            case 1:
                carta="As de ";
                break;

            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                carta=figura+" de ";
                break;

            case 8:
                carta="Sota de ";
                break;

            case 9:
                carta="Caballo de ";
                break;
            case 10:
                carta="Rey de ";
                break;


            default:
                System.out.println("Fuera de rango");
                break;
        }

        int palo = (int)(Math.random()*4);

        switch (palo) {
            case 0:
                carta+="Oro";
                break;

            case 1:
                carta+="Copas";
                break;

            case 2:
                carta+="Espadas";
                break;

            case 3:
                carta+="Bastos";
                break;
        
            default:
                System.out.println("Carta fuera de rango");
                break;
        }
        System.out.println(carta);

        
    }
}
