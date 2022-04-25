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
        distribuipeca(1,0,0);
        distribuipeca(1,1,1);
        distribuipeca(1,2,0);
        distribuipeca(-1,5,1);
        distribuipeca(-1,6,0);
        distribuipeca(-1,7,1);

        
    }   

    private void distribuipeca(int jogador,int linha, int coluna) throws invalidMove{
        for(int y = coluna; y<8;y+=2){
            estado[linha][y] = new peca(linha,y,jogador);
        }
    }

    public void visualizar(){
        for(int i = 0; i < 8; i++){
            for(int a = 0; a < 8; a++) System.out.print((estado[i][a] != null) ? (estado[i][a].getpertecente()!= -1) ? " "+estado[i][a].getpertecente()+"|": estado[i][a].getpertecente()+"|" : " 0|");
        System.out.println();
        }
    }
}
