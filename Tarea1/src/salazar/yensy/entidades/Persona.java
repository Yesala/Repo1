package salazar.yensy.entidades;

public class Persona {

    private String nombre;
    private int cedula;
    private int telefono;
    private String direccion;
    private String rol;
    private String estado;

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getCedula(){
        return this.cedula;
    }

    public void setCedula(int cedula){
        this.cedula = cedula;
    }

    public int getTelefono(){
        return this.telefono;
    }

    public void setTelefono(int telefono){
        this.telefono = telefono;
    }

    public String getDireccion(){
        return this.direccion;
    }

    public void setDireccion(String direccion){
        this.direccion = direccion;
    }

    public String getRol(){
        return this.rol;
    }

    public void setRol(String rol){
        this.rol = rol;
    }

    public String getEstado(){
        return this.estado;
    }

    public void setEstado(String estado){
        this.estado = estado;
    }

    @Override
    public String toString(){
        return "Persona: [Nombre Persona: " + this.nombre + ", Cédula " + this.cedula + ", Teléfono " + this.telefono + ", Dirección " + this.direccion + ", Rol " + this.rol + ", Estado " + this.estado + "]";
    }

    public Persona(String nombre, int cedula, int telefono, String direccion, String rol, String estado){
        this.nombre= nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.direccion = direccion;
        this.rol = rol;
        this.estado = estado;

    }

    public Persona(){}

}

