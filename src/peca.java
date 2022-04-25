public class peca {

    private boolean especial;
    private int x;
    private int y;
    private int pertecente;

    public peca(int x,int y,int pertecente) throws invalidMove{
        setX(x);
        setY(y);
        setPertecente(pertecente);

    }

    public peca(boolean especial,int x,int y,int pertecente) throws invalidMove{
        setX(x);
        setY(y);
        setEspecial(especial);
        setPertecente(pertecente);
    }

    public void setX(int x) throws invalidMove{
        if(x<0 || x>7){throw new invalidMove("posição X invalida(jogador:" + pertecente+" em " + this.x + "," + y);}
        this.x = x;
    }

    public void setY(int y) throws invalidMove{
        if(y<0 || y>7){throw new invalidMove("posição y invalida(jogador:" + pertecente+" em " + this.x + "," + this.y);}
        this.y = y;
    }

    public void setEspecial(boolean especial){
        this.especial = especial;
    }

    public void setPertecente(int pertecente){
        this.pertecente = pertecente; 
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public boolean getEspecial(){
        return especial;
    }

    public int getpertecente(){
        return pertecente;
    }
}
