package criterios;

import java.util.Date;

import model.Actividad;
import model.Cliente;

public class PropuestaActividad {

    private final Actividad actividad;
    private final Cliente cliente;
    private final Date date;
    private boolean decision = false;

    public PropuestaActividad(Actividad actividad, Cliente cliente, Date date) {
        this.actividad = actividad;
        this.cliente = cliente;
        this.date = date;
    }

    public Actividad getActividad() {
        return actividad;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Date getDate() {
        return date;
    }

	public boolean isDecision() {
		return decision;
	}

	public void aprobar() {
		this.decision = true;
	}
    
}
