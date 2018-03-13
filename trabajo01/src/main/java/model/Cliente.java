package model;

public class Cliente {


    private final InfoPersonal infoPersonal;
    private final Aficiones aficiones;
    private final InfoAbstractaCliente infoAbstracta;


    public Cliente(InfoPersonal infoPersonal, Aficiones aficiones, InfoAbstractaCliente infoAbstracta) {
        this.infoPersonal = infoPersonal;
        this.aficiones = aficiones;
        this.infoAbstracta = infoAbstracta;
    }

    public InfoPersonal getInfoPersonal() {
        return infoPersonal;
    }

    public Aficiones getAficiones() {
        return aficiones;
    }

    public InfoAbstractaCliente getInfoAbstracta() {
        return infoAbstracta;
    }

    @Override
    public String toString() {
        return infoPersonal.toString();
    }
}
