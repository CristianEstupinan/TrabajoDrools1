package criterios;

public class CriteriosAplicables {

    public static int ACTIVO = 1;
    public static int NOACTIVO = 0;
    public static int NOAPLICABLE = -1;

    public enum Capacidad {
        Deportiva, Idioma, Pago, Intereses
    }

    private int estado;
    private boolean verificado;
    private Capacidad tipoCriterio;
    private int nComunes = -1; // solo para tipo Intereses

    public CriteriosAplicables(Capacidad tipoCriterio) {
        this.estado = NOACTIVO;
        this.verificado = false;
        this.tipoCriterio = tipoCriterio;
    }

    public int getEstado() {
        return estado;
    }

    public boolean isVerificado() {
        return verificado;
    }

    public Capacidad getTipoCriterio() {
        return tipoCriterio;
    }

    public int getnComunes() {
        return nComunes;
    }
}
