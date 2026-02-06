import  java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Entitat> personatges = new ArrayList<>();
        Guerrer g = new Guerrer("Jon Snow", 1, 100, 20);
        g.afegirCarta("Atac del tren malalt (-5 vida)");
        personatges.add(g);
        personatges.add(new Ma("Gandi", 1, 80, 100));
        personatges.add(new Monstre("Godzilla", 1, 50));
        System.out.println("=== INICI DE LA BATALLA ===");
        for (Entitat e : personatges) {
            e.atacar();
        }
    }
}