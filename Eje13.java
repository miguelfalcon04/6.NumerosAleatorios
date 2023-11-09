/*Ejercicio 13
Escribe un programa que simule la tirada de dos dados. El programa deberá
continuar tirando los dados una y otra vez hasta que en alguna tirada los dos
dados tengan el mismo valor.
*/

public class Eje13 {
    public static void main(String[] args) {

        int dado1 = 0;
        int dado2 = 0;
        int cont=1;

        do {

            dado1 = (int)(Math.random()*6+1);
            dado2 = (int)(Math.random()*6+1);

            System.out.println(cont+"º:");
            System.out.printf("Dado 1: %d\n",dado1);
            System.out.printf("Dado 2: %d\n\n",dado2);
            cont++;

        } while (dado1!=dado2);
        
    }
}
