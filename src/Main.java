class Main {
    public static void main(String[] args) {
        Rubrica rubrica = new Rubrica();
        Menu menu= new Menu();
        int scelta;
        scelta=menu.scelta();
        while(scelta!=4){
            switch (scelta){
                case 1:
                    Contatto c=new Contatto();
                    rubrica.aggiungiContatto(c);
                    break;
                case 2:
                    String nome = menu.leggiNome();
                    boolean eliminato = rubrica.eliminaContatto(nome);
                    if (eliminato) {
                        System.out.println("Eliminazione avvenuta con successo.");
                    } else {
                        System.out.println("Contatto non trovato.");
                    }
                    break;
                case 3:
                    rubrica.visualizzaRubrica();
                    break;
                default:
                    System.out.println("Scelta non valida.");
            }
            scelta=menu.scelta();
        }
    }
}