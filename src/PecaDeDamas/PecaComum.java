package PecaDeDamas;

public class PecaComum extends PecaDeDamas {

    public PecaComum(String cor, String posicao) {
        super(cor, posicao);
    }

    @Override
    public String descreverMovimento() {
        return "Peça comum " + getCor() + " em " + getPosicao() + ": move 1 casa para frente na diagonal.";
    }
}
