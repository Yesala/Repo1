package salazar.yensy.entidades;

public class Mascotas {

    private String nombrePet;
    private String duenoNombre;
    private String observaciones;
    private String ranking;
    private String foto;

    public String getNombrePet() {
        return this.nombrePet;
    }

    public void setNombrePet(String nombrePet){
        this.nombrePet = nombrePet;
    }

    public String getDuenoNombre(){
        return this.duenoNombre;
    }

    public void setDuenoNombre(String duenoNombre){
        this.duenoNombre = duenoNombre;
    }

    public String getObservaciones(){
        return this.observaciones;
    }

    public void setObservaciones(String observaciones){
        this.observaciones = observaciones;
    }

    public String getRanking(){
        return this.ranking;
    }

    public String getFoto(){
        return this.foto;
    }

    public void setFoto(String Foto){
        this.foto = foto;
    }

    @Override
    public String toString(){
        return "Mascota: [Nombre Mascota: " + this.nombrePet + ", Nombre dueño " + this.duenoNombre + ", Observaciones" + this.observaciones + ", Ranking " + this.ranking + ", Foto " + this.foto + "]";

    }

    public Mascotas(String nombrePet, String duenoNombre, String observaciones, String ranking, String foto){
        this.nombrePet= nombrePet;
        this.duenoNombre = duenoNombre;
        this.observaciones = observaciones;
        this.ranking = ranking;
        this.foto = foto;

    }

    public Mascotas(){}

}

