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

    public InfoAbstractaCliente(RangoEdad rangoEdad, int nivelEducativo, Riesgo riesgo) {
        this.rangoEdad = rangoEdad;
        this.nivelEducativo = nivelEducativo;
        this.riesgo = riesgo;
    }

    public RangoEdad getRangoEdad() {
        return rangoEdad;
    }

    public void setRangoEdad(RangoEdad rangoEdad) {
        this.rangoEdad = rangoEdad;
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