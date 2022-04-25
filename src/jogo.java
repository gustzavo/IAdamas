import Exceptions.invalidColor;

public class jogo {
    private tabuleiro tabuleir;
    private jogador jogado;
    private jogador inimigo;

    public jogo(tabuleiro tabuleir, String player) throws Exception {
        this.tabuleir = tabuleir;
        if(!player.equals("branca") && !player.equals("preta")) throw new invalidColor("Cor de peça invalida");
        this.jogado = new jogador(player);
        this.inimigo = (player == "branca") ? new jogador("preta"): new jogador("branca");
    }

    private void movimentosPossiveis(){ // ... em si o jogador move a peça dele, entao é para ter uma função lá
                                        // contudo, essa função quem realiza não é 100% ele, entao devo executar aqui?(em jogo)

    }

    private void analisaMovimento(){

    }

    private void PertidaEncerrada(){

    }

    private void moverPeca(){

    }

    private void moviementoInimigo(){

    }

    private void visualizarTabuleiro(){
        tabuleir.visualizar();
    }

    

    
}
