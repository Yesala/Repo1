package cr.ac.ucenfotec.EjemploAgregacion.bl.entidades;

public class Lista {

    private Vehiculo vehiculo;
    private Motor motor;

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Lista() {
    }

    public Lista(Vehiculo vehiculo, Motor motor) {
        this.vehiculo = vehiculo;
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Lista{" +
                "vehiculo=" + vehiculo +
                ", motor=" + motor +
                '}';
    }
}
