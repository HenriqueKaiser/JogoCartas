package jogocartas;

public class JogoCartas {

    public static void main(String[] args) {

        Carta Jogo1 = new CartaNormal(Valor.VALETE, Naipe.PAUS);
        Carta Jogo2 = new CartaEspecial("Sete de Ouro", Valor.CINCO, Naipe.ESPADAS);

        System.out.println(Jogo1.DescreverCarta());
        System.out.println(Jogo2.DescreverCarta());
    }

}
