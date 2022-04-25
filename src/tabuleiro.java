import Exceptions.invalidMove;
import peca.peca;
import peca.pecaSimples;

public class tabuleiro {
    /**
     * Matriz de 8x8 de inteiros
     */
    private peca[][] estado = new peca [8][8];
    
    public tabuleiro() throws invalidMove{
        criarpecas();
    }

    public void setposisao(){

    }

    private void criarpecas() throws invalidMove{
        distribuipeca("branca",0,0);
        distribuipeca("branca",1,1);
        distribuipeca("branca",2,0);
        distribuipeca("preta" ,5,1);
        distribuipeca("preta" ,6,0);
        distribuipeca("preta" ,7,1);

        
    }   

    private void distribuipeca(String jogador,int linha, int coluna) throws invalidMove{
        for(int y = coluna; y<8;y+=2){
            estado[linha][y] = new pecaSimples(jogador);
        }
    }

    public void visualizar(){
        for(int i = 7; i > -1; i--){ //                                                                                            branca                                  preta                      nada                 
            for(int a = 0; a < 8; a++) System.out.print((estado[i][a] != null) ? (estado[i][a].getPertecente()!= "preta") ? estado[i][a].getPertecente()+"|": estado[i][a].getPertecente()+" |" : "      |");
        System.out.println();
        }
    }
}
