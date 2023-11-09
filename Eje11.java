/*Ejercicio 11
Escribe un programa que muestre 20 notas generadas al azar. Las notas deben
aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente. Al
final aparecerá el número de suspensos, el número de suficientes, el número
de bienes, etc.
*/

public class Eje11 {
    public static void main(String[] args) {

        int suspenso = 0;
        int suficiente = 0;
        int bien = 0;
        int notable = 0;
        int sobresaliente = 0;

        for(int i=1; i<=20; i++){

            float notas = (float)(Math.random()*10);
            System.out.printf("%2dº nota: %.2f\n",i,notas);

            switch ((int)notas) {
                case 0:
                case 1:
                case 2:
                    suspenso++;
                    break;

                case 3:
                case 4:
                    suficiente++;
                    break;
                
                case 5:
                case 6:
                    bien++;
                    break;

                case 7:
                case 8:
                    notable++;
                    break;

                case 9:
                case 10:
                    sobresaliente++;
                    break;
            
                default:
                    System.out.println("Fuera de rango");
                    break;
            }
        }

        System.out.println();
        System.out.printf("Hay %d suspensos\n",suspenso);
        System.out.printf("Hay %d suficiente\n",suficiente);
        System.out.printf("Hay %d bienes\n",bien);
        System.out.printf("Hay %d notables\n",notable);
        System.out.printf("Hay %d sobresalientes\n",sobresaliente);

    }
}
