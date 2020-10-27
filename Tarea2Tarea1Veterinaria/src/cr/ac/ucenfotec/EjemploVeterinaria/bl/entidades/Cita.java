package cr.ac.ucenfotec.EjemploVeterinaria.bl.entidades;

    public class Cita {
        private String mascot;
        private String fecha;
        private String hora;
        private String observacion;

        public String getMascotita() {
            return this.mascot;
        }

        public void setMascotita(String mascotita) {
            this.mascot = mascotita;
        }

        public String getFecha() {
            return this.fecha;
        }

        public void setFecha(String fecha) {
            this.fecha = fecha;
        }

        public String getHora() {
            return this.hora;
        }

        public void setHora(String hora) {
            this.hora = hora;
        }

        public String getObservacion() {
            return this.observacion;
        }

        public void setObservacion(String observacion) {
            this.observacion = observacion;
        }

        public Cita(String mascot, String fecha, String hora, String observacion) {
            this.mascot = mascot;
            this.fecha = fecha;
            this.hora = hora;
            this.observacion = observacion;
        }

        public Cita() {
        }

        @Override
        public String toString() {
            return "Cita: " +
                    "Nombre de la Mascota='" + mascot + '\'' +
                    ", Fecha Cita='" + fecha + '\'' +
                    ", Hora Cita='" + hora + '\'' +
                    ", Observaciones='" + observacion + '\'' ;
        }

    }

