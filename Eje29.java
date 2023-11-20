/*Ejercicio 29
Realiza un programa que muestre la previsión del tiempo para mañana en
Málaga. Las temperaturas máxima y mínima se deben generar de forma
aleatoria entre los intervalos máximos y mínimos absolutos medidos en las
últimas décadas para cada estación. La probabilidad de que esté soleado
o nublado en cada estación se proporciona a continuación. Obviamente, la
temperatura mínima deberá ser menor o igual que la temperatura máxima.
*/



public class Eje29 { 
    public static void menu(){
    System.out.println("1. Primavera");
    System.out.println("2. Verano");
    System.out.println("3. Otoño");
    System.out.println("4. Invierno");
    System.out.print("Seleccione la estación del año (1-4): "); 
}
    public static void main(String[] args) {
        menu();
        int opc = Integer.parseInt(System.console().readLine());

        int desplazamiento = 0;
        int tempMin = 0;
        int tempMax = 0;
        int solNube = 0;
        String solNubeS = "";

        switch (opc) {
            case 1:
                tempMin = (int)((Math.random()*16)+15);
                desplazamiento=tempMin;
                tempMax = (int)((Math.random()*(31-desplazamiento))+desplazamiento);
                solNube = (int)(Math.random()*10);
                switch (solNube) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        solNubeS = "Soleado";
                        break; 
                    
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        solNubeS = "Nublado";
                        break;
                }
                break;

            case 2:
                tempMin = (int)((Math.random()*21)+25);
                desplazamiento=tempMin;
                tempMax = (int)((Math.random()*(46-desplazamiento))+desplazamiento);
                solNube = (int)(Math.random()*10);
                switch (solNube) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        solNubeS = "Soleado";
                        break; 
                    
                    case 8:
                    case 9:
                        solNubeS = "Nublado";
                        break;
                }
                break;

            case 3:
                tempMin = (int)((Math.random()*11)+20);
                desplazamiento=tempMin;
                tempMax = (int)((Math.random()*(31-desplazamiento))+desplazamiento);
                solNube = (int)(Math.random()*10);
                switch (solNube) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                        solNubeS = "Soleado";
                        break; 

                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        solNubeS = "Nublado";
                        break;
                }
                break;

            case 4:
                tempMin = (int)((Math.random()*26));
                desplazamiento=tempMin;
                tempMax = (int)((Math.random()*(26-desplazamiento))+desplazamiento);
                solNube = (int)(Math.random()*10);
                switch (solNube) {
                    case 0:
                    case 1:
                        solNubeS = "Soleado";
                        break; 

                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        solNubeS = "Nublado";
                        break;
                }
                break;
        }

        System.out.println();
        System.out.println("Previsión del tiempo para mañana");
        System.out.println("--------------------------------");
        System.out.printf("Temperatura mínima : %2dºC\n",tempMin);
        System.out.printf("Temperatura máxima : %2dºC\n",tempMax);
        System.out.printf("%s\n",solNubeS);

    }
}
