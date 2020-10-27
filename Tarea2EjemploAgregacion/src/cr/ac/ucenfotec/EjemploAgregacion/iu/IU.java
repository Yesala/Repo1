package cr.ac.ucenfotec.EjemploAgregacion.iu;

import java.io.PrintStream;
import java.util.Scanner;

public class IU {

    private PrintStream output = new PrintStream(System.out);
    private Scanner input = new Scanner(System.in).useDelimiter("\n");

    public void mostrarMenu() {
        output.println("Bienvenido: escoja una opcion:");
        output.println("1. Agregar serie y número de cilindros de motor ");
        output.println("2. Agregar número de serie y marca del vehículo");
        output.println("3. Listar vehículo y datos motor");
        output.println("4. Salir");
    }

    public int leerOpcion() {
        output.println("Su opcion es: ");
        return input.nextInt();
    }

    public void imprimirMensaje(String mensaje) {
        output.println(mensaje);
    }

    public String leerTexto() {
        return input.next();
    }
}
