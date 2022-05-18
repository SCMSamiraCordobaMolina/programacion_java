import static java.lang.System.out;

import java.util.Arrays;
import java.util.Scanner;

class clasificaEmpleados {

    public static void main(final String[] args) {


         final Scanner datos = new Scanner(System.in);

         final int [] numeros = new int[5];
         final int [] numeros2 = new int[5];

        for(int i=0; i<numeros.length;i++){
            System.out.println("Ingrese un numero: ");

            numeros[i] = datos.nextInt();
        }
        
        System.out.println("Cambio de lista.");

        for(int i=0; i<numeros2.length;i++){
            System.out.println("Ingrese un numero: ");

            numeros2[i] = datos.nextInt(); 
        }
         

        if(Arrays.equals(numeros, numeros2)){
            System.out.println("los numeros son iguales");
        }
        
        else{
            System.out.println("los numeros son distintos");
        }

        
       
        


        

    }

}