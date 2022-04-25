package peca;
public abstract class peca {

    public String pertecente;  // Branca(1) ou Preta(-1) 

    public peca(String pertecente){
        this.pertecente = pertecente;
    }

    public String getPertecente() {
        return pertecente;
    }

    public void setPertecente(String pertecente) {
        this.pertecente = pertecente;
    }

}