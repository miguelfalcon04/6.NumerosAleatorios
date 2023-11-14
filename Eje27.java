/*Ejercicio 27
Implementa el juego piedra, papel y tijera. Primero, el usuario introduce su
jugada y luego el ordenador genera al azar una de las opciones. Si el usuario
introduce una opción incorrecta, el programa deberá mostrar un mensaje de
error.
*/

public class Eje27 {
    public static void main(String[] args) {

        System.out.print("Turno del jugador (Introduzca piedra, papel o tijera): ");
        String jugada = System.console().readLine();

        int ordenador = (int)(Math.random()*3);
        System.out.print("Turno del ordenador: ");
        switch (ordenador) {
            case 0: //Piedra
                System.out.print("piedra");
                ordenador=1;
                break;

            case 1: //Papel
                System.out.print("papel");
                ordenador=2;
                break;

            case 2: //Tijera
                System.out.print("tijera");
                ordenador=3;
                break;
        }
        System.out.println();

        int jugador=0;
        switch (jugada) {
            case "piedra":
                jugador=1;
                if(ordenador==jugador){
                    System.out.println("Empate");
                }else if(ordenador==3 && jugador==1){
                    System.out.println("Gana el jugador");
                }else{
                    System.out.print("Gana el ordenador");
                }
                break;

            case "papel":
                jugador=2;
                if(ordenador==jugador){
                    System.out.println("Empate");
                }else if(ordenador==1 && jugador==2){
                    System.out.println("Gana el jugador");
                }else{
                    System.out.print("Gana el ordenador");
                }
                break;

            case "tijera":
                jugador=3;
                if(ordenador==jugador){
                    System.out.println("Empate");
                }else if(ordenador==2 && jugador==3){
                    System.out.println("Gana el jugador");
                }else{
                    System.out.print("Gana el ordenador");
                }
                break;
        
            default:
                System.out.print("Introduzca una opción válida");
                break;
        }
        
    }
}
