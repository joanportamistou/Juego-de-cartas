public class Guerrer extends Entitat {
    private int resistencia;

    public Guerrer(String nom, int nivell, int vida, int resistencia) {
        super(nom, nivell, vida);
        this.resistencia = resistencia;
    }

    public void atacar() {
        System.out.println(getNom() + " ataca amb força física!");
    }
}


