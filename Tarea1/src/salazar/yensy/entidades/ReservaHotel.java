package salazar.yensy.entidades;

public class ReservaHotel {

    private String nombrePet;
    private String fechaEntrada;
    private String fechaSalida;

    public String getNombrePet() {
        return this.nombrePet;
    }

    public void setNombrePet(String nombrePet){
        this.nombrePet = nombrePet;
    }

    public String getfechaEntrada(){
        return this.fechaEntrada;
    }

    public void setfechaEntrada(String fechaEntrada){
        this.fechaEntrada = fechaEntrada;
    }

    public String getfechaSalida(){
        return this.fechaSalida;
    }

    public void setfechaSalida(String fechaSalida){
        this.fechaSalida = fechaSalida;
    }

    @Override
    public String toString(){
        return "Hotel: [Nombre Mascota: " + this.nombrePet + ", Fecha Ingreso " + this.fechaEntrada + ", Fecha Salida " + this.fechaSalida + "]";
    }

    public ReservaHotel(String nombre, String fechaEntrada, String fechaSalida){
        this.nombrePet= nombrePet;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;

    }

    public ReservaHotel(){}

}

