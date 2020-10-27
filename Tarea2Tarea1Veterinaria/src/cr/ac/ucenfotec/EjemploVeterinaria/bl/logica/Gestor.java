package cr.ac.ucenfotec.EjemploVeterinaria.bl.logica;

import cr.ac.ucenfotec.EjemploVeterinaria.bl.entidades.*;
import cr.ac.ucenfotec.EjemploVeterinaria.iu.IU;

import java.util.ArrayList;

public class Gestor {

    private IU iu = new IU();
    private static boolean activo = true;
    private ArrayList<DatosMascota> mascotas;
    private ArrayList<Usuario> usuarios;
    private ArrayList<Cita> citas;
    private ArrayList<Reservacion> reservaciones;

    public Gestor (){
        this.citas = new ArrayList<>();
        this.reservaciones = new ArrayList<>();
        this.mascotas = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    public void registroUsuarios(String nombreCompleto, String cedula, String telefono, String direccion, String rol) {
        Usuario usuarioRegistrado = new Usuario(nombreCompleto,cedula, telefono, direccion, activo, rol);
        usuarios.add(usuarioRegistrado);
    }

    public void registroMascota(String nombreCompleto, String nombreMascota, String cedula, String telefono, String direccion, String foto, int ranking, String observaciones) {
        DatosMascota nueva = new DatosMascota();
        Mascota mascota = new Mascota(nombreMascota,foto, ranking, observaciones);
        Persona persona = new Persona(nombreCompleto, cedula, telefono, direccion);
        nueva.setMascota(mascota);
        nueva.setPersonas(persona);
        boolean existe = mascotas.contains(nueva);
        if (!existe){
            mascotas.add(nueva);
        }
    }

    public void agendarCita(String mascot, String fecha, String hora, String observacion) {
        Cita nuevaCita = new Cita(mascot,fecha,hora, observacion);
        citas.add(nuevaCita);
    }

    public void hacerReservacion(int numeroReservacion, String nombreAnimal, String diaEntrada, String diaSalida) {
        Reservacion reservacionAgregada = new Reservacion(numeroReservacion, nombreAnimal, diaEntrada, diaSalida);
        reservaciones.add(reservacionAgregada);
    }

    public ArrayList<DatosMascota> lista1 () { return this.mascotas; }

    public ArrayList<Cita>lista2 () {
        return this.citas;
    }

    public ArrayList<Reservacion>lista3 () {
        return this.reservaciones;
    }

}




