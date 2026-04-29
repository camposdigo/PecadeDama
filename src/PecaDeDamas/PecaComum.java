package PecaDeDamas;

public class PecaComum extends PecaDeDamas {

    public PecaComum(String cor, String posicao) {
        super(cor, posicao);
    }

    @Override
    public String movimentar() {
        return "Peca comum " + getCor() + " em " + getPosicao()
                + ": anda uma casa na diagonal para frente.";
    }
}
