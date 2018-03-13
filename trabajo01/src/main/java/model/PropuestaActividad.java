package model;

import java.util.Date;

public class PropuestaActividad {

    private final Actividad actividad;
    private final Cliente cliente;
    private final Date date;

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
}
