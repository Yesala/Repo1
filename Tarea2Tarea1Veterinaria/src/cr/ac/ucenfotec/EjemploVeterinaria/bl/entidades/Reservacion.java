package cr.ac.ucenfotec.EjemploVeterinaria.bl.entidades;

public class Reservacion {

        private int numeroReservacion;
        private String nombreAnimal;
        private String diaEntrada;
        private String diaSalida;

        public int getNumeroReservacion() {
            return this.numeroReservacion;
        }

        public void setNumeroReservacion(int numeroReservacion) {
            this.numeroReservacion = numeroReservacion;
        }

        public String getNombreAnimal() {
            return this.nombreAnimal;
        }

        public void setNombreAnimal(String nombreAnimal) {
            this.nombreAnimal = nombreAnimal;
        }

        public String getDiaEntrada() {
            return this.diaEntrada;
        }

        public void setDiaEntrada(String diaEntrada) {
            this.diaEntrada = diaEntrada;
        }

        public String getDiaSalida() {
            return this.diaSalida;
        }

        public void setDiaSalida(String diaEntrada) {
            this.diaSalida = diaSalida;
        }

        public Reservacion(int numeroReservacion, String nombreAnimal, String diaEntrada, String diaSalida) {
            this.numeroReservacion = numeroReservacion;
            this.nombreAnimal = nombreAnimal;
            this.diaEntrada = diaEntrada;
            this.diaSalida = diaSalida;
        }

        public Reservacion() {
        }

    @Override
    public String toString() {
        return "Número de Reservacion:" + numeroReservacion +
                ", Nombre Mascota: '" + nombreAnimal + '\'' +
                ", Día de Entrada:'" + diaEntrada + '\'' +
                ", Día de Salida:'" + diaSalida + '\'';
    }
}


