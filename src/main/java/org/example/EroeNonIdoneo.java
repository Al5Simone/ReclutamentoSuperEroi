package org.example;

public class EroeNonIdoneo extends Exception {
    private String nomeEroe;
    private int livello;

    public int getLivello() {
        return livello;
    }

    public String getNomeEroe() {
        return nomeEroe;
    }

    public EroeNonIdoneo(int livello, String nomeEroe) {
        super("Livello non sufficiente "+ livello );
        this.livello = livello;
        this.nomeEroe = nomeEroe;
    }
}
