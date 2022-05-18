import java.util.Arrays;
import java.util.Scanner;

class si {

    public static void main(final String[] args) {

        final Scanner datos = new Scanner(System.in);

        String [] animales = new String [5];


        for(int i=0; i<animales.length; i++){
            System.out.println("Ingrese un animal: ");

            animales[i] = datos.nextLine();
        }


        String [] animales2 = Arrays.copyOf(animales, animales.length);

        for (int i=0; i<animales2.length; i++){
            System.out.println("Animales2: " + animales2[i]);
        }
        

    }
        



         

}

