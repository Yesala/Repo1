package cr.ac.ucenfotec.EjemploVeterinaria.iu;

import java.io.PrintStream;
import java.util.Scanner;

public class IU {

        private PrintStream output = new PrintStream(System.out);
        private Scanner input = new Scanner(System.in).useDelimiter("\n");

        public void mostrarMenu() {
            output.println("Bienvenido a la Veterinaria Moka");
            output.println("1. Ingresar datos de usuario.");
            output.println("2. Registrar mascota.");
            output.println("3. Hacer una nueva cita.");
            output.println("4. Hacer una reservación en el Hotel.");
            output.println("5. Imprimir listas de mascotas, citas o reservaciones.");
            output.println("6. Salir.");
        }

        public int leerOpcion() {
            output.println("Opción seleccionada: ");
            return input.nextInt();
        }

        public void imprimirMensaje(String mensaje) {
            output.println(mensaje);
        }

        public String leerTexto() {
            return input.next();
        }

        public int leerEntero(){return input.nextInt();}
}