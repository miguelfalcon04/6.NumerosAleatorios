/*Ejercicio 18
Sinestesio y Casilda van a pintar los tres dormitorios de su casa, quieren
sustituir el color blanco por colores más alegres. Realiza un programa que
genere de forma aleatoria una secuencia de tres colores aleatorios (uno para
cada dormitorio) de tal forma que no se repita ninguno. Los colores entre los que
debe elegir el programa son los siguientes: rojo, azul, verde, amarillo, violeta y
naranja.
*/

public class Eje18 {
    public static void main(String[] args) {

        int cont = 0;
        String imprime = "";

        boolean rojo=false;
        boolean azul=false;
        boolean verde=false;
        boolean amarillo=false;
        boolean violeta=false;
        boolean naranja=false;

        do {
            int color = (int)(Math.random()*6);

            switch (color) {
                case 0:
                    if(rojo!=true){
                    rojo=true;
                    imprime+= "rojo ";
                    cont++;
                    }
                    break;

                case 1:
                    if(azul!=true){
                        azul=true;
                        imprime+="azul ";
                        cont++;
                    }
                    break;

                case 2:
                    if(verde!=true){
                        verde=true;
                        imprime+="verde ";
                        cont++;
                    }
                    break;

                case 3:
                    if(amarillo!=true){
                        amarillo=true;
                        imprime+="amarillo ";
                        cont++;
                    }
                    break;

                case 4:
                    if(violeta!=true){
                        violeta=true;
                        imprime+="violeta ";
                        cont++;
                    }
                    break;

                case 5:
                    if(naranja!=true){
                        naranja=true;
                        imprime+="naranja ";
                        cont++;
                    }
                    break;

                default:
                    System.out.println("Fuera de rango");
                    break;
            }
        } while (cont<3);

        System.out.print(imprime);

    }
}
