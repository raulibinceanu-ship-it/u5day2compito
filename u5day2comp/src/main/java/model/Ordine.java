package model;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Ordine {
    private int numeroOrdine;
    private Tavolo tavolo;
    private List<MenuItem> items = new ArrayList<>();
    private StatoOrdine stato;
    private int coperti;
    private LocalTime oraAcquisizione;
    private double costoCoperto;

    public Ordine(int numeroOrdine, Tavolo tavolo, int coperti, double costoCoperto) {
        this.numeroOrdine = numeroOrdine;
        this.tavolo = tavolo;
        this.coperti = coperti;
        this.costoCoperto = costoCoperto;
        this.stato = StatoOrdine.IN_CORSO;
        this.oraAcquisizione = LocalTime.now();
        tavolo.occupa();
    }

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public double getTotale() {
        double totale = coperti * costoCoperto;
        for (MenuItem item : items) {
            totale += item.price;
        }
        return totale;
    }

    @Override
    public String toString() {
        return """
                ORDINE #%d
                Tavolo: %s
                Coperti: %d
                Stato: %s
                Ora: %s
                Totale: €%.2f
                """.formatted(
                numeroOrdine,
                tavolo,
                coperti,
                stato,
                oraAcquisizione,
                getTotale()
        );
    }
}
