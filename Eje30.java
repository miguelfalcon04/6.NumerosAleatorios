/*Ejercicio 30
El pequeño Roberto tenía como mascota un pececillo dentro de una pecera. Los
Reyes Magos le han traído un caballito de mar ($) y una caracola (@) para que
le hagan compañía al pez. Realiza un programa que pinte por pantalla la pecera
con los tres animalitos acuáticos colocados dentro en posiciones aleatorias. Por
una cuestión de física elemental, ninguno de los animales puede coincidir
en la misma posición. Se debe pedir al usuario el ancho y el alto de la pecera,
que como mínimo serán de 4 unidades.
*/

public class Eje30 {
    public static void main(String[] args) {

        System.out.print("Dime la altura de la pecera(4 como minimo): ");
        int alt = Integer.parseInt(System.console().readLine());
        System.out.print("Dime la anchura de la pecera(4 como minimo): ");
        int anc = Integer.parseInt(System.console().readLine());

        int posCab;
        int posPez;
        int posCar;
        do{
            posCab = (int)(Math.random()*(anc-2)*(alt-2));
            posPez = (int)(Math.random()*(anc-2)*(alt-2));
            posCar = (int)(Math.random()*(anc-2)*(alt-2));
        }while((posCab == posPez) || (posPez == posCar) || (posCar == posCab));

        int puesto = 0;
        for(int i = 1; i<=anc; i++){
            System.out.print("* ");
        }
        System.out.println("");
        for(int i = 1; i<=alt-2; i++){
            System.out.print("* ");
            for(int j = 1; j<=anc-2; j++){
                if(posCab == puesto){
                    System.out.print("$ ");
                }else if(posPez == puesto){
                    System.out.print("& ");
                }else if(posCar == puesto){
                    System.out.print("@ ");
                }else{
                    System.out.print("  ");
                }
                puesto++;
            }
            System.out.println("* ");
        }
        
        for(int i = 1; i<=anc; i++){
            System.out.print("* ");
        }
        System.out.println("");

    }
}
