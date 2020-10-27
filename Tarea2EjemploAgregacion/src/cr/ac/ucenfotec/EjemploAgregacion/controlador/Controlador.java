package cr.ac.ucenfotec.EjemploAgregacion.controlador;

import cr.ac.ucenfotec.EjemploAgregacion.bl.entidades.Lista;
import cr.ac.ucenfotec.EjemploAgregacion.bl.entidades.Motor;
import cr.ac.ucenfotec.EjemploAgregacion.bl.entidades.Vehiculo;
import cr.ac.ucenfotec.EjemploAgregacion.bl.logica.Gestor;
import cr.ac.ucenfotec.EjemploAgregacion.iu.IU;

import java.util.ArrayList;

public class Controlador{

    private IU iu = new IU();
    private Gestor gestor = new Gestor();

    public void ejecutarPrograma() {
        int opcion = 0;
        do {
            iu.mostrarMenu();
            opcion = iu.leerOpcion();
            procesarOpcion(opcion);
        } while (opcion != 4);
    }

    private void procesarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                crearListaVehiculos();
                break;
            case 2:
                agregarMotor();
                break;
            case 3:
                listarVehículos();
                break;
            case 4:
                break;
            default:
                iu.imprimirMensaje("Opcion desconocida");
        }
    }

    private void crearListaVehiculos(){
        iu.imprimirMensaje("Introduzca el numero de serie del vehículo");
        String numSerie = iu.leerTexto();
        iu.imprimirMensaje("Ingrese la marca del vehículo");
        String marca = iu.leerTexto();
        Vehiculo nuevo = new Vehiculo(numSerie,marca);
        gestor.agregarVehículo(nuevo);
        iu.imprimirMensaje("Datos de vehículo ingresados");

    }

    private void agregarMotor(){
        iu.imprimirMensaje("Introduzca el numero de serie del motor");
        String serie = iu.leerTexto();
        iu.imprimirMensaje("Ingrese el numero de cilindros");
        String numCilindros = iu.leerTexto();
        iu.imprimirMensaje("Ingrese el numero de serie del vehiculo");
        String numSerie = iu.leerTexto();
        gestor.agregarMotor(serie, numCilindros,numSerie);
        iu.imprimirMensaje("Datos de motor ingresados");
    }

    private void listarVehículos(){
        ArrayList<Lista> listas = gestor.listarVehículos();
        iu.imprimirMensaje("Lista información vehiculos");
        for (int i = 0; i < listas.size(); i++) {
            iu.imprimirMensaje(listas.get(i).toString());
        }
    }
}


