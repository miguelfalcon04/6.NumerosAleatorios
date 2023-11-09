/*Ejercicio 32
Realiza un programa que pinte un sendero aleatorio. Los bordes se pintan con
el carácter “|”. La anchura del sendero siempre es la misma, los dos caracteres
del borde más cuatro caracteres en medio, en total 6 caracteres (incluyendo
espacios). A cada metro, el sendero puede continuar recto, girar un carácter a
la izquierda o girar un carácter a la derecha, por supuesto de forma aleatoria.
Por cada metro de sendero - representado por una línea - puede que haya un
obstáculo o puede que no, la probabilidad es del 50%. La posición del obstáculo
es aleatoria dentro de la línea. En caso de existir un obstáculo en un metro de
sendero (en una línea), puede ser una planta (carácter *) o una piedra (carácter
O), la probabilidad de que salga uno u otro es la misma. Recuerda que nunca
habrá más de un obstáculo por metro de sendero, habrá uno o ninguno.
*/

public class Eje32 {
    public static void main(String[] args) {

        System.out.print("Introduzca la longitud del sendero en metros: ");
        int longitud = Integer.parseInt(System.console().readLine());

        int desplazamiento = 13;
        String pinta = "";
        int pos = 0;

        for(int i=1; i<=longitud; i++){
            boolean hay=false;
            pinta=" ";

            int probabilidad = (int)(Math.random()*2); //Probabilidad del 50% de que haya obstaculo
            switch (probabilidad) {
                case 0:
                    hay=false;
                    break;

                case 1:
                    hay=true;
                    break;
            }

            for(int k=1; k<=desplazamiento; k++){ //Pinta las espacios de delante
                System.out.print(" ");
            }

            int siguientePos = (int)(Math.random()*3); // Ve si la siguiente línea estara 1 a la izquierda, igual u otra a la derecha
            switch (siguientePos) {

                case 0:
                    desplazamiento--;
                    break;

                case 1:
                    desplazamiento++;
                    break;

                case 2:
                    break;
            }

            if(hay==true){
                int obstaculo = (int)(Math.random()*2); //Escoge que tipo de obstaculo hay
                switch (obstaculo) {
                    case 0:
                        pinta="*";
                        break;

                    case 1:
                        pinta="O";
                        break;
                }

                pos = (int)(Math.random()*4+2);
            }

            for(int j=1; j<=6; j++){ // Pinta la línea
                if(j==1 || j==6){
                    System.out.print("|");
                }else if(j==pos){
                    System.out.print(pinta);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
