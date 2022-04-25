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

    private void movimentosPossiveis(){

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
