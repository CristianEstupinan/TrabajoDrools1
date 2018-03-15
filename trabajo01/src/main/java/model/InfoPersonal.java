package model;

import java.util.Set;

public class InfoPersonal {

    public enum EstadoCivil{
        Soltero, Casado, Divorciado
    }

    public enum Estudios{
        Ninguno, Basico, GradoMedio, GradoSuperior, Universitario
    }

    private final int edad;
    private final Set<String> idiomas;
    private final EstadoCivil estadoCivil;
    private final int nHijos;
    private final Estudios estudios;
    private final boolean discapacidad;
    private final int costeMax;

    public InfoPersonal(int edad, Set<String> idiomas, EstadoCivil estadoCivil,int nHijos,  Estudios estudios, boolean discapacidad, int costeMax) {
        this.edad = edad;
        this.idiomas = idiomas;
        this.estadoCivil = estadoCivil;
        this.estudios = estudios;
        this.discapacidad = discapacidad;
        this.costeMax = costeMax;
        this.nHijos = nHijos;
    }

    public int getNHijos() {
		return nHijos;
	}

	public int getEdad() {
        return edad;
    }

    public Set<String> getIdiomas() {
        return idiomas;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public Estudios getEstudios() {
        return estudios;
    }

    public boolean isDiscapacidad() {
        return discapacidad;
    }

    public int getCosteMax() {
        return costeMax;
    }

    @Override
    public String toString() {
        return "InfoPersonal{" +
                "edad=" + edad +
                ", idiomas=" + idiomas +
                ", estadoCivil=" + estadoCivil +
                ", estudios=" + estudios +
                ", discapacidad=" + discapacidad +
                ", costeMax=" + costeMax +
                '}';
    }
}
