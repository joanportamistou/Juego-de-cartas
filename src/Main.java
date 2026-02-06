import  java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Entitat> personatges = new ArrayList<>();
        Guerrer g = new Guerrer("Jon Snow", 1, 100, 20);
        g.afegirCarta("Atac del tren malalt (-5 vida)");

    }
}