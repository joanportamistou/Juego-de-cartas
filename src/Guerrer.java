public class Guerrer extends Entitat implements Interface {


    public Guerrer() {
        super(String nom, int nivell, int vida,Raresa.FISIC);


    }
    @Override
    public void atacar() {
        System.out.println(getNom() + " atacar! Dany: " + Raresa.FISIC);
        usarCartes();
    }

    @Override
    public void defensar(int dany) {

    }

    @Override
    public void utilitzarCartaEspecial(String carta) {

    }

}


