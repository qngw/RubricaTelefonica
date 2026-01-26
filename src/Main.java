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
                    int indice=menu.leggiIndice();
                    rubrica.eliminaContatto(indice);
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