package PecaDeDamas;

public class PecaDeDamas {
    private String cor;
    private String posicao;

    public PecaDeDamas(String cor, String posicao) {
        this.setCor(cor);
        this.setPosicao(posicao);
    }

    public String getCor() {
        return cor;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String descreverMovimento() {
        return "A peça " + cor + " em " + posicao + " pode avançar na diagonal.";
    }
}
