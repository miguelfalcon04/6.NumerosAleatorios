/*Ejercicio 25
Escribe un programa que muestre por pantalla 100 números enteros separados
por un espacio. Los números deben estar generados de forma aleatoria en
un rango entre 10 y 200 ambos incluidos. Los primos deben aparecer entre
almohadillas (p. ej. #19#) y los múltiplos de 5 entre corchetes (p. ej. [25]).
*/

public class Eje25 {
    public static void main(String[] args) {

        boolean esPrimo = true;

        for(int i=0; i<100; i++){
            esPrimo = true;

            int n = (int)((Math.random()*191)+10);

            for(int j=2; j<n/2+1; j++){
                if(n%j==0){
                    esPrimo=false;
                }
            }

            if(esPrimo==true){
                System.out.printf("#%d# ",n);
            }else if(n%5==0){
                System.out.printf("[%d] ",n);
            }else{
                System.out.print(n+" ");
            }
        }

    }
}
