/*Ejercicio 16
Realiza un simulador de máquina tragaperras simplificada que cumpla los
siguientes requisitos:
a) El ordenador mostrará una tirada que consiste en mostrar 3 figuras. Hay 5
figuras posibles: corazón, diamante, herradura, campana y limón.
b) Si las tres figuras son diferentes se debe mostrar el mensaje “Lo siento, ha
perdido”.
c) Si hay dos figuras iguales y una diferente se debe mostrar el mensaje “Bien,
ha recuperado su moneda”.
d) Si las tres figuras son iguales se debe mostrar “Enhorabuena, ha ganado
10 monedas”.
*/

public class Eje16 {
    public static void main(String[] args) {

        int figura = 0;
        int corazon = 0;
        int diamante = 0;
        int herradura = 0;
        int campana = 0;
        int limon = 0;

        for(int i=0; i<3;i++){
            figura = (int)(Math.random()*5);
            switch (figura) {
                case 0:
                    System.out.print("corazón ");
                    corazon++;
                    break;

                case 1:
                    System.out.print("diamante ");
                    diamante++;
                    break;

                case 2:
                    System.out.print("herradura ");
                    herradura++;
                    break;

                case 3:
                    System.out.print("campana ");
                    campana++;
                    break;

                case 4:
                    System.out.print("limón ");
                    campana++;
                    break;
            
                default:
                    System.out.println("Fuera de rango");
                    break;
            }
        }

        System.out.println("");

        if(corazon==2 || diamante==2 || herradura==2 || campana==2 || limon==2){
            System.out.print("Bien, ha recuperado su moneda");
        }else if(corazon==3 || diamante==3 || herradura==3 || campana==3 || limon==3){
            System.out.print("Enhorabuena, ha ganado 10 monedas");
        }else{
            System.out.print("Lo siento, ha perdido");
        }

    }
}
