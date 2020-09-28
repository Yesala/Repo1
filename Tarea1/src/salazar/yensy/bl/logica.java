package salazar.yensy.bl;

import salazar.yensy.entidades.CitasVet;
import salazar.yensy.entidades.Mascotas;
import salazar.yensy.entidades.Persona;
import salazar.yensy.entidades.ReservaHotel;

import java.io.PrintStream;
import java.util.Objects;
import java.util.Scanner;

public class logica {

    private static Scanner input= new Scanner(System.in);
    private static PrintStream output = new PrintStream(System.out);

    private static Mascotas[] arregloDeMascotas = new Mascotas [100];
    private static Persona[] arregloDePersonas = new Persona [100];
    private static CitasVet[] arregloCitasVeterinaria = new CitasVet [50];
    private static ReservaHotel[] arregloReservasHotel = new ReservaHotel [50];

    private static int nextPosicion = 0;

    private static void procesarOpcion(int opcion) {
        switch (opcion){
            case 1:
                output.println("Nombre de la mascota: ");
                String nombrePet = input.next();
                if (Objects.equals(arregloDeMascotas, nombrePet)) {
                    output.println("Este nombre ya existe, intente otro nombre");
                }else{
                    output.println("El nombre se agregó exitosamente");
                }
                output.println("Nombre del dueño de la mascota: ");
                String duenoNombre = input.next();
                output.println("Ranking de estrellas de la mascota: 1/2/3 estrellas");
                String ranking = input.next();
                output.println("Observaciones: ");
                String observaciones = input.next();
                output.println("Foto de la mascota: ");
                String foto = input.next();
                Mascotas nuevaMascota = new Mascotas(nombrePet, duenoNombre, ranking, observaciones, foto);
                arregloDeMascotas[nextPosicion++]=nuevaMascota;
                break;
            case 2:
                output.println("Nombre y apellidos de la persona: ");
                String nombre = input.next();
                if (Objects.equals(arregloDePersonas, nombre)) {
                    output.println("Este nombre ya existe, ingrese otro nombre");
                }else{
                    output.println("El nombre se agregó exitosamente");
                }
                output.println("Número de cédula: ");
                int cedula = input.nextInt();
                output.println("Número de teléfono: ");
                int telefono = input.nextInt();
                output.println("Dirección: ");
                String direccion = input.next();
                output.println("Ingrese el rol de la persona: Doctor, Secretaria, Dueño");
                String roll = input.next();
                output.println("Estado del usuario: Activo o Inactivo ");
                String estado = input.next();
                Persona nuevaPersona = new Persona(nombre, cedula, telefono, direccion, roll, estado);
                arregloDePersonas[nextPosicion++]=nuevaPersona;
                break;
            case 3:
                output.println("Lista de mascotas de la veterinaria: ");
                for ( int i =0; i < arregloDeMascotas.length; i++){
                    output.println("#" + (i+1) + " " + arregloDeMascotas[i]);
                }
                break;
            case 4:
                output.println("Nombre de la mascota ");
                nombrePet = input.next();
                output.println("Fecha de la cita: ");
                String fechaCita = input.next();
                output.println("Hora de la cita: ");
                String horaCita = input.next();
                output.println("Asunto de la cita: ");
                String observacionesCita = input.next();
                CitasVet nuevaCita = new CitasVet(nombrePet, fechaCita, horaCita, observacionesCita);
                arregloCitasVeterinaria[nextPosicion++]=nuevaCita;
                break;
            case 5:
                output.println("Nombre de la mascota ");
                nombrePet = input.next();
                output.println("Fecha de entrada / Check in: ");
                String fechaEntrada = input.next();
                output.println("Fecha de salida / Check out: ");
                String fechaSalida = input.next();
                ReservaHotel nuevaReserva = new ReservaHotel(nombrePet, fechaEntrada, fechaSalida);
                arregloReservasHotel[nextPosicion++]=nuevaReserva;
                break;
            case 6:
                break;
            default:
                output.println("Opción desconocida");
        }

    }

}

