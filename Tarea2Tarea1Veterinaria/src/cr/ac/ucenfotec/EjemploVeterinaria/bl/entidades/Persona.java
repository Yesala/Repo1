package cr.ac.ucenfotec.EjemploVeterinaria.bl.entidades;


public class Persona{

        private String nombreCompleto;
        private String cedula;
        private String telefono;
        private String direccion;

        public String getNombreCompleto() {
            return this.nombreCompleto;
        }

        public void setNombreCompleto(String nombreCompleto) {
            this.nombreCompleto = nombreCompleto;
        }

        public String getCedula() {
            return this.cedula;
        }

        public void setCedula(String cedula) {
            this.cedula = cedula;
        }

        public String getTelefono() {
            return telefono;
        }

        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }

        public String getDireccion() {
            return this.direccion;
        }

        public void setDireccion(String direccion) {
            this.direccion = direccion;
        }

        public Persona(String nombreCompleto, String cedula, String telefono, String direccion) {
            this.nombreCompleto = nombreCompleto;
            this.cedula = cedula;
            this.telefono = telefono;
            this.direccion = direccion;
        }

        public Persona() {
        }

    @Override
    public String toString() {
        return "Nombre Completo='" + nombreCompleto + '\'' +
                ", Cédula='" + cedula + '\'' +
                ", Teléfono='" + telefono + '\'' +
                ", Dirección='" + direccion + '\'';
    }
}






