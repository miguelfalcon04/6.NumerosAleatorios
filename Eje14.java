/*Ejercicio 14
Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6. El
programa intentará adivinar el número que estás pensando - un número entre 0
y 100 - teniendo para ello 5 oportunidades. En cada intento fallido, el programa
debe preguntar si el número que estás pensando es mayor o menor que el que
te acaba de decir.
*/

public class Eje14 {
    public static void main(String[] args) {

        int intentos = 5;
        int rango = 101;
        int desplazo = 0;
        boolean salir = false;

        do {
            salir = false;

            int n = (int)(Math.random()*rango+desplazo);

            System.out.println();
            System.out.print("¿Estas pensando en el "+n+"? (1. Si/ 2. No): ");
            int opc = Integer.parseInt(System.console().readLine());

            if(opc==1){
                System.out.printf("He acertado el numero en %d intentos",(5-intentos));
                salir=true;

            }else if(opc==2){
                intentos--;

                if(intentos>0){

                    System.out.println("Me quedan "+intentos+" intentos");
                    System.out.println();
                    System.out.print("¿Estoy buscando un número mayor o menor?: (1. Mayor/ 2. Menor):");
                    opc = Integer.parseInt(System.console().readLine());
                    
                    if(opc==1){
                        desplazo = n;
                        rango=101-n;
                    }else if(opc==2){
                        desplazo=0;
                        rango=n;
                    }else{
                        System.out.print("Introduzca una opción válida, forzando salida del programa...");
                        break;
                    }

                }else{
                    System.out.println("Me he quedado sin intentos");
                    salir=true;
                }

            }else{
                System.out.println("Introduzca una opción válida, forzando salida del programa...");
                break;
            }

        } while (salir==false);

    }
}
