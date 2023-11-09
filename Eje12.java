/*Ejercicio 12
Realiza un programa que llene la pantalla de caracteres aleatorios (a lo Matrix)
con el código ascii entre el 32 y el 126. Puedes hacer casting con (char) para
convertir un entero en un carácter
*/

public class Eje12 {
    public static void main(String[] args) {

        boolean salir = false;

        do {
            salir=false;

            char caracter = (char)((Math.random()*95)+32);
            System.out.print(caracter);

        } while (salir==false);

    }
}
