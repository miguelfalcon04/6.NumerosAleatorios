/*Ejercicio 22
Realiza un programa que pinte por pantalla una serpiente con un “serpenteo”
aleatorio. La cabeza se representará con el carácter @ y se debe colocar
exactamente en la posición 13 (con 12 espacios delante). A partir de ahí,
el cuerpo irá serpenteando de la siguiente manera: se generará de forma
aleatoria un valor entre tres posibles que hará que el siguiente carácter se
coloque una posición a la izquierda del anterior, alineado con el anterior o una
posición a la derecha del anterior. La longitud de la serpiente se pedirá por
teclado y se supone que el usuario introducirá un dato correcto.
*/

public class Eje22 {
    public static void main(String[] args) {

        System.out.print("Por favor, introduzca la longitud de la serpiente contando la cabeza: ");
        int serpi = Integer.parseInt(System.console().readLine());

        int desplazamiento = 13;

        System.out.printf("%13s\n","@");

        for(int i=1; i<=(serpi-1); i++){

            int pos = (int)(Math.random()*3);

            switch (pos) {
                case 0:
                    desplazamiento--;
                    for(int j=1; j<=desplazamiento; j++){
                        if(j==desplazamiento){
                            System.out.println("*");
                        }else{
                            System.out.print(" ");
                        }
                    }
                    break;

                case 1:
                    for(int j=1; j<=desplazamiento; j++){
                        if(j==desplazamiento){
                            System.out.println("*");
                        }else{
                            System.out.print(" ");
                        }
                    }
                    break;

                case 2:
                    desplazamiento++;
                    for(int j=1; j<=desplazamiento; j++){
                        if(j==desplazamiento){
                            System.out.println("*");
                        }else{
                            System.out.print(" ");
                        }
                    }
                    break;

                default:
                    break;
            }
        }

    }
}
