import java.util.Random;
import java.util.Scanner;

class clasificaEmpleados {

    public static void main(String[] args) {

        Scanner datos = new Scanner(System.in);

        Random limpia = new Random();

        System.out.println("ingrese la cantidad de alumnos: ");

        String[] alumnos = new string [x];

        int x = datos.nextInt();

        for (int a = 0; a<5 ; a++){
            System.out.println("ingese los nombres de los alumnos: ");
            alumnos[a] = datos.nextLine();
        }

        System.out.printl("el alumno que debe limpiar hoy es: " + alumnos[limpia.nextInt(5)]);


        
    }

} 