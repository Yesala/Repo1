package cr.ac.ucenfotec.EjemploAgregacion.bl.logica;

import cr.ac.ucenfotec.EjemploAgregacion.bl.entidades.Lista;
import cr.ac.ucenfotec.EjemploAgregacion.bl.entidades.Motor;
import cr.ac.ucenfotec.EjemploAgregacion.bl.entidades.Vehiculo;

import java.util.ArrayList;

public class Gestor {

    private ArrayList<Lista> listas;

    public Gestor() {
        this.listas = new ArrayList<>();
    }

    public void agregarVehículo(Vehiculo vehiculo) {
        Lista nueva = new Lista();
        nueva.setVehiculo(vehiculo);
        listas.add(nueva);
    }

    public void agregarMotor(String serie, String numCilindros, String numSerie) {
        Motor motor = new Motor(serie, numCilindros);
        for (Lista grupoActual : listas) {
            if (grupoActual.getVehiculo().getNumSerie().equals(numSerie)) {
                grupoActual.setMotor(motor);
            }
        }
    }

    public ArrayList<Lista> listarVehículos(){
        return this.listas;
    }

}
