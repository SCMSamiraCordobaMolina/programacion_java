import java.util.Arrays;
import java.util.Scanner;

class si {

    public static void main(final String[] args) {


         final Scanner datos = new Scanner(System.in);

         final int [] numeros = new int[5];

        for(int i=0; i<numeros.length;i++){
            System.out.println("Ingrese un numero: ");

            numeros[i] = datos.nextInt();
        }

        Arrays.sort(numeros);

        for(int i=0; i<numeros.length; i++){
            System.out.println("Numeros ordenados: " + numeros[i]);
        }
        
         

    }

}