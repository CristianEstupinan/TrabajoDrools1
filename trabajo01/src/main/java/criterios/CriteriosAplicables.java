package criterios;

public class CriteriosAplicables {

    public static int ACTIVO = 1;
    public static int NOACTIVO = 0;
    public static int NOAPLICABLE = -1;

    public enum Capacidad {
        Deportiva, Idioma, Pago, Intereses
    }

    private int activo;
    private boolean verificado;
    private final Capacidad tipoCriterio;
    private int nComunes = -1; // solo para tipo Intereses

    public CriteriosAplicables(Capacidad tipoCriterio) {
        this.activo = NOACTIVO;
        this.verificado = false;
        this.tipoCriterio = tipoCriterio;
    }

    public int getEstado() {
        return activo;
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

	public void setEstado(int activo) {
		this.activo = activo;
	}

	public void setVerificado(boolean verificado) {
		this.verificado = verificado;
	}
}
