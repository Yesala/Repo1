package cr.ac.ucenfotec.EjemploVeterinaria.bl.entidades;

public class Usuario extends Persona {

    private boolean activo;
    private String rol;

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Usuario() {
    }

    public Usuario(String nombreCompleto, String cedula, String telefono, String direccion, boolean activo, String rol) {
        super(nombreCompleto, cedula, telefono, direccion);
        this.activo = activo;
        this.rol = rol;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Estatus=" + activo +
                ", Rol='" + rol + '\'';
    }
}

