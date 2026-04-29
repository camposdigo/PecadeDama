package Main;

import java.util.ArrayList;
import java.util.List;

import PecaDeDamas.Dama;
import PecaDeDamas.PecaComum;
import PecaDeDamas.PecaDeDamas;

public class Main {
    public static void main(String[] args) {
        List<PecaDeDamas> pecas = new ArrayList<>();

        pecas.add(new PecaDeDamas("Branca", "C3"));
        pecas.add(new PecaComum("Preta", "B4"));
        pecas.add(new Dama("Branca", "F6"));

        System.out.println("=== Teste de Polimorfismo no jogo de damas ===");
        for (PecaDeDamas peca : pecas) {
            System.out.println(peca.descreverMovimento());
        }
    }
}
