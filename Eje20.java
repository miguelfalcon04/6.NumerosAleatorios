/*Ejercicio 20
Realiza un programa que pinte por pantalla una cuba con cierta cantidad de
agua. La capacidad será indicada por el usuario. La cuba se llenará con una
cantidad aleatoria de agua que puede ir entre 0 y la capacidad máxima que
pueda admitir. El ancho de la cuba no varía.
*/

public class Eje20 {
    public static void main(String[] args) {

        System.out.print("Por favor, indique la capacidad de la cuba en litros: ");
        int capacidad = Integer.parseInt(System.console().readLine());

        int contenido = (int)(Math.random()*(capacidad+1));

        for(int i=capacidad+1; i>=1; i--){
            for(int j=1; j<=6; j++){
                if(j==1 || j==6 || i==1){
                    System.out.print("*");
                }else if((i-1)<=contenido){
                    System.out.print("=");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.printf("La cuba tiene una capacidad de %d litros y contiene %d litros de agua",capacidad,contenido);

    }
}
