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
        System.out.println("Inici de batalla");
        for (Entitat e : personatges) {
            e.atacar();
        }
        System.out.println("Intennt de haqueig");
        personatges.get(0).setPuntsVida(-500);
        System.out.println("Vida després del hack: " + personatges.get(0).getPuntsVida());

        personatges.get(0).setNivell(10);
    }
}


