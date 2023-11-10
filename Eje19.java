/*Ejercicio 19
Escribe un programa que muestre 50 números enteros aleatorios comprendidos
entre el -100 y el 200 ambos incluidos y separados por espacios. Muestra luego
el máximo de los pares el mínimo de los impares y la media de todos los
números generados. 
*/

public class Eje19 {
    public static void main(String[] args) {

        int maxPar = Integer.MIN_VALUE;
        int minImpar = Integer.MAX_VALUE;
        float suma = 0;

        for(int i=0; i<50; i++){
            int n = (int)((Math.random()*301)-100);
            System.out.print(n+" ");
            suma+=n;

            if(n%2==0){
                if(n>maxPar){
                    maxPar=n;
                }
            }else{
                if(n<minImpar){
                    minImpar=n; 
                }
            }
        }

        System.out.println();
        System.out.printf("El mayor par es: %d\n",maxPar);
        System.out.printf("El menos impar es: %d\n",minImpar);
        System.out.printf("La media de todos los numeros es: %.2f",(suma/50));

    }
}
