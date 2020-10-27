package cr.ac.ucenfotec.EjemploAgregacion.bl.entidades;

public class Vehiculo {

    private String numSerie;
    private String marca;

    public String getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca; }

    public Vehiculo(String nunmSerie,String marca){
        setNumSerie(nunmSerie);
        setMarca(marca);
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "nunmSerie='" + getNumSerie() + '\'' +
                ", marca='" + getMarca() + '\'' +
                '}';
    }
}
