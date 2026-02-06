public class Monstre extends Entitat {
    public Monstre(String nom, int nivell, int puntsVida) {
        super(nom, nivell, puntsVida);
    }
    public void atacar() {
        System.out.println(getNom() + " ataca de forma salvatge!");
        usarCartes();
    }


}

