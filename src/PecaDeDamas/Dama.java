package PecaDeDamas;

public class Dama extends PecaDeDamas {

    public Dama(String cor, String posicao) {
        super(cor, posicao);
    }

    @Override
    public String descreverMovimento() {
        return "Dama " + getCor() + " em " + getPosicao() + ": move várias casas em qualquer diagonal.";
    }
}
