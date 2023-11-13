/*Ejercicio 21
Realiza un programa que genere una secuencia de cinco monedas de curso
legal lanzadas al aire. Las monedas disponibles son de 1 céntimo, 2 céntimos,
5 céntimos, 10 céntimos, 20 céntimos, 50 céntimos, 1 euro y 2 euros. Las dos
posiciones posibles son cara y cruz.
*/

public class Eje21 {
    public static void main(String[] args) {

        for(int i=0; i<5; i++){

            String imprime = "";

            switch ((int)(Math.random()*8)) {
                case 0:
                    imprime+="1 céntimo - ";
                    break;

                case 1:
                    imprime+="2 céntimos - ";
                    break;

                case 2:
                    imprime+="5 céntimos - ";
                    break;

                case 3:
                    imprime+="10 céntimos - ";
                    break;

                case 4:
                    imprime+="20 céntimos - ";
                    break;

                case 5:
                    imprime+="50 céntimos - ";
                    break;

                case 6:
                    imprime+="1 euro - ";
                    break;

                case 7:
                    imprime+="2 euros - ";
                    break;

                default:
                    System.out.println("Fuera de rango");
                    break;
            }

            switch ((int)(Math.random()*2)) {
                case 0:
                    imprime+="cara";
                    break;

                case 1:
                    imprime+="cruz";
                    break;

                default:
                    System.out.println("Fuera de rango");
                    break;
            }

            System.out.println(imprime);
        }

        
    }
}
