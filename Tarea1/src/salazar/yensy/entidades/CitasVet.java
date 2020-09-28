package salazar.yensy.entidades;

public class CitasVet {

    private String nombrePet;
    private String fechaCita;
    private String horaCita;
    private String observacionesCita;

    public String getNombrePet() {
        return this.nombrePet;
    }

    public void setNombrePet(String nombrePet){
        this.nombrePet = nombrePet;
    }

    public String getfechaCita(){
        return this.fechaCita;
    }

    public void setfechaCita(String fechaCita){
        this.fechaCita = fechaCita;
    }

    public String gethoraCita(){
        return this.horaCita;
    }

    public void sethoraCita(String horaCita){
        this.horaCita = horaCita;
    }

    public String getObservacionesCita(){
        return this.observacionesCita;
    }

    public void setObservacionesCita(String observaciones){
        this.observacionesCita = observaciones;
    }

    @Override
    public String toString(){
        return "Citas: [Nombre Mascota: " + this.nombrePet + ", Fecha Cita " + this.fechaCita + ", Hora Cita " + this.horaCita + ", Observaciones Cita " + this.observacionesCita + "]";

    }

    public CitasVet(String nombrePet, String fechaCita, String horaCita, String observacionesCita){
        this.nombrePet= nombrePet;
        this.fechaCita = fechaCita;
        this.horaCita = horaCita;
        this.observacionesCita = observacionesCita;

    }

    public CitasVet(){}

}

