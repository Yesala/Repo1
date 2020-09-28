package salazar.yensy.ui;

import java.io.PrintStream;

public class UI {

    private static PrintStream output = new PrintStream(System.out);

    public void mostrarMenu(){
        output.println("Bienvenido a la Veterinaria Moka");
        output.println("1. Registrar Mascotas");
        output.println("2. Registrar datos Personas");
        output.println("3. Lista de Mascotas");
        output.println("4. Registro de citas Veterinaria");
        output.println("5. Registro de reservaciones Hotel");
        output.println("Ingrese su opción: ");
    }

}