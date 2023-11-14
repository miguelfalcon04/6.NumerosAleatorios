/*Ejercicio 26
Realiza un programa que pinte una tableta de turrón con un bocado realizado de
forma aleatoria. El ancho y el alto de la tableta se pide por teclado. El bocado se
da alrededor del turrón, obviamente no se puede dar un bocado por en medio
de la tableta.
*/

public class Eje26 {
    public static void main(String[] args) {

        System.out.print("Introduzca la anchura de la tableta: ");
        int anchura = Integer.parseInt(System.console().readLine());

        System.out.print("Introduzca la altura de la tableta: ");
        int alt = Integer.parseInt(System.console().readLine());

        int posAnchura = 0;
        int posAlt = (int)((Math.random()*(alt))+1);
        if(posAlt==1 || posAlt==alt){
            posAnchura = (int)(Math.random()*(anchura)+1);
        }else{
            posAnchura = (int)(Math.random()*2);
            switch (posAnchura) {
                case 0:
                    posAnchura=1;
                    break;

                case 1:
                    posAnchura=anchura;
                    break;
            }
        }


        for(int i=1; i<=alt; i++){
            for(int j=1; j<=anchura; j++){
                if(i==posAlt && j==posAnchura){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }
}
