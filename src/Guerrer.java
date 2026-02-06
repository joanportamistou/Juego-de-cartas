public class Guerrer extends Entitat {


    public Guerrer(int nivell, String nom, int vida) {
        super(nom ,nivell,vida,Raresa.FISIC);


    }
    @Override
    public void atacar() {
        System.out.println(getNom() + " atacar! Dany: " + Raresa.FISIC);
        usarCartes();
    }

}


