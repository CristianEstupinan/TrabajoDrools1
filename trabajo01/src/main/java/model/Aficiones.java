package model;

import java.util.HashSet;
import java.util.Set;
import java.util.Collection;

public class Aficiones {

    public enum Interes {
        Cultural, Paisajistico, Deportivo, Comercial, Social, Formacion
    }

    private final Set<Interes> intereses;

    public Aficiones(){
        intereses = new HashSet<>();
    }
    
    public Aficiones(Collection<Interes> col) {
    	this.intereses = new HashSet<Interes>(col);
    }

    public Set<Interes> getIntereses() {
        return intereses;
    }
}
