/*Ejercicio 8
Modifica el programa anterior para que la probabilidad de que salga un 1 sea
de 1/2, la probabilidad de que salga x sea de 1/3 y la probabilidad de que salga
2 sea de 1/6. Pista: 1/2 = 3/6 y 1/3 = 2/6.
*/

public class Eje08 {
    public static void main(String[] args) {

        System.out.println("Este programa te muestra las apuestas de tres quinielas");

        for(int i=1;i<=14;i++){

            System.out.printf("%-3s |",i);

                for(int j=1;j<=3;j++){

                int resultado= (int)(Math.random()*6+1);
                switch(resultado){
                    case 1:
                    
                    case 2:

                    case 3:
                    System.out.print("1  |");
                    break;

                    case 4:
                    
                    case 5:
                    System.out.print(" X |" );
                    break;
                    case 6:
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
