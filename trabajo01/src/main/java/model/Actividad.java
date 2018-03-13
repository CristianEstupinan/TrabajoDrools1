package model;

import java.util.Set;

import static model.Aficiones.Interes;
import static model.InfoAbstractaCliente.Riesgo;

public class Actividad {

    private final Set<String> idioma;
    private final Set<Interes> tipo;
    private final int costeMax;
    private final boolean necesidadDeportiva;
    private final Riesgo riesgo;

    public Actividad(Set<String> idioma, Set<Interes> tipo, int costeMax, boolean necesidadDeportiva, Riesgo riesgo) {
        this.idioma = idioma;
        this.tipo = tipo;
        this.costeMax = costeMax;
        this.necesidadDeportiva = necesidadDeportiva;
        this.riesgo = riesgo;
    }

    public Set<String> getIdioma() {
        return idioma;
    }

    public Set<Interes> getTipo() {
        return tipo;
    }

    public int getCosteMax() {
        return costeMax;
    }

    public boolean isNecesidadDeportiva() {
        return necesidadDeportiva;
    }

    public Riesgo getRiesgo() {
        return riesgo;
    }
}
