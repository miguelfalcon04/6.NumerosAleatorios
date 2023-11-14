/*Ejercicio 24
Escribe un programa que, dado un número introducido por teclado, elija al azar
uno de sus dígitos.
*/

public class Eje24 {
    public static void main(String[] args) {

        System.out.print("Por favor, introduzca un número entero positivo: ");
        int n = Integer.parseInt(System.console().readLine());
        int guarda = n;

        int longitud = 0;
        do {
            n/=10;
            longitud++;
        } while (n>0);

        int aleatorio = (int)(Math.random()*longitud);
        int pos = -1;
        int cifra = 0;
        do {
            cifra = guarda%10;
            guarda/=10;
            pos++;
        } while (aleatorio!=pos);
        System.out.print(cifra);

    }
}
