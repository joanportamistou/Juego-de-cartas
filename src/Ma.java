public class Ma extends Entitat {
    private int puntsMagia;

    public Ma(String nom, int nivell, int vida, int mana) {
        super(nom, nivell, vida);
        this.puntsMagia = puntsMagia;
    }
    public void atacar() {
        System.out.println(getNom() + " llança un encanteri màgic usant els seus punts de màgia");
        usarCartes();
    }


    public int getPuntsMagia() {
        return puntsMagia;
    }
    public void setPuntsMagia(int puntsMagia) {
        this.puntsMagia = puntsMagia;
    }
}

