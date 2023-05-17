package jogocartas;

public class CartaNormal extends Carta {

    public CartaNormal(Valor valor, Naipe naipe) {
        super(valor, naipe);
    }

    @Override
    public String descreverCarta() {
        return "Carta " + "valor= " + valor + " naipe= " + naipe;
    }

}
