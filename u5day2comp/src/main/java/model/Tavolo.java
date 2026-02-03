package model;

public class Tavolo {
    private int numero;
    private int copertiMax;
    private StatoTavolo stato;

    public Tavolo(int numero, int copertiMax) {
        this.numero = numero;
        this.copertiMax = copertiMax;
        this.stato = StatoTavolo.LIBERO;
    }

    public int getNumero() {
        return numero;
    }

    public StatoTavolo getStato() {
        return stato;
    }

    public void occupa() {
        this.stato = StatoTavolo.OCCUPATO;
    }

    @Override
    public String toString() {
        return "Tavolo " + numero + " (" + stato + ")";
    }
}
