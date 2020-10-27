package cr.ac.ucenfotec.EjemploAgregacion.bl.entidades;

public class Motor {

    private String serie;
    private String numCilindros;

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getNumCilindros() {
        return numCilindros;
    }

    public void setNumCilindros(String numCilindros) {
        this.numCilindros = numCilindros;
    }

    public Motor (String serie, String numCilindros){
        setSerie(serie);
        setNumCilindros(numCilindros);
    }

    public Motor() {

    }

    @Override
    public String toString() {
        return "Motor{" +
                "serie='" + serie + '\'' +
                ", numCilindros=" + numCilindros +
                '}';
    }

}
