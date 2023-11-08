/*Ejercicio 7
Escribe un programa que muestre tres apuestas de la quiniela en tres columnas
para los 14 partidos y el pleno al quince (15 filas).
*/

public class Eje07 {
    public static void main(String[] args) {
        System.out.println("Este programa te muestra las apuestas de tres quinielas");

        for(int i=1;i<=14;i++){

            System.out.printf("%-3s |",i);

                for(int j=1;j<=3;j++){

                int resultado= (int)(Math.random()*3+1);
                switch(resultado){
                    case 1:
                    System.out.print("1  |");
                    break;
                    case 2:
                    System.out.print(" X |" );
                    break;
                    case 3:
                    System.out.print("  2|");
                    break;
                }
        
            }
            System.out.println("");

            
        }

        int goles1=(int)(Math.random()*4);
        int goles2=(int)(Math.random()*4);
        String resultadoLocal="";
        String resultadoVisitante="";

        if(goles1==3){
            resultadoLocal="3 o mas";
        }else{
            resultadoLocal= String.valueOf(goles1);
        }
        
        if(goles2==3){
            resultadoVisitante="3 o mas";
        }else{
            resultadoVisitante= String.valueOf(goles2);
        }
        
        System.out.println();
        System.out.println("Pleno al 15 - Local: "+resultadoLocal+" goles y el Visitante : "+resultadoVisitante+" goles");        
    }
}
