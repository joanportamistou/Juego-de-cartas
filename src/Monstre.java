public class Monstre extends Entitat implements Interface {
    public Monstre(String nom, int nivell, int puntsVida) {
        super(nom, nivell, puntsVida, Raresa.SALVATGE);
    }
    public void atacar() {
        System.out.println(getNom() + " ataca de forma salvatge! ");
        usarCartes();
    }


    @Override
    public void defensar(int dany) {

    }

    @Override
    public void utilitzarCartaEspecial(String carta) {

    }
}

