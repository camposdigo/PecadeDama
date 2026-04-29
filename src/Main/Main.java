package Main;

import java.util.ArrayList;
import java.util.List;

import PecaDeDamas.Dama;
import PecaDeDamas.PecaComum;
import PecaDeDamas.PecaDeDamas;

public class Main {
    public static void main(String[] args) {
        List<PecaDeDamas> pecas = new ArrayList<>();

        pecas.add(new PecaDeDamas("Preta", "B2"));
        pecas.add(new PecaComum("Branca", "A1"));
        pecas.add(new Dama("Preta", "D4"));

        for (PecaDeDamas peca : pecas) {
            System.out.println(peca.movimentar());
        }
    }
}
