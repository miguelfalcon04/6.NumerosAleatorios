/*Ejercicio 6
Escribe un programa que piense un número al azar entre 0 y 100. El usuario debe adivinarlo y tiene para ello 5 oportunidades. 
Después de cada intento fallido, el programa dirá cuántas oportunidades quedan y si el número introducido es
menor o mayor que el número secreto.
*/

public class Eje06 {
    public static void main(String[] args) {

        int azar = (int)(Math.random()*101);
        int oportunidades = 5;
        boolean salir=false;

        do {
            salir=false;

            System.out.print("Introduzca un número: ");
            int intento = Integer.parseInt(System.console().readLine());

            if(azar==intento){
                System.out.println("¡¡Felicidades ha ganado!!");
                salir=true;
            }else{
                oportunidades--;
                if(oportunidades<=0){
                    System.out.println("Se ha quedado sin oportunidades, el número era "+azar);
                    salir=true;
                }else{
                    if(intento>azar){
                        System.out.println("El número que busca es más chico");
                    }else{
                        System.out.println("El número que busca es más grande");
                    }
                    System.out.println("Le quedan "+oportunidades+" oportunidades");
                }
            }
            System.out.println();

        } while (salir==false);

    }
}
