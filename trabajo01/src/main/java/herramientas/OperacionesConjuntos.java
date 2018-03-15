package herramientas;

import java.util.HashSet;
import model.Aficiones.Interes;

import java.util.Set;

public class OperacionesConjuntos {
	public static HashSet<String> interseccion(Set<String> conjunto1, Set<String> conjunto2) {
		HashSet<String> copiaConjunto1 = new HashSet<String>(conjunto1);
		copiaConjunto1.retainAll(conjunto2);
		return copiaConjunto1;
	}
	
	public static HashSet<Interes> interseccionIntereses(Set<Interes> conjunto1, Set<Interes> conjunto2) {
		HashSet<Interes> copiaConjunto1 = new HashSet<Interes>(conjunto1);
		copiaConjunto1.retainAll(conjunto2);
		return copiaConjunto1;
	}
	
	public static int tamanoConjunto(HashSet<String> conjunto) {
		return conjunto.size();
	}
	
	public static int tamanoConjuntoInteres(Set<Interes> conjunto) {
		return conjunto.size();
	}

}
