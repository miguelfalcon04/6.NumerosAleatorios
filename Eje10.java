/*Ejercicio 10
Realiza un programa que pinte por pantalla diez líneas formadas por caracteres.
El carácter con el que se pinta cada línea se elige de forma aleatoria entre uno
de los siguientes: *, -, =, ., |, @. Las líneas deben tener una longitud aleatoria
entre 1 y 40 caracteres.
*/

public class Eje10 {
    public static void main(String[] args) {

        String pinta = "";

        for(int i=0; i<10; i++){

            int caracter = (int)(Math.random()*6);
            switch (caracter) {
                case 0:
                    pinta="*";
                    break;

                case 1:
                    pinta="-";
                    break;

                case 2:
                    pinta="=";
                    break;

                case 3:
                    pinta=".";
                    break;

                case 4:
                    pinta="|";
                    break;

                case 5:
                    pinta="@";
                    break;

                default:
                    System.out.println("Fuera de rango");
                    break;
            }

            int longitud = (int)((Math.random()*40)+1);

            System.out.printf("%2d: ",(i+1));
            for(int j=0; j<longitud; j++){
                System.out.print(pinta);
            }
            System.out.println();

        }
    }
}
