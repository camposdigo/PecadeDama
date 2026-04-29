package PecaDeDamas;

public class Dama extends PecaDeDamas {

    public Dama(String cor, String posicao) {
        super(cor, posicao);
    }

    @Override
    public String movimentar() {
        return "Dama " + getCor() + " em " + getPosicao()
                + ": percorre varias casas na diagonal.";
    }
}
