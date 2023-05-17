package jogocartas;

public class CartaEspecial extends Carta {

    public String coringa;

    public CartaEspecial(String coringa, Valor valor, Naipe naipe) {
        super(valor, naipe);
        this.coringa = coringa;
    }

    public String getCoringa() {
        return coringa;
    }

    public void setCoringa(String coringa) {
        this.coringa = coringa;
    }

    @Override
    public String descreverCarta() {
        return DescreverCarta();
    }

}
