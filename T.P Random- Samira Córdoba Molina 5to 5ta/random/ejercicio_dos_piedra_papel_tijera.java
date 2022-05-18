import java.util.Random;
import java.util.Scanner;

class clasificaEmpleados {

    public static void main(String[] args) {

        Scanner datos = new Scanner(System.in);

        Random juego = new Random();

        System.out.println("elija 1 = piedra, 2 = papel o 3 = tijera");
        eleccion = datos.nextInt();

        String [] maquina = new String [3];

        maquina [1] = "piedra";
        maquina [2] = "papel";
        maquina [3] = "tijera";

        eleccion2= maquina[juego.nextInt(3)];

        if (eleccion == eleccion2){
            System.out.println("Empate");

        }

        if (eleccion == "piedra" && eleccion2 == "tijera"){
            System.out.println("GANASTE");
        }

        if (eleccion == "piedra" && eleccion2 == "papel"){
            System.out.println("PERDISTE");
        }

        //piedraz

        if (eleccion == "papel" && eleccion2 == "tijera"){
            System.out.println("PERDISTE");
        }

        if (eleccion == "papel" && eleccion2 == ""){
            System.out.println("PERDISTE");
        }

        if (eleccion == "papel" && eleccion2 == "papel"){
            System.out.println("PERDISTE");
        }



    }

}