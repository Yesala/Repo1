package cr.ac.ucenfotec.EjemploVeterinaria.controlador;

import cr.ac.ucenfotec.EjemploVeterinaria.bl.logica.Gestor;
import cr.ac.ucenfotec.EjemploVeterinaria.iu.IU;

public class Controlador {

        private IU iu = new IU();
        private Gestor gestor = new Gestor();

    public void ejecutarPrograma() {
        int opcion = 0;
        do {
            iu.mostrarMenu();
            opcion = iu.leerOpcion();
            procesarOpcion(opcion);
        } while (opcion != 6);
    }

    private void procesarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                registroUsuarios();
                break;
            case 2:
                datosMascota();
                break;
            case 3:
                agendarCita();
                break;
            case 4:
                hacerReservacion();
                break;
            case 5:
                listar();
                break;
            case 6:
                break;
            default:
                iu.imprimirMensaje("Opcion desconocida");
        }
    }

    public void registroUsuarios(){
        iu.imprimirMensaje("Nombre de usuario completo");
        String nombreCompleto = iu.leerTexto();
        iu.imprimirMensaje("Indique su número de cédula: ");
        String cedula = iu.leerTexto();
        iu.imprimirMensaje("Ingrese el teléfono: ");
        String telefono = iu.leerTexto();
        iu.imprimirMensaje("Dirección/domicilio exacto: ");
        String direccion = iu.leerTexto();
        iu.imprimirMensaje("Detalle su rol: doctor/a o secretario/a");
        String rol = iu.leerTexto();
        gestor.registroUsuarios(nombreCompleto, cedula, telefono, direccion, rol);
    }

    private void datosMascota(){
        iu.imprimirMensaje("Digite el nombre de la mascota");
        String nombreMascota = iu.leerTexto();
        iu.imprimirMensaje("Digite el nombre completo del dueño de la mascota: ");
        String nombreCompleto = iu.leerTexto();
        iu.imprimirMensaje("Indique su número de cédula: ");
        String cedula = iu.leerTexto();
        iu.imprimirMensaje("Ingrese el número de teléfono: ");
        String telefono = iu.leerTexto();
        iu.imprimirMensaje("Dirección exacta: ");
        String direccion = iu.leerTexto();
        iu.imprimirMensaje("Ingrese foto de la mascota: ");
        String foto = iu.leerTexto();
        iu.imprimirMensaje("Ranking de la mascota (1/5= 1 es terrible y 5 excelente): ");
        int ranking = iu.leerEntero();
        iu.imprimirMensaje("Observaciones de la mascota: ");
        String observaciones = iu.leerTexto();
        gestor.registroMascota(nombreCompleto, nombreMascota, cedula, telefono, direccion, foto, ranking, observaciones);
        iu.imprimirMensaje("Mascota ingresada");
    }

    private void agendarCita(){
        iu.imprimirMensaje("Ingrese el nombre de las mascota: ");
        String mascot = iu.leerTexto();
        iu.imprimirMensaje("Indique la fecha (dd/MM/yyyy) de la cita: ");
        String fecha = iu.leerTexto();
        iu.imprimirMensaje("Hora de la cita: ");
        String hora = iu.leerTexto();
        iu.imprimirMensaje("Razón de la cita ");
        String observacion = iu.leerTexto();
        gestor.agendarCita(mascot,fecha, hora,observacion);

    }

    public void hacerReservacion(){
        iu.imprimirMensaje("Asigne un número de reservación: ");
        int numeroReservacion = iu.leerEntero();
        iu.imprimirMensaje("Nombre de la mascota: ");
        String nombreAnimal = iu.leerTexto();
        iu.imprimirMensaje("Día de entrada:");
        String diaEntrada = iu.leerTexto();
        iu.imprimirMensaje("Día de salida:");
        String diaSalida = iu.leerTexto();
        gestor.hacerReservacion(numeroReservacion, nombreAnimal, diaEntrada, diaSalida);
    }

    public void listar(){
        iu.imprimirMensaje("Elija la lista a imprimir: 1. Mascotas, 2. Citas, 3, Reservaciones");
        int escogencia = iu.leerEntero();

            if (escogencia == 1) {
                gestor.lista1();
                iu.imprimirMensaje("Lista de mascotas");
                for (int i = 0; i < gestor.lista1().size(); i++) {
                    iu.imprimirMensaje(gestor.lista1().get(i).toString());
                }
            }
            if (escogencia == 2) {
                gestor.lista2();
                iu.imprimirMensaje("Lista de citas");
                for (int i = 0; i < gestor.lista2().size(); i++) {
                    iu.imprimirMensaje(gestor.lista2().get(i).toString());
                }
            } else {
                gestor.lista3();
                iu.imprimirMensaje("Lista de reservaciones");
                for (int i = 0; i < gestor.lista3().size(); i++) {
                    iu.imprimirMensaje(gestor.lista3().get(i).toString());
                }
        }
    }
}


