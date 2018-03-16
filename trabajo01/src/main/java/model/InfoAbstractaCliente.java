package model;

public class InfoAbstractaCliente {

    public enum RangoEdad{
        Joven, Adulto, Mayor
    }

    public enum Riesgo{
        Bajo, Medio, Alto
    }

    private RangoEdad rangoEdad;
    private int nivelEducativo = -1;
    private Riesgo riesgo;
    private boolean capacidadDeportiva = true;

    public boolean isCapacidadDeportiva() {
		return capacidadDeportiva;
	}

	public void setCapacidadDeportiva(boolean capacidadDeportiva) {
		this.capacidadDeportiva = capacidadDeportiva;
	}

	public InfoAbstractaCliente() {
        
    }

    public RangoEdad getRangoEdad() {
        return rangoEdad;
    }

    public void setRangoEdad(RangoEdad rango) {
        this.rangoEdad = rango;
    }

    public int getNivelEducativo() {
        return nivelEducativo;
    }

    public void setNivelEducativo(int nivelEducativo) {
        if (nivelEducativo >= 0 && nivelEducativo <= 5) this.nivelEducativo = nivelEducativo;
    }

    public Riesgo getRiesgo() {
        return riesgo;
    }

    public void setRiesgo(Riesgo riesgo) {
        this.riesgo = riesgo;
    }
}