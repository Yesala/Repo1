package cr.ac.ucenfotec.EjemploVeterinaria.bl.entidades;

public class Mascota {

        private String nombreMascota;
        private String foto;
        private int ranking;
        private String observaciones;

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Mascota(String nombreMascota, String foto, int ranking, String observaciones) {
        this.nombreMascota = nombreMascota;
        this.foto = foto;
        this.ranking = ranking;
        this.observaciones = observaciones;
    }

    @Override
    public String toString() {
        return "Nombre='" + nombreMascota + '\'' +
                ", Foto='" + foto + '\'' +
                ", Ranking=" + ranking +
                ", Observaciones='" + observaciones + '\'';
    }
}
