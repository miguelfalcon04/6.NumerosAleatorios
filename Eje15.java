/*Ejercicio 15
Realiza un generador de melodía con las siguientes condiciones:
a) Las notas deben estar generadas al azar. Las 7 notas son do, re, mi, fa, sol,
la y si.
b) Una melodía está formada por un número aleatorio de notas mayor o igual
a 4, menor o igual a 28 y siempre múltiplo de 4 (4, 8, 12…).
c) Cada grupo de 4 notas será un compás y estará separado del siguiente
compás mediante la barra vertical “|” (Alt + 1). El final de la melodía se marca
con dos barras.
d) La última nota de la melodía debe coincidir con la primera.
*/

public class Eje15 {
    public static void main(String[] args) {

        int melodia = 0;
        do {
            melodia = (int)(Math.random()*25+4);
        } while (melodia%4!=0);

        String primero="";

        for(int i=1; i<=melodia; i++){

            for(int j=1; j<=4; j++){

                int nota = (int)(Math.random()*7);
                String escribe = "";
                switch (nota) {
                    case 0:
                        escribe = "do ";
                        break;

                    case 1:
                        escribe = "re ";
                        break;

                    case 2:
                        escribe = "mi ";
                        break;

                    case 3:
                        escribe = "fa ";
                        break;

                    case 4:
                        escribe = "sol ";
                        break;

                    case 5:
                        escribe = "la ";
                        break;

                    case 6:
                        escribe = "si ";
                        break;

                    default:
                        System.out.println("Fuera de rango");
                    break;
                }

                if(i==1 && j==1){
                    primero=escribe;
                }

                if(i==melodia && j==4){
                    System.out.print(primero);
                }else{
                    System.out.print(escribe);
                }

                if(j==4){
                    System.out.print("| ");
                }
            }

            if(i==melodia){
                System.out.print("|");
            }

        }


    }
}
