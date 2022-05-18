import java.util.Arrays;
import java.util.Scanner;

class si {

    public static void main(final String[] args) {

        final Scanner datos = new Scanner(System.in);

        /* tipo de datos: string */

        final String [] animales = new String [5];


        for(int i=0; i<animales.length; i++){
            System.out.println("Ingrese un animal: ");

            animales[i] = datos.nextLine();
        }


        final String [] animales2 = Arrays.copyOf(animales, animales.length);

        for(int i=0 ; i<animales2.length; i++){
            System.out.println("Animales dos: " + animales2[i]);
        }


        /* tipo de datos: int -FUNCIONA- */

        System.out.println("ingrese un numero a sumar");

        int numero = datos.nextInt();

        System.out.print("ingrese otro numero para sumar");

        int numero2 = datos.nextInt();

        int resultado = numero + numero2;

        System.out.println("El resultado de la suma: " + resultado);


        /* tipo de datos: float  FUNCIONA*/

        System.out.println("Ingrese un precio: ");
         
         float precios = datos.nextFloat();

        float nuevoPrecio = (precios * 21)/100 + precios;

        System.out.println("precio + iva es: " + nuevoPrecio);


            /* tipo de datos: double FUNCIONA */

            System.out.println("ingrese la nota de literatura: ");

            double nota_literatura = datos.nextDouble();
    
            System.out.println("ingrese la nota de matematica: ");
    
            double nota_matematica = datos.nextDouble();
    
            System.out.println("ingrese la nota de quimica: ");
    
            double nota_quimica = datos.nextDouble();
    
            double promedio = (nota_literatura + nota_matematica + nota_quimica) / 3;
    
            System.out.println("El promedio entre esas materias es: " + promedio);


            /* tipos de datos: char */

            final char [] dni = new char [1];


            for (int i = 0 ; i<dni.length; i++ ){
                System.out.println("Ingrese su DNI: ");
                 dni[i] =  (char) datos.nextInt();
                System.out.println("Su DNI es: " + dni[i]);


 
        

    }

}
