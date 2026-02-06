import java.util.ArrayList;
public abstract class Entitat {
    private String nom ;
    private int nivell;
    private int puntsVida;
    private ArrayList<String> cartesEspecials = new ArrayList<>();

    public Entitat(String nom, int nivell, int puntsVida) {
        this.nom = nom;
        this.nivell = nivell;
        this.puntsVida = puntsVida;
    }
    public String getNom() { return nom; }

    public int getNivell() { return nivell; }

    public void setNivell(int n) {

        if (n == this.nivell + 1) {
            this.nivell = n;
        } else {
            System.out.println("ERROR: El nivell només pot pujar d'1 en 1.");
        }
    }

    public int getPuntsVida() { return puntsVida; }

    public void setPuntsVida(int v) {

        this.puntsVida = Math.max(v, 0);
    }


    public void rebreDany(int quantitat) {
        setPuntsVida(this.puntsVida - quantitat);
        System.out.println(nom + " ha rebut " + quantitat + " de dany. Vida restant: " + puntsVida);
    }

    public void afegirCarta(String carta) {
        if (cartesEspecials.size() < 10) cartesEspecials.add(carta);
    }

    protected void usarCartes() {
        for (String carta : cartesEspecials) {
            System.out.println(" -> S'activa carta especial: " + carta [cite: 49]);
        }
    }
    public abstract void atacar();
}


