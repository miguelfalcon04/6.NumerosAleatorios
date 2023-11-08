/*Ejercicio 1
Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
también la suma total (los puntos que suman entre los tres dados).
*/

public class Eje01{
    public static void main(String[] args) {

        int suma=0;

        for(int i=0; i<3; i++){
            System.out.printf("Tirada del %d dado: ",(i+1));
            int dado = (int)((Math.random()*6)+1);
            System.out.println(dado);
            suma+=dado;
        }
        System.out.println("La suma total es de "+suma);
    }
}