package model;

import java.util.Set;

import static model.Aficiones.Interes;
import static model.InfoAbstractaCliente.Riesgo;

public class Actividad {

    private final Set<String> idioma;
    private final Set<Interes> tipo;
    private final int coste;
    private final boolean necesidadDeportiva;
    private final Riesgo riesgo;
    private final String nombre;

    public Actividad(Set<String> idioma, Set<Interes> tipo, int coste, boolean necesidadDeportiva, Riesgo riesgo, String nombre) {
        this.idioma = idioma;
        this.tipo = tipo;
        this.coste = coste;
        this.necesidadDeportiva = necesidadDeportiva;
        this.riesgo = riesgo;
        this.nombre = nombre;
    }

    public Set<String> getIdioma() {
        return idioma;
    }

    public Set<Interes> getTipo() {
        return tipo;
    }

    public int getCoste() {
        return coste;
    }

    public boolean isNecesidadDeportiva() {
        return necesidadDeportiva;
    }

    public Riesgo getRiesgo() {
        return riesgo;
    }

	public String getNombre() {
		return nombre;
	}

}
