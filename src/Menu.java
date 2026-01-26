import java.util.Scanner;

public class Menu {
    private Scanner tastiera= new Scanner(System.in);
    private void mostraMenu() {
        System.out.println("1. Aggiungi contatto");
        System.out.println("2. Elimina contatto");
        System.out.println("3. Visualizza Rubrica");
        System.out.println("4. Esci");
    }
    public int scelta(){
        mostraMenu();
        System.out.print("\n-> ");
        return tastiera.nextInt();
    }
    public int leggiIndice(){
        System.out.print("\nContatto da eliminare: ");
        return tastiera.nextInt();
    }
}
