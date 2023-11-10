/*Ejercicio 17
Realiza un programa que pinte por pantalla una pecera con un pececito dentro.
Se debe pedir al usuario el ancho y el alto de la pecera, que como mínimo
serán de 4 unidades. No hay que comprobar que los datos se introducen
correctamente; podemos suponer que el usuario los introduce bien. Dentro de
la pecera hay que colocar de forma aleatoria un pececito, que puede estar
situado en cualquiera de las posiciones que quedan en el hueco que forma el
rectángulo.
*/

public class Eje17 {
    public static void main(String[] args) {

        System.out.print("Por favor, introduzca la altura de la pecera (como mínimo 4): ");
        int alt = Integer.parseInt(System.console().readLine());

        System.out.print("Ahora introduzca la anchura (como mínimo 4): ");
        int ach = Integer.parseInt(System.console().readLine());

        int posAlt = (int)(Math.random()*(alt-2)+2);
        int posAch = (int)(Math.random()*(ach-2)+2);

        for(int i=1; i<=alt; i++){
            for(int j=1; j<=ach; j++){
                if(i==1 || j==1 || i==alt|| j==ach){
                    System.out.print("* ");
                }else if(i==posAlt && j==posAch){
                    System.out.print("& ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
