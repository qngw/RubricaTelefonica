import java.util.Vector;

public class Rubrica {
    private Vector contatti;
    public Rubrica() {
        contatti= new Vector(1, 1);
    }
    public void aggiungiContatto(Contatto c) {
        contatti.add(c);
    }
    public void eliminaContatto(int indice) {
        if (indice < 0 || indice >= contatti.size()) {
            System.out.println("Indice non valido.");
            return;
        }
        contatti.remove(indice);
        System.out.println("Eliminazione avvenuta con successo.");
    }
    public void visualizzaRubrica() {
        System.out.println("\nRubrica telefonica");
        for (int i = 0; i < contatti.size(); i++) {
            System.out.print("Posizione " + i + ": ");
            Contatto c = (Contatto) contatti.elementAt(i);
            System.out.println(c);
        }
    }
}
