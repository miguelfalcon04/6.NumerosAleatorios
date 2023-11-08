/*Ejercicio 5
Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
separados por espacios. Muestra también el máximo, el mínimo y la media
de esos números.
*/

public class Eje05 {
    public static void main(String[] args) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int suma = 0;

        for(int i=0; i<50; i++){
            int n = (int)((Math.random()*100)+100);
            System.out.print(n+" ");

            if(n>max){
                max=n;
            }else if(n<min){
                min=n;
            }
            suma+=n;

        }

        System.out.println();
        System.out.println("El mayor es: "+max);
        System.out.println("El menor es: "+min);
        System.out.println("La media es: "+(float)suma/50);

    }
}
