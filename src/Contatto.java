import java.util.Scanner;

public class Contatto {
    private String nome;
    private String telefono;

    public Contatto() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nome: ");
        nome= scanner.nextLine();
        System.out.print("Telefono: ");
        telefono= scanner.nextLine();
    }

    public String getNome() {
        return nome;
    }

    public String toString() {
        return nome + " - " + telefono;
    }
}
