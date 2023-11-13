/*Ejercicio 9
Realiza un programa que vaya generando números aleatorios pares entre 0
y 100 y que no termine de generar números hasta que no saque el 24. El
programa deberá decir al final cuántos números se han generado.
*/

public class Eje09 {
    public static void main(String[] args) {

        int azar = 0;
        int cont = 0;

        do {
            azar = (int)(Math.random()*101);

            if(azar%2==0){
                System.out.print(azar+" ");
                cont++;
            }
        } while (azar!=24);

        System.out.println("");
        System.out.println("Se han generado "+(cont-1)+" numeros antes de generar el 24");

    }
}
