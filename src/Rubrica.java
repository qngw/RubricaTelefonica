import java.util.Vector;

public class Rubrica {
    private Vector contatti;
    public Rubrica() {
        contatti= new Vector(1, 1);
    }
    public void aggiungiContatto(Contatto c) {
        contatti.add(c);
    }
    public boolean eliminaContatto(String nome) {
        for (int i = 0; i < contatti.size(); i++) {
            Contatto c = (Contatto) contatti.elementAt(i);
            if (c.getNome().equals(nome)) {
                contatti.remove(i);
                return true;
            }
        }
        return false;
    }
    public void visualizzaRubrica() {
        System.out.println("\nRubrica telefonica");
        for (int i = 0; i < contatti.size(); i++) {
            Contatto c = (Contatto) contatti.elementAt(i);
            System.out.println(c);
        }
    }
}
