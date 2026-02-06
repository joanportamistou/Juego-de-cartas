public class Guerrer extends Entitat {


    public Guerrer(int nivell, String nom, int vida) {
        super(nom ,nivell,vida);


    }

    public void atacar() {
        System.out.println(getNom() + " atacar!");
    }
}


