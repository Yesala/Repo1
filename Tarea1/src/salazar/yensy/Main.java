package salazar.yensy;

import java.io.PrintStream;
import java.util.Scanner;

import salazar.yensy.bl.*;
import salazar.yensy.ui.*;

public class Main {

    private static Scanner input= new Scanner(System.in);
    private static PrintStream output = new PrintStream(System.out);

    public static void main(String[] args) {

        UI interfaz = new UI();
        logica bl = new logica();
        int opcion =0;
        do {
            interfaz.mostrarMenu();
            opcion = input.nextInt();
        } while (opcion != 5);
    }



}
