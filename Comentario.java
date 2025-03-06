import java.util.Date;

public class Comentario {
    private Visitante visitante;
    private Stand stand;
    private String comentario;
    private int calificacion;
    private Date fecha;

    public Comentario(Visitante visitante, Stand stand, String comentario, int calificacion) {
        this.visitante = visitante;
        this.stand = stand;
        this.comentario = comentario;
        this.calificacion = calificacion;
        this.fecha = new Date(); // Fecha actual

    }

    public String getDetalleComentario() {
        return visitante.getNombre() + " comentó en Stand " + stand.toString() + ": " +
                comentario + " (" + calificacion + " estrellas)";
    }

    public Visitante getVisitante() {
        return visitante;
    }

    public void setVisitante(Visitante visitante) {
        this.visitante = visitante;
    }

    public Stand getStand() {
        return stand;
    }

    public void setStand(Stand stand) {
        this.stand = stand;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
