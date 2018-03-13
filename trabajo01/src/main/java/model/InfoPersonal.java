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
    private final Estudios estudios;
    private final boolean discapacidad;
    private final int costeMax;
    private final boolean capacidadDeportiva;

    public InfoPersonal(int edad, Set<String> idiomas, EstadoCivil estadoCivil, Estudios estudios, boolean discapacidad, int costeMax, boolean capacidadDeportiva) {
        this.edad = edad;
        this.idiomas = idiomas;
        this.estadoCivil = estadoCivil;
        this.estudios = estudios;
        this.discapacidad = discapacidad;
        this.costeMax = costeMax;
        this.capacidadDeportiva = capacidadDeportiva;
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

    public boolean isCapacidadDeportiva() {
        return capacidadDeportiva;
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
                ", capacidadDeportiva=" + capacidadDeportiva +
                '}';
    }
}
