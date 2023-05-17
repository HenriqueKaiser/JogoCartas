package jogocartas;

public abstract class Carta {

    Valor valor;
    Naipe naipe;

    public abstract String descreverCarta();

    public Carta(Valor valor, Naipe naipe) {
        this.valor = valor;
        this.naipe = naipe;
    }

    public Valor getValor() {
        return valor;
    }

    public void setValor(Valor valor) {
        this.valor = valor;
    }

    public Naipe getNaipe() {
        return naipe;
    }

    public void setNaipe(Naipe naipe) {
        this.naipe = naipe;
    }

    public String DescreverCarta() {
        return "Carta " + " valor= " + valor + " naipe= " + naipe;

    }

}
