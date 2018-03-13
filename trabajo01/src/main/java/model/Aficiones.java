package model;

import java.util.HashSet;
import java.util.Set;

public class Aficiones {

    public enum Interes {
        Cultural, Paisajistico, Deportivo, Comercial, Social, Formacion
    }

    private final Set<Interes> intereses;

    public Aficiones(){
        intereses = new HashSet<>();
    }

    public Set<Interes> getIntereses() {
        return intereses;
    }
}
